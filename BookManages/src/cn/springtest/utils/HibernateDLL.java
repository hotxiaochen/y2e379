package cn.springtest.utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class HibernateDLL {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SchemaExport schemaExport = new SchemaExport(cfg);
		schemaExport.create(true, true);
	}
}
