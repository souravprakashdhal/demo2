package com.example.ConnectionFactory;


import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.MySQLConnection;


@Service
public class DataSourceConnection {
	

public void getCon()
{
    try{

    	MySQLConnection mysql=null;
        javax.sql.DataSource ds=null;
        Hashtable env = new Hashtable();
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
      Context context=new InitialContext( env );
      //you will need to have create a Data Source with JNDI name testDS
      ds=(javax.sql.DataSource) context.lookup ("com.spd.datasource");
      if(ds != null)
    	  System.out.println("DataSource Found");
      
      mysql=(MySQLConnection) ds.getConnection();
      
    }
    catch(Exception e)
    {
    	
    }
	
	
	/*@Bean
	public DataSource getDataSource() throws NamingException
	{
		Hashtable env = new Hashtable();
		env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        
        
        
        return (DataSource) new JndiTemplate().lookup("com.spd.datasource");
		
		
	}*/

}}
