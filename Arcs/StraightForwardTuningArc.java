package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class StraightForwardTuningArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (20.21,3.79,0.00)
	
    public StraightForwardTuningArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public StraightForwardTuningArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.078,-1.552,10.000,0.000},
				{-0.388,-4.656,10.000,0.000},
				{-1.086,-9.313,10.000,0.000},
				{-2.328,-15.521,10.000,0.000},
				{-4.268,-23.282,10.000,0.000},
				{-7.062,-32.595,10.000,0.000},
				{-10.865,-43.460,10.000,0.000},
				{-15.832,-55.877,10.000,0.000},
				{-22.118,-69.846,10.000,0.000},
				{-29.879,-85.368,10.000,0.000},
				{-39.269,-102.441,10.000,0.000},
				{-50.445,-121.067,10.000,0.000},
				{-63.560,-141.245,10.000,0.000},
				{-78.771,-162.975,10.000,0.000},
				{-96.233,-186.257,10.000,0.000},
				{-116.100,-211.091,10.000,0.000},
				{-138.528,-237.477,10.000,0.000},
				{-163.673,-265.416,10.000,0.000},
				{-191.689,-294.907,10.000,0.000},
				{-222.732,-325.949,10.000,0.000},
				{-256.879,-356.992,10.000,0.000},
				{-294.130,-388.035,10.000,0.000},
				{-334.486,-419.078,10.000,0.000},
				{-377.946,-450.120,10.000,0.000},
				{-424.510,-481.163,10.000,0.000},
				{-474.179,-512.206,10.000,0.000},
				{-526.951,-543.249,10.000,0.000},
				{-582.828,-574.292,10.000,0.000},
				{-641.810,-605.334,10.000,0.000},
				{-703.895,-636.377,10.000,0.000},
				{-769.085,-667.420,10.000,0.000},
				{-837.379,-698.463,10.000,0.000},
				{-908.778,-729.506,10.000,0.000},
				{-983.280,-760.548,10.000,0.000},
				{-1060.887,-791.591,10.000,0.000},
				{-1141.599,-822.634,10.000,0.000},
				{-1225.414,-853.677,10.000,0.000},
				{-1312.334,-884.720,10.000,0.000},
				{-1402.358,-915.762,10.000,0.000},
				{-1495.487,-946.805,10.000,0.000},
				{-1591.719,-977.848,10.000,0.000},
				{-1691.056,-1008.891,10.000,0.000},
				{-1793.497,-1039.934,10.000,0.000},
				{-1899.043,-1070.976,10.000,0.000},
				{-2007.693,-1102.019,10.000,0.000},
				{-2119.447,-1133.062,10.000,0.000},
				{-2234.305,-1164.105,10.000,0.000},
				{-2352.268,-1195.148,10.000,0.000},
				{-2473.335,-1226.190,10.000,0.000},
				{-2597.506,-1257.233,10.000,0.000},
				{-2724.781,-1288.276,10.000,0.000},
				{-2855.161,-1319.319,10.000,0.000},
				{-2988.645,-1350.361,10.000,0.000},
				{-3125.233,-1381.404,10.000,0.000},
				{-3264.926,-1412.447,10.000,0.000},
				{-3407.723,-1443.490,10.000,0.000},
				{-3553.624,-1474.533,10.000,0.000},
				{-3702.629,-1505.575,10.000,0.000},
				{-3854.739,-1536.618,10.000,0.000},
				{-4009.953,-1567.661,10.000,0.000},
				{-4168.271,-1598.704,10.000,0.000},
				{-4329.694,-1629.747,10.000,0.000},
				{-4494.220,-1660.789,10.000,0.000},
				{-4661.851,-1691.832,10.000,0.000},
				{-4832.587,-1722.875,10.000,0.000},
				{-5006.426,-1753.918,10.000,0.000},
				{-5183.370,-1784.961,10.000,0.000},
				{-5363.419,-1816.003,10.000,0.000},
				{-5546.571,-1847.046,10.000,0.000},
				{-5732.828,-1878.089,10.000,0.000},
				{-5922.189,-1909.132,10.000,0.000},
				{-6114.654,-1940.175,10.000,0.000},
				{-6310.224,-1971.217,10.000,0.000},
				{-6508.898,-2002.260,10.000,0.000},
				{-6710.676,-2033.303,10.000,0.000},
				{-6915.558,-2064.346,10.000,0.000},
				{-7123.545,-2095.389,10.000,0.000},
				{-7334.636,-2126.431,10.000,0.000},
				{-7548.831,-2157.474,10.000,0.000},
				{-7766.131,-2188.517,10.000,0.000},
				{-7986.534,-2219.560,10.000,0.000},
				{-8210.043,-2250.602,10.000,0.000},
				{-8436.655,-2281.645,10.000,0.000},
				{-8666.372,-2312.688,10.000,0.000},
				{-8899.115,-2342.179,10.000,0.000},
				{-9134.730,-2370.117,10.000,0.000},
				{-9373.061,-2396.504,10.000,0.000},
				{-9613.953,-2421.338,10.000,0.000},
				{-9857.251,-2444.620,10.000,0.000},
				{-10102.799,-2466.350,10.000,0.000},
				{-10350.443,-2486.528,10.000,0.000},
				{-10600.027,-2505.153,10.000,0.000},
				{-10851.396,-2522.227,10.000,0.000},
				{-11104.395,-2537.748,10.000,0.000},
				{-11358.868,-2551.718,10.000,0.000},
				{-11614.661,-2564.135,10.000,0.000},
				{-11871.618,-2575.000,10.000,0.000},
				{-12129.583,-2584.312,10.000,0.000},
				{-12388.403,-2592.073,10.000,0.000},
				{-12647.920,-2598.282,10.000,0.000},
				{-12907.981,-2602.938,10.000,0.000},
				{-13168.430,-2606.042,10.000,0.000},
				{-13429.112,-2607.595,10.000,0.000},
				{-13689.872,-2607.595,10.000,0.000},
				{-13950.631,-2607.595,10.000,0.000},
				{-14211.391,-2607.595,10.000,0.000},
				{-14472.150,-2607.595,10.000,0.000},
				{-14732.909,-2607.595,10.000,0.000},
				{-14993.669,-2607.595,10.000,0.000},
				{-15254.428,-2607.595,10.000,0.000},
				{-15515.188,-2607.595,10.000,0.000},
				{-15775.947,-2607.595,10.000,0.000},
				{-16036.707,-2607.595,10.000,0.000},
				{-16297.466,-2607.595,10.000,0.000},
				{-16558.226,-2607.595,10.000,0.000},
				{-16818.985,-2607.595,10.000,0.000},
				{-17079.745,-2607.595,10.000,0.000},
				{-17340.504,-2607.595,10.000,0.000},
				{-17601.263,-2607.595,10.000,0.000},
				{-17862.023,-2607.595,10.000,0.000},
				{-18122.782,-2607.595,10.000,0.000},
				{-18383.542,-2607.595,10.000,0.000},
				{-18644.301,-2607.595,10.000,0.000},
				{-18905.061,-2607.595,10.000,0.000},
				{-19165.820,-2607.595,10.000,0.000},
				{-19426.580,-2607.595,10.000,0.000},
				{-19687.339,-2607.595,10.000,0.000},
				{-19948.099,-2607.595,10.000,0.000},
				{-20208.858,-2607.595,10.000,0.000},
				{-20469.618,-2607.595,10.000,0.000},
				{-20730.377,-2607.595,10.000,0.000},
				{-20991.136,-2607.595,10.000,0.000},
				{-21251.896,-2607.595,10.000,0.000},
				{-21512.655,-2607.595,10.000,0.000},
				{-21773.415,-2607.595,10.000,0.000},
				{-22034.174,-2607.595,10.000,0.000},
				{-22294.934,-2607.595,10.000,0.000},
				{-22555.693,-2607.595,10.000,0.000},
				{-22816.453,-2607.595,10.000,0.000},
				{-23077.212,-2607.595,10.000,0.000},
				{-23337.972,-2607.595,10.000,0.000},
				{-23598.731,-2607.595,10.000,0.000},
				{-23859.490,-2607.595,10.000,0.000},
				{-24120.250,-2607.595,10.000,0.000},
				{-24381.009,-2607.595,10.000,0.000},
				{-24641.769,-2607.595,10.000,0.000},
				{-24902.528,-2607.595,10.000,0.000},
				{-25163.288,-2607.595,10.000,0.000},
				{-25424.047,-2607.595,10.000,0.000},
				{-25684.807,-2607.595,10.000,0.000},
				{-25945.566,-2607.595,10.000,0.000},
				{-26206.326,-2607.595,10.000,0.000},
				{-26467.085,-2607.595,10.000,0.000},
				{-26727.845,-2607.595,10.000,0.000},
				{-26988.604,-2607.595,10.000,0.000},
				{-27249.363,-2607.595,10.000,0.000},
				{-27510.123,-2607.595,10.000,0.000},
				{-27770.882,-2607.595,10.000,0.000},
				{-28031.642,-2607.595,10.000,0.000},
				{-28292.401,-2607.595,10.000,0.000},
				{-28553.161,-2607.595,10.000,0.000},
				{-28813.920,-2607.595,10.000,0.000},
				{-29074.680,-2607.595,10.000,0.000},
				{-29335.439,-2607.595,10.000,0.000},
				{-29596.199,-2607.595,10.000,0.000},
				{-29856.958,-2607.595,10.000,0.000},
				{-30117.717,-2607.595,10.000,0.000},
				{-30378.477,-2607.595,10.000,0.000},
				{-30639.236,-2607.595,10.000,0.000},
				{-30899.996,-2607.595,10.000,0.000},
				{-31160.755,-2607.595,10.000,0.000},
				{-31421.515,-2607.595,10.000,0.000},
				{-31682.274,-2607.595,10.000,0.000},
				{-31943.034,-2607.595,10.000,0.000},
				{-32203.793,-2607.595,10.000,0.000},
				{-32464.553,-2607.595,10.000,0.000},
				{-32725.312,-2607.595,10.000,0.000},
				{-32986.072,-2607.595,10.000,0.000},
				{-33246.831,-2607.595,10.000,0.000},
				{-33507.590,-2607.595,10.000,0.000},
				{-33768.350,-2607.595,10.000,0.000},
				{-34029.109,-2607.595,10.000,0.000},
				{-34289.869,-2607.595,10.000,0.000},
				{-34550.628,-2607.595,10.000,0.000},
				{-34811.388,-2607.595,10.000,0.000},
				{-35072.134,-2607.336,10.000,0.000},
				{-35332.777,-2605.525,10.000,0.000},
				{-35593.162,-2602.162,10.000,0.000},
				{-35853.132,-2597.247,10.000,0.000},
				{-36112.533,-2590.780,10.000,0.000},
				{-36371.210,-2582.760,10.000,0.000},
				{-36629.008,-2573.189,10.000,0.000},
				{-36885.771,-2562.065,10.000,0.000},
				{-37141.343,-2549.389,10.000,0.000},
				{-37395.571,-2535.161,10.000,0.000},
				{-37648.298,-2519.381,10.000,0.000},
				{-37899.370,-2502.049,10.000,0.000},
				{-38148.630,-2483.165,10.000,0.000},
				{-38395.925,-2462.728,10.000,0.000},
				{-38641.098,-2440.740,10.000,0.000},
				{-38883.995,-2417.199,10.000,0.000},
				{-39124.460,-2392.106,10.000,0.000},
				{-39362.339,-2365.461,10.000,0.000},
				{-39597.475,-2337.264,10.000,0.000},
				{-39829.714,-2307.514,10.000,0.000},
				{-40058.913,-2276.471,10.000,0.000},
				{-40285.008,-2245.429,10.000,0.000},
				{-40507.999,-2214.386,10.000,0.000},
				{-40727.885,-2183.343,10.000,0.000},
				{-40944.668,-2152.300,10.000,0.000},
				{-41158.345,-2121.258,10.000,0.000},
				{-41368.919,-2090.215,10.000,0.000},
				{-41576.388,-2059.172,10.000,0.000},
				{-41780.753,-2028.129,10.000,0.000},
				{-41982.014,-1997.086,10.000,0.000},
				{-42180.171,-1966.044,10.000,0.000},
				{-42375.223,-1935.001,10.000,0.000},
				{-42567.171,-1903.958,10.000,0.000},
				{-42756.014,-1872.915,10.000,0.000},
				{-42941.754,-1841.872,10.000,0.000},
				{-43124.389,-1810.830,10.000,0.000},
				{-43303.920,-1779.787,10.000,0.000},
				{-43480.346,-1748.744,10.000,0.000},
				{-43653.669,-1717.701,10.000,0.000},
				{-43823.887,-1686.658,10.000,0.000},
				{-43991.000,-1655.616,10.000,0.000},
				{-44155.010,-1624.573,10.000,0.000},
				{-44315.915,-1593.530,10.000,0.000},
				{-44473.716,-1562.487,10.000,0.000},
				{-44628.412,-1531.444,10.000,0.000},
				{-44780.005,-1500.402,10.000,0.000},
				{-44928.493,-1469.359,10.000,0.000},
				{-45073.876,-1438.316,10.000,0.000},
				{-45216.156,-1407.273,10.000,0.000},
				{-45355.331,-1376.230,10.000,0.000},
				{-45491.402,-1345.188,10.000,0.000},
				{-45624.369,-1314.145,10.000,0.000},
				{-45754.231,-1283.102,10.000,0.000},
				{-45880.989,-1252.059,10.000,0.000},
				{-46004.643,-1221.017,10.000,0.000},
				{-46125.192,-1189.974,10.000,0.000},
				{-46242.637,-1158.931,10.000,0.000},
				{-46356.978,-1127.888,10.000,0.000},
				{-46468.215,-1096.845,10.000,0.000},
				{-46576.347,-1065.803,10.000,0.000},
				{-46681.376,-1034.760,10.000,0.000},
				{-46783.299,-1003.717,10.000,0.000},
				{-46882.119,-972.674,10.000,0.000},
				{-46977.834,-941.631,10.000,0.000},
				{-47070.445,-910.589,10.000,0.000},
				{-47159.952,-879.546,10.000,0.000},
				{-47246.354,-848.503,10.000,0.000},
				{-47329.653,-817.460,10.000,0.000},
				{-47409.846,-786.417,10.000,0.000},
				{-47486.936,-755.375,10.000,0.000},
				{-47560.921,-724.332,10.000,0.000},
				{-47631.802,-693.289,10.000,0.000},
				{-47699.579,-662.246,10.000,0.000},
				{-47764.252,-631.203,10.000,0.000},
				{-47825.820,-600.161,10.000,0.000},
				{-47884.284,-569.118,10.000,0.000},
				{-47939.643,-538.075,10.000,0.000},
				{-47991.899,-507.032,10.000,0.000},
				{-48041.050,-475.989,10.000,0.000},
				{-48087.097,-444.947,10.000,0.000},
				{-48130.039,-413.904,10.000,0.000},
				{-48169.878,-382.861,10.000,0.000},
				{-48206.611,-351.818,10.000,0.000},
				{-48240.241,-320.776,10.000,0.000},
				{-48270.780,-289.991,10.000,0.000},
				{-48298.317,-260.759,10.000,0.000},
				{-48323.009,-233.080,10.000,0.000},
				{-48345.011,-206.952,10.000,0.000},
				{-48364.477,-182.376,10.000,0.000},
				{-48381.563,-159.353,10.000,0.000},
				{-48396.425,-137.882,10.000,0.000},
				{-48409.217,-117.963,10.000,0.000},
				{-48420.095,-99.596,10.000,0.000},
				{-48429.214,-82.781,10.000,0.000},
				{-48436.729,-67.518,10.000,0.000},
				{-48442.795,-53.808,10.000,0.000},
				{-48447.568,-41.649,10.000,0.000},
				{-48451.203,-31.043,10.000,0.000},
				{-48453.854,-21.989,10.000,0.000},
				{-48455.678,-14.487,10.000,0.000},
				{-48456.829,-8.537,10.000,0.000},
				{-48457.463,-4.139,10.000,0.000},
				{-48457.735,-1.293,10.000,0.000},
				{-48457.799,-0.000,10.000,0.000},
				{-48457.799,-0.000,10.000,0.000}		};

}