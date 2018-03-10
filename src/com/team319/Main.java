package com.team319;

import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.trajectory.io.VelocityOnlyFileSerializer;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.BobPathGenerator;
import com.team319.trajectory.SrxTranslator;
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
		standardConfig.max_acc = 10.0;
		standardConfig.max_jerk = 60.0;
		standardConfig.max_vel = 6.0; // started at 4.0, // gearbob was 6.0
		standardConfig.wheelbase_width_feet = 45.0/12.0;
		standardConfig.wheel_dia_inches = 3.5;
		standardConfig.scale_factor = 3.8; //0.899 // gearbob is 2.35
		standardConfig.encoder_ticks_per_rev = 256; //1024
		
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 6.0 ; // 4.0;
		
		BobPath DriveForwardFiveFeet = new BobPath(standardConfig, "DriveForwardFiveFeet", 1);
		DriveForwardFiveFeet.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		DriveForwardFiveFeet.addWaypoint(new WaypointSequence.Waypoint(5.0, 0, Math.toRadians(0)));
		
		BobPath DriveForwardTwelveFeet = new BobPath(standardConfig, "DriveForwardTwelveFeet", 1);
		DriveForwardTwelveFeet.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		DriveForwardTwelveFeet.addWaypoint(new WaypointSequence.Waypoint(12.0, 0, Math.toRadians(0)));
		
		BobPath SwitchLeft = new BobPath(standardConfig, "SwitchLeft", 1);
		SwitchLeft.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchLeft.addWaypoint(new WaypointSequence.Waypoint(9.0, 5.0, Math.toRadians(0)));
		
		BobPath SwitchRight= new BobPath(standardConfig, "SwitchRight", 1);
		SwitchRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchRight.addWaypoint(new WaypointSequence.Waypoint(10.0, -3.0, Math.toRadians(10)));

		BobPath SwitchLeftStartLeft = new BobPath(standardConfig, "SwitchLeftStartLeft", 1);
		SwitchLeftStartLeft.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchLeftStartLeft.addWaypoint(new WaypointSequence.Waypoint(9.0, 5.0, Math.toRadians(0)));
		
		BobPath SwitchLeftStartRight = new BobPath(standardConfig, "SwitchLeftStartRight", 1);
		SwitchLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(9.0, 5.0, Math.toRadians(0)));
		
		BobPath ScaleLeft= new BobPath(standardConfig, "ScaleLeft", -1);
		ScaleLeft.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleLeft.addWaypoint(new WaypointSequence.Waypoint(9.0, 12.0, Math.toRadians(0)));
		ScaleLeft.addWaypoint(new WaypointSequence.Waypoint(20.0, 12.0, Math.toRadians(0)));		
		ScaleLeft.addWaypoint(new WaypointSequence.Waypoint(26.75, 18.0, Math.toRadians(89.9)));		
		
		BobPath ScaleRight= new BobPath(standardConfig, "ScaleRight", -1);
		ScaleRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleRight.addWaypoint(new WaypointSequence.Waypoint(10.0, -8.0, Math.toRadians(0)));
		ScaleRight.addWaypoint(new WaypointSequence.Waypoint(21.0, -8.0, Math.toRadians(0)));		
		ScaleRight.addWaypoint(new WaypointSequence.Waypoint(28.75, -12.0, Math.toRadians(-89.9)));
		
		BobPath ScaleLeftStartLeft = new BobPath(standardConfig, "ScaleLeftStartLeft", -1);
		ScaleLeftStartLeft.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleLeftStartLeft.addWaypoint(new WaypointSequence.Waypoint(20, 0, 0));
		ScaleLeftStartLeft.addWaypoint(new WaypointSequence.Waypoint(24.75, 4.5, Math.toRadians(89.9)));
		
		
		BobPath ScaleRightStartLeft= new BobPath(standardConfig, "ScaleRightStartLeft", -1);
		ScaleRightStartLeft.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleRightStartLeft.addWaypoint(new WaypointSequence.Waypoint(14.0, 0.0, Math.toRadians(0)));
		ScaleRightStartLeft.addWaypoint(new WaypointSequence.Waypoint(18.67, -6.0, Math.toRadians(-89.9)));
		ScaleRightStartLeft.addWaypoint(new WaypointSequence.Waypoint(18.67, -15.5, Math.toRadians(-89.9)));
		ScaleRightStartLeft.addWaypoint(new WaypointSequence.Waypoint(20.67, -16.0, Math.toRadians(-1.0)));
		ScaleRightStartLeft.addWaypoint(new WaypointSequence.Waypoint(27.0, -20.0, Math.toRadians(-89.9)));
		
		BobPath ScaleLeftStartRight= new BobPath(standardConfig, "ScaleLeftStartRight", -1);
		ScaleLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(14.0, 0.0, Math.toRadians(0)));
		ScaleLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(18.67, 6.0, Math.toRadians(89.9)));
		ScaleLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(18.67, 15.5, Math.toRadians(89.9)));
		ScaleLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(20.67, 16.0, Math.toRadians(1.0)));
		ScaleLeftStartRight.addWaypoint(new WaypointSequence.Waypoint(27.0, 20.0, Math.toRadians(89.9)));
		
		BobPath ScaleRightStartRight= new BobPath(standardConfig, "ScaleRightStartRight", -1);
		ScaleRightStartRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleRightStartRight.addWaypoint(new WaypointSequence.Waypoint(20, 0, 0));
		ScaleRightStartRight.addWaypoint(new WaypointSequence.Waypoint(24.75, -4.5, Math.toRadians(-89.9)));
		
		BobPath ScaleLeftNearCube= new BobPath(standardConfig, "ScaleLeftNearCube", -1);
		ScaleLeftNearCube.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleLeftNearCube.addWaypoint(new WaypointSequence.Waypoint(4, -2, Math.toRadians(-45)));
		ScaleLeftNearCube.addWaypoint(new WaypointSequence.Waypoint(10.67, -7, Math.toRadians(-89.9)));

		BobPath ScaleLeftFarCube= new BobPath(standardConfig, "ScaleLeftFarCube", -1);
		ScaleLeftFarCube.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		ScaleLeftFarCube.addWaypoint(new WaypointSequence.Waypoint(3, -1, Math.toRadians(45)));
		ScaleLeftFarCube.addWaypoint(new WaypointSequence.Waypoint(10.67, -19, Math.toRadians(-89.9)));

		BobPath SwitchRightFromRight= new BobPath(standardConfig, "SwitchRightFromRight", 1);
		SwitchRightFromRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchRightFromRight.addWaypoint(new WaypointSequence.Waypoint(8.0, 0, Math.toRadians(0)));
		SwitchRightFromRight.addWaypoint(new WaypointSequence.Waypoint(12.0, 4, Math.toRadians(89.9)));
		
		BobPath SwitchLeftFromLeft= new BobPath(standardConfig, "SwitchLeftFromLeft", 1);
		SwitchLeftFromLeft.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchLeftFromLeft.addWaypoint(new WaypointSequence.Waypoint(8.0, 0, Math.toRadians(0)));
		SwitchLeftFromLeft.addWaypoint(new WaypointSequence.Waypoint(12, -4, Math.toRadians(89.9)));
		
		BobPath SwitchLeftFromRight= new BobPath(standardConfig, "SwitchLeftFromRight", 1);
		SwitchLeftFromRight.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		SwitchLeftFromRight.addWaypoint(new WaypointSequence.Waypoint(19.0, 3, Math.toRadians(-89.9)));

		
		//BobPathGenerator.exportPath("Paths", SwitchLeft);
		//BobPathGenerator.exportPath("Paths", SwitchRight);
		//BobPathGenerator.exportPath("Paths", ScaleLeft);
		//BobPathGenerator.exportPath("Paths", ScaleRight);
		//BobPathGenerator.exportPath("Paths", ScaleLeftStartLeft);
		//BobPathGenerator.exportPath("Paths", ScaleRightStartLeft);
		//BobPathGenerator.exportPath("Paths", ScaleLeftStartRight);
		//BobPathGenerator.exportPath("Paths", ScaleRightStartRight);
		//BobPathGenerator.exportPath("Paths", DriveForwardFiveFeet);
		//BobPathGenerator.exportPath("Paths", DriveForwardTwelveFeet);
		BobPathGenerator.exportPath("Paths", SwitchLeftFromLeft); 
		BobPathGenerator.exportPath("Paths", SwitchRightFromRight); 
		
		
		
		//BobPathGenerator.appendAndExportPaths("Paths", "appendedPath", false, blueHopperThenShootAutoLeftSidePt2, toAppend);
		//BobPathGenerator.appendAndExportPaths("Paths", "appendedAndFlippedPath", true, blueHopperThenShootAutoLeftSidePt2, toAppend); 
		//redGear.exportPathWithSerializer(new VelocityOnlyFileSerializer(), "Paths");
	}
}



