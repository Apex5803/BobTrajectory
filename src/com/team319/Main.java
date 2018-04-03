package com.team319;

import com.team254.lib.trajectory.WaypointSequence.Waypoint;
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
		powerUpConfig.max_acc = 12.0;
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
		//switchConfig.max_vel = 6.0;
		switchConfig.max_acc = 10.0;
		
		longDistanceConfig = new SrxTranslatorConfig(switchConfig);
		longDistanceConfig.max_vel = 12.0;
		longDistanceConfig.max_acc = 14.0;

		CrossScaleConfig = new SrxTranslatorConfig(switchConfig);
		CrossScaleConfig.max_vel = 12.0;
		CrossScaleConfig.max_acc = 10.0;
		
		//generateMisc(powerUpConfig);
		generateCenterSwitch(powerUpConfig);
		generateRightSide(longDistanceConfig);
//		generateLeftSide(powerUpConfig);
		
		copyArcsToRobotCode();
		//copyPathsToRobotCode();
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
//		TuningTestAuto.addWaypointRelative(0.0, 10.0, 0.0);
		
		BobPath TuningTestAutoBackward = new BobPath(config, "TuningTestAutoBackward", 1);
		TuningTestAutoBackward.addWaypoint(TuningTestAuto.getLastWaypoint());
		TuningTestAutoBackward.addWaypointRelative(0.0, -10.0, 0.0);
		TuningTestAutoBackward.addWaypointRelative(-4.0, -5.0, -89.99);
		
		BobPath StraightForwardTuning = new BobPath(config, "StraightForwardTuning", -1);
		StraightForwardTuning.addWaypoint(rightSideStartingWaypoint);
		StraightForwardTuning.addWaypointRelative(223.0/12.0, 0.0, 0.0);
		
		BobPathGenerator.exportArcToJavaFile(ThreeFeet);
		BobPathGenerator.exportArcToJavaFile(OneFoot);
		BobPathGenerator.exportArcToJavaFile(FiveFeetAndTurn);
		BobPathGenerator.exportArcToJavaFile(CrossTheLine);
		BobPathGenerator.exportArcToJavaFile(TestSTurnAuto);
		BobPathGenerator.exportArcToJavaFile(FifteenFeet);
		BobPathGenerator.exportArcToJavaFile(FifteenFeetReverse);
		BobPathGenerator.exportArcToJavaFile(BackwardsThreeFeet);
		BobPathGenerator.exportArcToJavaFile(TuningTestAuto);
//		BobPathGenerator.exportArcToJavaFile(TuningTestAutoBackward);
		BobPathGenerator.exportArcToJavaFile(StraightForwardTuning);
		
	}

	private static void generateCenterSwitch(SrxTranslatorConfig config) {

		// --------------------RIGHT SIDE AUTOS----------//
		BobPath CenterToRightSwitch = new BobPath(config, "CenterToRightSwitch", 1); // 3 seconds
		CenterToRightSwitch.addWaypoint(centerStartingWaypoint);
		CenterToRightSwitch.addWaypointRelative(1.5, -2.5, 89.9);
		CenterToRightSwitch.addWaypointRelative(3, -1, 89.9);

		BobPath CenterToRightSwitchPt2 = new BobPath(config, "CenterToRightSwitchPt2", -1); // 4 seconds
		CenterToRightSwitchPt2.addWaypoint(CenterToRightSwitch.getLastWaypoint());
		CenterToRightSwitchPt2.addWaypointRelative(-6.375, 4.0, 0.0);// 45

		BobPath CenterToRightSwitchPt3 = new BobPath(config, "CenterToRightSwitchPt3", 1);
		CenterToRightSwitchPt3.addWaypoint(CenterToRightSwitchPt2.getLastWaypoint());
		CenterToRightSwitchPt3.addWaypointRelative(3.5, 0.0, 0.0);

		BobPath CenterToRightSwitchPt4 = new BobPath(config, "CenterToRightSwitchPt4", -1);
		CenterToRightSwitchPt4.addWaypoint(CenterToRightSwitchPt3.getLastWaypoint());
		CenterToRightSwitchPt4.addWaypointRelative(-4.19, 0.0, 0.0);

		BobPath CenterToRightSwitchPt5 = new BobPath(config, "CenterToRightSwitchPt5", 1);
		CenterToRightSwitchPt5.addWaypoint(CenterToRightSwitchPt4.getLastWaypoint());
		CenterToRightSwitchPt5.addWaypointRelative(6.375, -4.0, 0.0);
		
		BobPath CenterToRightScale = new BobPath(config, "CenterToRightScale", 1);
		CenterToRightScale.addWaypoint(CenterToRightSwitchPt4.getLastWaypoint());
		CenterToRightScale.addWaypointRelative(6.375, -8.0, -45.0);

		// --------------------LEFT SIDE AUTOS----------//

		BobPath CenterToLeftSwitch = new BobPath(config, "CenterToLeftSwitch", 1);
		CenterToLeftSwitch.addWaypoint(centerStartingWaypoint);
		CenterToLeftSwitch.addWaypointRelative(2, 3, 89.9);
		CenterToLeftSwitch.addWaypointRelative(4.25, 1.5, 89.9);

		BobPath CenterToLeftSwitchPt2 = new BobPath(config, "CenterToLeftSwitchPt2", -1);
		CenterToLeftSwitchPt2.addWaypoint(CenterToLeftSwitch.getLastWaypoint());
		CenterToLeftSwitchPt2.addWaypointRelative(-6.375, -5.0, 0.0);// -45

		BobPath CenterToLeftSwitchPt3 = new BobPath(config, "CenterToLeftSwitchPt3", 1);
		CenterToLeftSwitchPt3.addWaypoint(CenterToLeftSwitchPt2.getLastWaypoint());
		CenterToLeftSwitchPt3.addWaypointRelative(3.0, 0.0, 0.0);

		BobPath CenterToLeftSwitchPt4 = new BobPath(config, "CenterToLeftSwitchPt4", -1);
		CenterToLeftSwitchPt4.addWaypoint(CenterToLeftSwitchPt3.getLastWaypoint());
		CenterToLeftSwitchPt4.addWaypointRelative(-4.10, 0.0, 0.0);

		BobPath CenterToLeftSwitchPt5 = new BobPath(config, "CenterToLeftSwitchPt5", 1);
		CenterToLeftSwitchPt5.addWaypoint(CenterToLeftSwitchPt4.getLastWaypoint());
		CenterToLeftSwitchPt5.addWaypointRelative(6.375, 4.0, 0.0);
		
		BobPath CenterToLeftScale = new BobPath(config, "CenterToLeftScale", 1);
		CenterToLeftScale.addWaypoint(CenterToLeftSwitchPt4.getLastWaypoint());
		CenterToLeftScale.addWaypointRelative(6.375, 8.0, 45.0);

		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitch);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt2);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt3);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt4);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightSwitchPt5);
//		BobPathGenerator.exportArcToJavaFile(CenterToRightScale);

//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitch);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt2);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt3);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt4);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftSwitchPt5);
//		BobPathGenerator.exportArcToJavaFile(CenterToLeftScale);

	}

	private static void generateRightSide(SrxTranslatorConfig config) {

		BobPath ScaleRightStartRight = new BobPath(config, "ScaleRightStartRight", -1);
		ScaleRightStartRight.addWaypoint(rightSideStartingWaypoint);
		ScaleRightStartRight.addWaypointRelative(21.0, -1.0, 0.0);
		ScaleRightStartRight.addWaypointRelative(3.75, -3, -89.9);
		//RightWallToRightScale.addWaypointRelative(22.5, 0.0, 0.0);
		
		BobPath ScaleLeftStartRight = new BobPath(CrossScaleConfig, "ScaleLeftStartRight", -1);
		ScaleLeftStartRight.addWaypoint(rightSideStartingWaypoint);
		ScaleLeftStartRight.addWaypointRelative(12.0, 0.0, 0.0);
		ScaleLeftStartRight.addWaypointRelative(4.25, 5, 89.9);
		
		BobPath ScaleLeftStartRightpt2 = new BobPath(CrossScaleConfig, "ScaleLeftStartRightpt2", -1);
//		ScaleLeftStartRightpt2.addWaypoint(ScaleLeftStartRight.getLastWaypoint());
		ScaleLeftStartRightpt2.addWaypoint(0, 0, 0.0);
		ScaleLeftStartRightpt2.addWaypointRelative(10, 0, 0.0);
//		ScaleLeftStartRightpt2.addWaypointRelative(2.75, 4, -89.9);
//		ScaleLeftStartRightpt2.addWaypointRelative(4, 3, 89.9);

//		BobPathGenerator.exportArcToJavaFile(ScaleRightStartRight);
		BobPathGenerator.exportArcToJavaFile(ScaleLeftStartRight);
		BobPathGenerator.exportArcToJavaFile(ScaleLeftStartRightpt2);

		
	}

	private static void generateLeftSide(SrxTranslatorConfig config) {

		BobPath LeftWallToLeftScale = new BobPath(config, "LeftWallToLeftScale", -1);
		LeftWallToLeftScale.addWaypoint(leftSideStartingWaypoint);
		LeftWallToLeftScale.addWaypointRelative(12.0, -1.0, -10.0);
		LeftWallToLeftScale.addWaypointRelative(10.5, -2.5, 10.0);

		BobPath ScaleToSwitchCubeLeftSide = new BobPath(config, "ScaleToSwitchCubeLeftSide", 1);
		ScaleToSwitchCubeLeftSide.addWaypoint(LeftWallToLeftScale.getLastWaypoint());
		ScaleToSwitchCubeLeftSide.addWaypointRelative(-5.0, -1.0, 0.0);//-5.0 to -6.0 derrick 3/27
		
		BobPath SwitchCubeToScaleLeftSide = new BobPath(config, "SwitchCubeToScaleLeftSide", -1);
		SwitchCubeToScaleLeftSide.addWaypoint(ScaleToSwitchCubeLeftSide.getLastWaypoint());
		SwitchCubeToScaleLeftSide.addWaypointRelative(5.0, 1.0, 0.0);//5.0 to 6.0 derrick 3/27

		BobPath LeftWallToLeftSwitch = new BobPath(config, "LeftWallToLeftSwitch", -1);
		LeftWallToLeftSwitch.addWaypoint(leftSideStartingWaypoint);
		LeftWallToLeftSwitch.addWaypointRelative(17.0, 1.0, 30.0);

		BobPath LeftWallToLeftSwitchPt2 = new BobPath(config, "LeftWallToLeftSwitchPt2", 1);
		LeftWallToLeftSwitchPt2.addWaypoint(LeftWallToLeftSwitch.getLastWaypoint());
		LeftWallToLeftSwitchPt2.addWaypointRelative(2.0, 1.0, 30.0);

		BobPath LeftWallToRightSide = new BobPath(config, "LeftWallToRightSide", -1);
		LeftWallToRightSide.addWaypoint(leftSideStartingWaypoint);
		LeftWallToRightSide.addWaypointRelative(13.0, 0.0, 0.0);
		LeftWallToRightSide.addWaypointRelative(3.0, -3.5, -89.99);
		
		BobPath LeftWallToRightScale = new BobPath(config, "LeftWallToRightScale", -1);
		LeftWallToRightScale.addWaypoint(leftSideStartingWaypoint);
		LeftWallToRightScale.addWaypointRelative(11.5, 0.0, 0.0);
		LeftWallToRightScale.addWaypointRelative(4.0, -5.0, -89.99);
		LeftWallToRightScale.addWaypointRelative(0.0, -9.0, 0.0);//-7.0 ->-9.0 derrick 3/27
		LeftWallToRightScale.addWaypointRelative(6.0, -4.0, 89.99);//6.0 -> 5.0 derrick 3/27

		BobPathGenerator.exportArcToJavaFile(LeftWallToLeftScale);
		BobPathGenerator.exportArcToJavaFile(ScaleToSwitchCubeLeftSide);
		BobPathGenerator.exportArcToJavaFile(SwitchCubeToScaleLeftSide);
		BobPathGenerator.exportArcToJavaFile(LeftWallToLeftSwitch);
		BobPathGenerator.exportArcToJavaFile(LeftWallToLeftSwitchPt2);
		BobPathGenerator.exportArcToJavaFile(LeftWallToRightSide);
		BobPathGenerator.exportArcToJavaFile(LeftWallToRightScale);
	}
	
	private static void copyArcsToRobotCode() {
		BobPathGenerator.copyFilesToRelativeDirectory("Arcs", "C:\\Users\\Apex5803\\eclipse-workspace\\robot5803\\src\\org\\usfirst\\frc\\team5803\\robot\\arcs");
	}
	
	private static void copyPathsToRobotCode() {
		BobPathGenerator.copyFilesToRelativeDirectory("Paths", "C:\\Users\\Apex5803\\eclipse-workspace\\robot5803\\src\\org\\usfirst\\frc\\team5803\\robot\\paths");
	}
	
}