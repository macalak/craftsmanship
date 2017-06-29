package ite;

import org.apache.commons.cli.*;

public class Main{
	public static void main(String[] args){

		System.out.println("Hallo from Main!");
		Option help = new Option( "help", "print this message" );
		Options options = new Options();
		options.addOption( help );
		CommandLineParser parser = new PosixParser();
		try {
			CommandLine line = parser.parse( options, args );
			if(line.hasOption("help")) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("simple", options);
			}
		}
		catch( ParseException exp ) {
			System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
		}
	}
}