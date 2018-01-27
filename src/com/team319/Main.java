package com.team319;

import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.trajectory.io.VelocityOnlyFileSerializer;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.BobPathGenerator;
import com.team319.trajectory.SrxTranslatorConfig;

/**
 * Forked from 254's 2014 Trajectory library just a comment to make a change
 * Then forked from 319's Trajectory library.
 * @author Jared341
 * @author ttremblay
 * @author Apex5803
 */
public class Main {

	public static void main(String[] args) {
		//SrxTranslator translator = new SrxTranslator();
		SrxTranslatorConfig standardConfig = new SrxTranslatorConfig();
		
		//Standard configs between all trajectories
		standardConfig.name = "StandardConfig";
		standardConfig.dt = .01;
		standardConfig.max_acc = 5.00;
		standardConfig.max_jerk = 60.0;
		standardConfig.max_vel = 4.0; // started at 4.0, // gearbob was 6.0
		standardConfig.wheelbase_width_feet = 32.5/12.0;
		standardConfig.wheel_dia_inches = 3.5;
		standardConfig.scale_factor = 2.0; //0.899 // gearbob is 2.35
		standardConfig.encoder_ticks_per_rev = 256; //1024
		
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 3.0 ; // 4.0;
		
		
		
		BobPath FiveFeet = new BobPath(standardConfig, "FiveFeet", 1);
		FiveFeet.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		FiveFeet.addWaypoint(new WaypointSequence.Waypoint(5.0, 0.0, Math.toRadians(0.0)));
		
		
		
		
		BobPath OneFoot = new BobPath(standardConfig, "OneFoot", 1);
		OneFoot.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		OneFoot.addWaypoint(new WaypointSequence.Waypoint(1.0, 0.0, Math.toRadians(0.0)));
		
	

				BobPathGenerator.exportPath("Paths", FiveFeet);
				//BobPathGenerator.exportPath("Paths", OneFoot);
			
		
		//BobPathGenerator.appendAndExportPaths("Paths", "appendedPath", false, blueHopperThenShootAutoLeftSidePt2, toAppend);
		//BobPathGenerator.appendAndExportPaths("Paths", "appendedAndFlippedPath", true, blueHopperThenShootAutoLeftSidePt2, toAppend); 
		//redGear.exportPathWithSerializer(new VelocityOnlyFileSerializer(), "Paths");
	}
}
