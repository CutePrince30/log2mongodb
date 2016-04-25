package org.jeremy.app.log2mongodb;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("MongoDB");

		logger.info("{'provinceCode': null, 'channelSubCode': null, 'platFormCode': '002', 'optCode': null, 'startTimeLong': 1384599600000, 'processTime_sum': 10081,'count': 404, 'suc_count': 0,'suc_rate': '0.00000'}");

	}

}
