package edu.iris.dmc.station.converter;

import edu.iris.dmc.station.Application;

public class FileTest {

	public static void main(String[] args) throws Exception {

		// args=new String[]
		// {"--output","/Users/Suleiman/converted.xml","--input","/Users/Suleiman/dataless/II_NNA.20180906T205825.dataless"};

		args = new String[] { "--input", "/Users/Suleiman/IM_DATALESS_I58_infrasound_BDF_20170524.dataless", "--output",
				"/Users/Suleiman/IM_DATALESS_I58_infrasound_BDF_20170524.dataless.xml", "--verbose" };

		Application app = new Application();
		app.main(args);

		args = new String[] { "--output", "/Users/Suleiman/xmlIM_DATALESS_I58_infrasound_BDF_20170524.dataless",
				"--input", "/Users/Suleiman/IM_DATALESS_I58_infrasound_BDF_20170524.dataless.xml", "--verbose" };

		app = new Application();
		app.main(args);

		args = new String[] { "--input", "/Users/Suleiman/xmlIM_DATALESS_I58_infrasound_BDF_20170524.dataless", "--output",
				"/Users/Suleiman/IM_DATALESS_I58_infrasound_BDF_20170524.dataless2.xml", "--verbose" };

		app = new Application();
		app.main(args);

	}

}
