package com.hipishare.products;

import org.apache.log4j.Logger;
import org.restexpress.RestExpress;
import org.restexpress.util.Environment;

import com.hipishare.products.serialization.SerializationProvider;
import com.hipishare.products.utils.SpringContextUtil;


/**
 * The main entry-point into the RestExpress Echo example services.
 * 
 * @author toddf
 * @since Aug 31, 2009
 */
public class Main
{
	private static final Logger LOGGER = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws Exception
	{
		// 设置默认的序列化
		RestExpress.setDefaultSerializationProvider(new SerializationProvider());
		// 加载环境配置
		String[] params = {};
		Configuration config = Environment.load(params, Configuration.class);
		RestExpress server = new RestExpress()
		    .setName(config.getName())// 服务名
		    .setPort(config.getPort());// 服务端口

		SpringContextUtil.initSpringConfig();// spring容器初始化
		
		Routes.define(server);// 设置服务路由

		if (config.getWorkerCount() > 0)
		{
			server.setIoThreadCount(config.getWorkerCount());
		}

		if (config.getExecutorThreadCount() > 0)
	    {
	    	server.setExecutorThreadCount(config.getExecutorThreadCount());
	    }
		
		mapExceptions(server);
		server.bind();
		LOGGER.info("product_server服务启动成功...");
		server.awaitShutdown();
	}

	/**
     * @param server
     */
    private static void mapExceptions(RestExpress server)
    {
//    	server
//    	.mapException(ItemNotFoundException.class, NotFoundException.class)
//    	.mapException(DuplicateItemException.class, ConflictException.class)
//    	.mapException(ValidationException.class, BadRequestException.class);
    }
    
}
