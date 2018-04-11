package com.team319;

import com.team254.lib.trajectory.WaypointSequence.Waypoint;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.BobPathGenerator;
import com.team319.trajectory.SrxTranslator;
import com.team319.trajectory.SrxTranslatorConfig;

/**
 * Forked from 254's 2014 Trajectory library just a comment to make a change
 * Then forked from 319's Trajectory library.
 * 
 * @author Jared341
 * @author ttremblay
 * @author Apex5803
 */
public class Main {

	/**
	 * @param args
	 */

	public static double robotTotalWidthFeet = 33.0 / 12.0;
	public static double robotTotalLengthFeet = 39.0 / 12.0;

	public static Waypoint rightSideStartingWaypoint = new Waypoint(robotTotalLengthFeet / 2, 45.5 / 12.0, 0);
	public static Waypoint leftSideStartingWaypoint = new Waypoint(robotTotalLengthFeet / 2, 277.8 / 12.0, 0);
	public static Waypoint centerStartingWaypoint = new Waypoint(robotTotalLengthFeet / 2, 157.0 / 12.0, 0);

	public static SrxTranslatorConfig powerUpConfig;
	public static SrxTranslatorConfig switchConfig;
	public static SrxTranslatorConfig longDistanceConfig;
	public static SrxTranslatorConfig CrossScaleConfig;

	public static void main(String[] args) {

		powerUpConfig = new SrxTranslatorConfig();
		powerUpConfig.name = "powerUpConfig";
		powerUpConfig.dt = .01;
		powerUpConfig.max_acc = 10.0;
		powerUpConfig.max_jerk = 60.0;
		powerUpConfig.max_vel = 10.0; // 8.0
		powerUpConfig.wheelbase_width_feet = 22.5 / 12.0;
		powerUpConfig.wheel_dia_inches = 6.0;
		powerUpConfig.scale_factor = 1.0;
		powerUpConfig.encoder_ticks_per_rev = 4096;
		powerUpConfig.robotLength = 38.5;
		powerUpConfig.robotWidth = 33.5;
		powerUpConfig.highGear = true;

		switchConfig = new SrxTranslatorConfig(powerUpConfig);
		switchConfig.max_vel = 8.0;
		switchConfig.max_acc = 8.0;

		longDistanceConfig = new SrxTranslatorConfig(powerUpConfig);
		longDistanceConfig.max_vel = 12.0;
		longDistanceConfig.max_acc = 14.0;

		CrossScaleConfig = new SrxTranslatorConfig(powerUpConfig);
		CrossScaleConfig.max_vel = 10.0;
		CrossScaleConfig.max_acc = 10.0;

//		generateMisc(powerUpConfig);
//		generateCenterSwitch(switchConfig);
		generateRightSide(longDistanceConfig);
		generateLeftSide(longDistanceConfig);

		copyArcsToRobotCode();
		// copyPathsToRobotCode();
	}

	private static void generateMisc(SrxTranslatorConfig config) {
		// --------------------MISC. AUTOS----------//

		BobPath ThreeFeet = new BobPath(config, "ThreeFeet", 1);
		ThreeFeet.addWaypoint(0.0, 0.0, 0.0);
		ThreeFeet.addWaypoint(3.0, 0.0, 0.0);

		BobPath OneFoot = new BobPath(config, "OneFoot", 1);
		OneFoot.addWaypoint(0.0, 0.0, 0.0);
		OneFoot.addWaypoint(1.0, 0.0, 0.0);

		BobPath FiveFeetAndTurn = new BobPath(config, "FiveFeetAndTurn", 1);
		FiveFeetAndTurn.addWaypoint(0.0, 0.0, 0.0);
		FiveFeetAndTurn.addWaypoint(5.0, 5.0, 89.99);

		BobPath CrossTheLine = new BobPath(config, "CrossTheLine", 1);
		CrossTheLine.addWaypoint(0.0, 0.0, 0.0);
		CrossTheLine.addWaypoint(10.0, 0.0, 0.0);

		BobPath TestSTurnAuto = new BobPath(config, "TestSTurnAuto", 1);
		TestSTurnAuto.addWaypoint(0.0, 0.0, 0.0);
		TestSTurnAuto.addWaypoint(8.375, 5.5, 0.0);

		BobPath FifteenFeet = new BobPath(config, "FifteenFeet", 1);
		FifteenFeet.addWaypoint(0.0, 0.0, 0.0);
		FifteenFeet.addWaypoint(15.0, 0.0, 0.0);

		BobPath FifteenFeetReverse = new BobPath(config, "FifteenFeetReverse", -1);
		FifteenFeetReverse.addWaypoint(0.0, 0.0, 0.0);
		FifteenFeetReverse.addWaypoint(15.0, 0.0, 0.0);

		BobPath BackwardsThreeFeet = new BobPath(config, "BackwardsThreeFeet", -1);
		BackwardsThreeFeet.addWaypoint(0.0, 0.0, 0.0);
		BackwardsThreeFeet.addWaypoint(3.0, 0.0, 0.0);

		BobPath TuningTestAuto = new BobPath(config, "TuningTestAuto", 1);
		TuningTestAuto.addWaypoint(centerStartingWaypoint);
		TuningTestAuto.addWaypointRelative(5.0, 0.0, 0.0);
		// TuningTestAuto.addWaypointRelative(0.0, 10.0, 0.0);

		BobPath TuningTestAutoBackward = new BobPath(config, "TuningTestAutoBackward", 1);
		TuningTestAutoBackward.addWaypoint(TuningTestAuto.getLastWaypoint());
		TuningTestAutoBackward.addWaypointRelative(0.0, -10.0, 0.0);
		TuningTestAutoBackward.addWaypointRelative(-4.0, -5.0, -89.99);

		BobPath StraightForwardTuning = new BobPath(config, "StraightForwardTuning", -1);
		StraightForwardTuning.addWaypoint(rightSideStartingWaypoint);
		StraightForwardTuning.addWaypointRelative(223.0 / 12.0, 0.0, 0.0);

//		 BobPathGenerator.exportArcToJavaFile(ThreeFeet);
//		 BobPathGenerator.exportArcToJavaFile(OneFoot);
//		 BobPathGenerator.exportArcToJavaFile(FiveFeetAndTurn);
//		 BobPathGenerator.exportArcToJavaFile(CrossTheLine);
//		 BobPathGenerator.exportArcToJavaFile(TestSTurnAuto);
//		 BobPathGenerator.exportArcToJavaFile(FifteenFeet);
//		 BobPathGenerator.exportArcToJavaFile(FifteenFeetReverse);
//		 BobPathGenerator.exportArcToJavaFile(BackwardsThreeFeet);
//		 BobPathGenerator.exportArcToJavaFile(TuningTestAuto);
//		 BobPathGenerator.exportArcToJavaFile(TuningTestAutoBackward);
//		 BobPathGenerator.exportArcToJavaFile(StraightForwardTuning);

	}

	private static void generateCenterSwitch(SrxTranslatorConfig config) {

		// --------------------RIGHT SIDE AUTOS----------//
		BobPath CenterToRightSwitch = new BobPath(config, "CenterToRightSwitch", 1); // 3 seconds
		CenterToRightSwitch.addWaypoint(centerStartingWaypoint);
		// CenterToRightSwitch.addWaypointRelative(1.5, -1.5, -70);
		// CenterToRightSwitch.addWaypointRelative(5, -1.5, 70);
		CenterToRightSwitch.addWaypointRelative(8.5, -4.0, 0);

		BobPath CenterToRightSwitchPt2 = new BobPath(config, "CenterToRightSwitchPt2", -1); // 4 seconds
		CenterToRightSwitchPt2.addWaypoint(CenterToRightSwitch.getLastWaypoint());
		CenterToRightSwitchPt2.addWaypointRelative(-6.375, 5.0, 0.0);// 45

		BobPath CenterToRightSwitchPt3 = new BobPath(config, "CenterToRightSwitchPt3", 1);
		CenterToRightSwitchPt3.addWaypoint(CenterToRightSwitchPt2.getLastWaypoint());
		CenterToRightSwitchPt3.addWaypointRelative(3.5, 0.0, 0.0);

		BobPath CenterToRightSwitchPt4 = new BobPath(config, "CenterToRightSwitchPt4", -1);
		CenterToRightSwitchPt4.addWaypoint(CenterToRightSwitchPt3.getLastWaypoint());
		CenterToRightSwitchPt4.addWaypointRelative(4.19, 0.0, 0.0);

		BobPath CenterToRightSwitchPt5 = new BobPath(config, "CenterToRightSwitchPt5", 1);
		CenterToRightSwitchPt5.addWaypoint(CenterToRightSwitchPt4.getLastWaypoint());
		CenterToRightSwitchPt5.addWaypointRelative(6.75, -4.0, 0.0);

		// --------------------LEFT SIDE AUTOS----------//

		BobPath CenterToLeftSwitch = new BobPath(config, "CenterToLeftSwitch", 1);
		CenterToLeftSwitch.addWaypoint(centerStartingWaypoint);
		CenterToLeftSwitch.addWaypointRelative(9.5, 5.5, 0);
		// CenterToLeftSwitch.addWaypointRelative(2, 3, 89.9);
		// CenterToLeftSwitch.addWaypointRelative(4.25, 1.5, 89.9);

		BobPath CenterToLeftSwitchPt2 = new BobPath(config, "CenterToLeftSwitchPt2", -1);
		CenterToLeftSwitchPt2.addWaypoint(CenterToLeftSwitch.getLastWaypoint());
		CenterToLeftSwitchPt2.addWaypointRelative(-4, -5.5, 0.0);// -45

		BobPath CenterToLeftSwitchPt3 = new BobPath(config, "CenterToLeftSwitchPt3", 1);
		CenterToLeftSwitchPt3.addWaypoint(CenterToLeftSwitchPt2.getLastWaypoint());
		CenterToLeftSwitchPt3.addWaypointRelative(3, 0, 0.0);

		BobPath CenterToLeftSwitchPt4 = new BobPath(config, "CenterToLeftSwitchPt4", -1);
		CenterToLeftSwitchPt4.addWaypoint(CenterToLeftSwitchPt3.getLastWaypoint());
		CenterToLeftSwitchPt4.addWaypointRelative(-4.5, 0.0, 0.0);

		BobPath CenterToLeftSwitchPt5 = new BobPath(config, "CenterToLeftSwitchPt5", 1);
		CenterToLeftSwitchPt5.addWaypoint(CenterToLeftSwitchPt4.getLastWaypoint());
		CenterToLeftSwitchPt5.addWaypointRelative(8, 6.0, 0.0);

//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitch);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt2);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt3);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt4);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt5);

		//BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitch);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt2);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt3);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt4);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt5);

	}

	private static void generateRightSide(SrxTranslatorConfig config) {

		BobPath ScaleRightStartRight = new BobPath(config, "ScaleRightStartRight", -1);
		ScaleRightStartRight.addWaypoint(rightSideStartingWaypoint);
		ScaleRightStartRight.addWaypointRelative(21.0, -0.5, 0.0);
		ScaleRightStartRight.addWaypointRelative(3.75, -3, -89.9);
		
		BobPath ScaleRightStartRightpt2 = new BobPath(config, "ScaleRightStartRightpt2", 1);
		ScaleRightStartRightpt2.addWaypoint(ScaleRightStartRight.getLastWaypoint());
		ScaleRightStartRightpt2.addWaypointRelative(-3, 3, 89.9);
		ScaleRightStartRightpt2.addWaypointRelative(-5, 4, 0);
		
		BobPath ScaleRightStartRightpt3 = new BobPath(config, "ScaleRightStartRightpt3", -1);
		ScaleRightStartRightpt3.addWaypoint(ScaleRightStartRightpt2.getLastWaypoint());
		ScaleRightStartRightpt3.addWaypointRelative(3, -3, 89.9);
		ScaleRightStartRightpt3.addWaypointRelative(5, -4, 0);

		BobPath ScaleLeftStartRight = new BobPath(CrossScaleConfig, "ScaleLeftStartRight", -1);
		ScaleLeftStartRight.addWaypoint(rightSideStartingWaypoint);
		ScaleLeftStartRight.addWaypointRelative(9.0, -1.0, 0.0);
		ScaleLeftStartRight.addWaypointRelative(6.25, 5, 79.9);
		ScaleLeftStartRight.addWaypointRelative(1, 10, 0);
		ScaleLeftStartRight.addWaypointRelative(5, 4, -59.9);
		ScaleLeftStartRight.addWaypointRelative(4, 5, 69.9);

		BobPath StartRightFiftyFifty = new BobPath(CrossScaleConfig, "StartRightFiftyFifty", -1);
		StartRightFiftyFifty.addWaypoint(rightSideStartingWaypoint);
		StartRightFiftyFifty.addWaypointRelative(9.0, -1.0, 0.0);
		StartRightFiftyFifty.addWaypointRelative(6.25, 5, 79.9);

//		BobPathGenerator.exportArcToJavaFile(ScaleRightStartRight);
//		BobPathGenerator.exportArcToJavaFile(ScaleRightStartRightpt2);
//		BobPathGenerator.exportArcToJavaFile(ScaleRightStartRightpt3);
//		BobPathGenerator.exportArcToJavaFile(ScaleLeftStartRight);
//		BobPathGenerator.exportArcToJavaFile(StartRightFiftyFifty);
	}

	private static void generateLeftSide(SrxTranslatorConfig config) {

		BobPath ScaleLeftStartLeft = new BobPath(config, "ScaleLeftStartLeft", -1);
		ScaleLeftStartLeft.addWaypoint(leftSideStartingWaypoint);
		ScaleLeftStartLeft.addWaypointRelative(19.0, 0.0, 0.0);
		ScaleLeftStartLeft.addWaypointRelative(3.75, 3, 89.9);
		
		BobPath ScaleLeftStartLeftpt2 = new BobPath(config, "ScaleLeftStartLeftpt2", 1);
		ScaleLeftStartLeftpt2.addWaypoint(ScaleLeftStartLeft.getLastWaypoint());
		ScaleLeftStartLeftpt2.addWaypointRelative(-3.0, -3.0, 89.9);
		ScaleLeftStartLeftpt2.addWaypointRelative(-4, -4, 0);

		BobPath ScaleLeftStartLeftpt3 = new BobPath(config, "ScaleLeftStartLeftpt3", -1);
		ScaleLeftStartLeftpt3.addWaypoint(ScaleLeftStartLeftpt2.getLastWaypoint());
		ScaleLeftStartLeftpt3.addWaypointRelative(3, 3.0, 0.0);
		ScaleLeftStartLeftpt3.addWaypointRelative(5, 4.0, -89.9);

		BobPath ScaleRightStartLeft = new BobPath(CrossScaleConfig, "ScaleRightStartLeft", -1);
		ScaleRightStartLeft.addWaypoint(leftSideStartingWaypoint);
		ScaleRightStartLeft.addWaypointRelative(10.0, 1.0, 0.0);
		ScaleRightStartLeft.addWaypointRelative(6.25, -5, -79.9);
		ScaleRightStartLeft.addWaypointRelative(1, -10, 0);
		ScaleRightStartLeft.addWaypointRelative(5, -4, 59.9);
		ScaleRightStartLeft.addWaypointRelative(4, -4, -69.9);

		BobPath StartLeftFiftyFifty = new BobPath(config, "StartLeftFiftyFifty", -1);
		StartLeftFiftyFifty.addWaypoint(leftSideStartingWaypoint);
		StartLeftFiftyFifty.addWaypointRelative(10, 1.0, 0.0);
		StartLeftFiftyFifty.addWaypointRelative(6.25, -5, -79.9);

		BobPathGenerator.exportArcToJavaFile(ScaleLeftStartLeft);
		BobPathGenerator.exportArcToJavaFile(ScaleLeftStartLeftpt2);
		BobPathGenerator.exportArcToJavaFile(ScaleLeftStartLeftpt3);
		BobPathGenerator.exportArcToJavaFile(ScaleRightStartLeft);

		BobPathGenerator.exportArcToJavaFile(StartLeftFiftyFifty);
	}

	private static void copyArcsToRobotCode() {
		BobPathGenerator.copyFilesToRelativeDirectory("Arcs",
				"C:\\Users\\Apex5803\\eclipse-workspace\\robot5803\\src\\org\\usfirst\\frc\\team5803\\robot\\arcs");
	}

	private static void copyPathsToRobotCode() {
		BobPathGenerator.copyFilesToRelativeDirectory("Paths",
				"C:\\Users\\Apex5803\\eclipse-workspace\\robot5803\\src\\org\\usfirst\\frc\\team5803\\robot\\paths");
	}

}