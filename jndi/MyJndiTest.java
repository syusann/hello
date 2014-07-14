package ccm.jndi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.fail;

public class MyJndiTest {
	@BeforeClass
	public static void setUpClass() throws Exception {
		// rcarver - setup the jndi context and the datasource
		try {
			// Create initial context
			System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
					"org.apache.naming.java.javaURLContextFactory");
			System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
			InitialContext ic = new InitialContext();

			ic.createSubcontext("java:");
			ic.createSubcontext("java:/comp");
			ic.createSubcontext("java:/comp/env");
			ic.createSubcontext("java:/comp/env/jdbc");

			// Construct DataSource
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/world");
			ds.setUsername("sa");
			ds.setPassword("1234");

			ic.bind("java:/comp/env/jdbc/mysql", ds);
			ic.bind("java:/comp/env/jdbc/abc", ds);
		} catch (NamingException ex) {
			ex.printStackTrace();
			fail("ffff");
		}

	}

	@Test
	public void testJndi() {
		try {

			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:/comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/mysql");
			// DataSource ds = (DataSource)
			// cx.lookup("java:/comp/env/jdbc/mysql");

			Connection conn = ds.getConnection();
			Statement stmt = conn.createStatement();

			ResultSet rset = stmt.executeQuery("SELECT * FROM country");

			while (rset.next()) {
				System.out.println("<<<\t" + rset.getObject(1).toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail("ttt");
		}

	}

	@Test
	public void testContext() {
		try {

			InitialContext ctx = new InitialContext();
			NamingEnumeration<NameClassPair> list = ctx.list("");
			while (list.hasMore()) {
				System.out.println(list.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail("vvv");
		}

	}
}
