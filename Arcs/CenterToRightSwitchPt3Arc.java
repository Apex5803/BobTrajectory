package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CenterToRightSwitchPt3Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (3.63,13.08,0.00)
	// (7.13,13.08,0.00)
	
    public CenterToRightSwitchPt3Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt3Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.078,1.562,10.000,0.000},
				{0.390,4.686,10.000,0.000},
				{1.093,9.372,10.000,0.000},
				{2.343,15.619,10.000,0.000},
				{4.295,23.429,10.000,0.000},
				{7.107,32.800,10.000,0.000},
				{10.933,43.734,10.000,0.000},
				{15.932,56.229,10.000,0.000},
				{22.257,70.286,10.000,0.000},
				{30.067,85.906,10.000,0.000},
				{39.517,103.087,10.000,0.000},
				{50.762,121.830,10.000,0.000},
				{63.961,142.135,10.000,0.000},
				{79.267,164.002,10.000,0.000},
				{96.839,187.431,10.000,0.000},
				{116.832,212.421,10.000,0.000},
				{139.401,238.974,10.000,0.000},
				{164.705,267.088,10.000,0.000},
				{192.897,296.765,10.000,0.000},
				{224.136,328.003,10.000,0.000},
				{258.498,359.242,10.000,0.000},
				{295.984,390.480,10.000,0.000},
				{336.594,421.719,10.000,0.000},
				{380.328,452.957,10.000,0.000},
				{427.185,484.196,10.000,0.000},
				{477.167,515.434,10.000,0.000},
				{530.272,546.672,10.000,0.000},
				{586.501,577.911,10.000,0.000},
				{645.854,609.149,10.000,0.000},
				{708.331,640.388,10.000,0.000},
				{773.932,671.626,10.000,0.000},
				{842.656,702.864,10.000,0.000},
				{914.505,734.103,10.000,0.000},
				{989.477,765.341,10.000,0.000},
				{1067.573,796.580,10.000,0.000},
				{1148.793,827.818,10.000,0.000},
				{1233.137,859.057,10.000,0.000},
				{1320.604,890.295,10.000,0.000},
				{1411.196,921.533,10.000,0.000},
				{1504.911,952.772,10.000,0.000},
				{1601.750,984.010,10.000,0.000},
				{1701.713,1015.249,10.000,0.000},
				{1804.800,1046.487,10.000,0.000},
				{1911.010,1077.725,10.000,0.000},
				{2020.345,1108.964,10.000,0.000},
				{2132.725,1138.640,10.000,0.000},
				{2247.995,1166.755,10.000,0.000},
				{2365.998,1193.308,10.000,0.000},
				{2486.578,1218.298,10.000,0.000},
				{2609.580,1241.727,10.000,0.000},
				{2734.846,1263.594,10.000,0.000},
				{2862.220,1283.899,10.000,0.000},
				{2991.547,1302.642,10.000,0.000},
				{3122.671,1319.823,10.000,0.000},
				{3255.434,1335.442,10.000,0.000},
				{3389.681,1349.500,10.000,0.000},
				{3525.256,1361.995,10.000,0.000},
				{3662.002,1372.929,10.000,0.000},
				{3799.763,1382.300,10.000,0.000},
				{3938.384,1390.110,10.000,0.000},
				{4077.707,1396.357,10.000,0.000},
				{4217.577,1401.043,10.000,0.000},
				{4357.838,1404.167,10.000,0.000},
				{4498.332,1405.729,10.000,0.000},
				{4638.899,1405.610,10.000,0.000},
				{4779.376,1403.930,10.000,0.000},
				{4919.607,1400.688,10.000,0.000},
				{5059.436,1395.884,10.000,0.000},
				{5198.706,1389.518,10.000,0.000},
				{5337.261,1381.590,10.000,0.000},
				{5474.946,1372.100,10.000,0.000},
				{5611.603,1361.048,10.000,0.000},
				{5747.077,1348.434,10.000,0.000},
				{5881.212,1334.258,10.000,0.000},
				{6013.851,1318.521,10.000,0.000},
				{6144.838,1301.221,10.000,0.000},
				{6274.017,1282.360,10.000,0.000},
				{6401.232,1261.936,10.000,0.000},
				{6526.326,1239.951,10.000,0.000},
				{6649.144,1216.404,10.000,0.000},
				{6769.529,1191.295,10.000,0.000},
				{6887.325,1164.624,10.000,0.000},
				{7002.376,1136.391,10.000,0.000},
				{7114.525,1106.596,10.000,0.000},
				{7223.623,1075.357,10.000,0.000},
				{7329.596,1044.119,10.000,0.000},
				{7432.446,1012.880,10.000,0.000},
				{7532.172,981.642,10.000,0.000},
				{7628.775,950.404,10.000,0.000},
				{7722.253,919.165,10.000,0.000},
				{7812.608,887.927,10.000,0.000},
				{7899.839,856.688,10.000,0.000},
				{7983.945,825.450,10.000,0.000},
				{8064.928,794.212,10.000,0.000},
				{8142.788,762.973,10.000,0.000},
				{8217.523,731.735,10.000,0.000},
				{8289.135,700.496,10.000,0.000},
				{8357.622,669.258,10.000,0.000},
				{8422.986,638.019,10.000,0.000},
				{8485.226,606.781,10.000,0.000},
				{8544.342,575.543,10.000,0.000},
				{8600.335,544.304,10.000,0.000},
				{8653.203,513.066,10.000,0.000},
				{8702.948,481.827,10.000,0.000},
				{8749.569,450.589,10.000,0.000},
				{8793.066,419.350,10.000,0.000},
				{8833.439,388.112,10.000,0.000},
				{8870.688,356.874,10.000,0.000},
				{8904.814,325.635,10.000,0.000},
				{8935.821,294.515,10.000,0.000},
				{8963.795,264.957,10.000,0.000},
				{8988.891,236.961,10.000,0.000},
				{9011.265,210.527,10.000,0.000},
				{9031.074,185.654,10.000,0.000},
				{9048.474,162.344,10.000,0.000},
				{9063.621,140.595,10.000,0.000},
				{9076.671,120.409,10.000,0.000},
				{9087.781,101.784,10.000,0.000},
				{9097.106,84.722,10.000,0.000},
				{9104.803,69.221,10.000,0.000},
				{9111.028,55.282,10.000,0.000},
				{9115.938,42.905,10.000,0.000},
				{9119.687,32.090,10.000,0.000},
				{9122.434,22.837,10.000,0.000},
				{9124.333,15.146,10.000,0.000},
				{9125.541,9.016,10.000,0.000},
				{9126.214,4.449,10.000,0.000},
				{9126.509,1.444,10.000,0.000},
				{9126.581,0.000,10.000,0.000},
				{9126.581,0.000,10.000,0.000}		};

}