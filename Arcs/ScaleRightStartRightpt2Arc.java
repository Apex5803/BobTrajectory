package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class ScaleRightStartRightpt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (26.38,0.29,-89.90)
	// (29.38,3.29,0.00)
	// (34.38,7.29,0.00)
	
    public ScaleRightStartRightpt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleRightStartRightpt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.076,1.520,10.000,90.100},
				{0.380,4.561,10.000,90.100},
				{1.064,9.121,10.000,90.100},
				{2.280,15.202,10.000,90.100},
				{4.180,22.803,10.000,90.100},
				{6.917,31.924,10.000,90.100},
				{10.641,42.565,10.000,90.100},
				{15.506,54.726,10.000,90.100},
				{21.663,68.408,10.000,90.100},
				{29.263,83.610,10.000,90.100},
				{38.461,100.332,10.000,90.100},
				{49.406,118.574,10.000,90.100},
				{62.251,138.336,10.000,90.100},
				{77.149,159.619,10.000,90.100},
				{94.251,182.421,10.000,90.090},
				{113.709,206.744,10.000,90.090},
				{135.676,232.587,10.000,90.090},
				{160.303,259.951,10.000,90.080},
				{187.742,288.834,10.000,90.080},
				{218.146,319.238,10.000,90.070},
				{251.666,351.161,10.000,90.060},
				{288.454,384.605,10.000,90.040},
				{328.663,419.569,10.000,90.020},
				{372.444,456.054,10.000,90.000},
				{419.873,492.538,10.000,89.980},
				{470.951,529.022,10.000,89.950},
				{525.678,565.506,10.000,89.910},
				{584.053,601.991,10.000,89.860},
				{646.076,638.475,10.000,89.810},
				{711.748,674.959,10.000,89.750},
				{781.068,711.444,10.000,89.680},
				{854.036,747.928,10.000,89.600},
				{930.653,784.412,10.000,89.500},
				{1010.919,820.896,10.000,89.400},
				{1094.833,857.381,10.000,89.280},
				{1182.395,893.865,10.000,89.140},
				{1273.606,930.349,10.000,88.990},
				{1368.465,966.834,10.000,88.810},
				{1466.972,1003.318,10.000,88.620},
				{1569.128,1039.802,10.000,88.400},
				{1674.933,1076.286,10.000,88.160},
				{1784.386,1112.771,10.000,87.900},
				{1897.487,1149.255,10.000,87.600},
				{2014.237,1185.739,10.000,87.280},
				{2134.635,1222.224,10.000,86.920},
				{2258.681,1258.708,10.000,86.520},
				{2386.376,1295.192,10.000,86.090},
				{2517.720,1331.676,10.000,85.610},
				{2652.712,1368.161,10.000,85.080},
				{2791.352,1404.645,10.000,84.510},
				{2933.641,1441.129,10.000,83.870},
				{3079.578,1477.614,10.000,83.170},
				{3229.163,1514.098,10.000,82.410},
				{3382.397,1550.582,10.000,81.570},
				{3539.280,1587.067,10.000,80.650},
				{3699.811,1623.551,10.000,79.640},
				{3863.990,1660.035,10.000,78.530},
				{4031.818,1696.519,10.000,77.320},
				{4203.294,1733.004,10.000,75.990},
				{4378.419,1769.488,10.000,74.520},
				{4557.192,1805.972,10.000,72.920},
				{4739.613,1842.457,10.000,71.160},
				{4925.683,1878.941,10.000,69.240},
				{5115.401,1915.425,10.000,67.140},
				{5308.768,1951.909,10.000,64.850},
				{5505.783,1988.394,10.000,62.380},
				{5706.447,2024.878,10.000,59.710},
				{5910.759,2061.362,10.000,56.850},
				{6118.719,2097.847,10.000,53.810},
				{6330.328,2134.331,10.000,50.620},
				{6545.585,2170.815,10.000,47.300},
				{6764.491,2207.299,10.000,43.890},
				{6987.045,2243.784,10.000,40.450},
				{7213.248,2280.268,10.000,37.010},
				{7443.099,2316.752,10.000,33.630},
				{7676.598,2353.237,10.000,30.360},
				{7913.746,2389.721,10.000,27.220},
				{8154.542,2426.205,10.000,24.250},
				{8398.987,2462.689,10.000,21.470},
				{8647.080,2499.174,10.000,18.890},
				{8898.822,2535.658,10.000,16.500},
				{9154.212,2572.142,10.000,14.310},
				{9413.250,2608.627,10.000,12.320},
				{9675.861,2643.591,10.000,10.500},
				{9941.892,2677.035,10.000,8.870},
				{10211.192,2708.958,10.000,7.400},
				{10483.608,2739.362,10.000,6.080},
				{10758.988,2768.245,10.000,4.910},
				{11037.181,2795.609,10.000,3.880},
				{11318.034,2821.452,10.000,2.980},
				{11601.395,2845.774,10.000,2.210},
				{11887.113,2868.577,10.000,1.550},
				{12175.035,2889.860,10.000,1.010},
				{12465.009,2909.622,10.000,0.590},
				{12756.883,2927.864,10.000,0.280},
				{13050.506,2944.586,10.000,0.080},
				{13345.724,2959.788,10.000,0.000},
				{13642.387,2973.469,10.000,0.110},
				{13940.342,2985.631,10.000,0.520},
				{14239.437,2996.272,10.000,1.240},
				{14539.521,3005.393,10.000,2.260},
				{14840.440,3012.994,10.000,3.600},
				{15142.043,3019.075,10.000,5.270},
				{15444.179,3023.635,10.000,7.300},
				{15746.695,3026.676,10.000,9.710},
				{16049.438,3028.196,10.000,12.530},
				{16352.203,3027.106,10.000,15.770},
				{16654.783,3024.496,10.000,19.430},
				{16957.026,3020.366,10.000,23.490},
				{17258.781,3014.716,10.000,27.870},
				{17559.894,3007.546,10.000,32.480},
				{17860.214,2998.855,10.000,37.180},
				{18159.589,2988.645,10.000,41.840},
				{18457.867,2976.914,10.000,46.300},
				{18754.896,2963.663,10.000,50.460},
				{19050.523,2948.892,10.000,54.240},
				{19344.598,2932.600,10.000,57.620},
				{19636.967,2914.789,10.000,60.600},
				{19927.480,2895.457,10.000,63.180},
				{20215.983,2874.605,10.000,65.400},
				{20502.325,2852.233,10.000,67.280},
				{20786.353,2828.341,10.000,68.870},
				{21067.917,2802.928,10.000,70.180},
				{21346.863,2775.995,10.000,71.250},
				{21623.040,2747.543,10.000,72.100},
				{21896.295,2717.570,10.000,72.750},
				{22166.478,2686.076,10.000,73.220},
				{22433.435,2653.063,10.000,73.510},
				{22697.014,2618.529,10.000,73.640},
				{22957.065,2582.476,10.000,73.620},
				{23213.488,2545.991,10.000,73.450},
				{23466.263,2509.507,10.000,73.140},
				{23715.389,2473.023,10.000,72.690},
				{23960.867,2436.539,10.000,72.090},
				{24202.697,2400.054,10.000,71.360},
				{24440.878,2363.570,10.000,70.470},
				{24675.411,2327.086,10.000,69.450},
				{24906.295,2290.601,10.000,68.270},
				{25133.531,2254.117,10.000,66.940},
				{25357.119,2217.633,10.000,65.450},
				{25577.058,2181.149,10.000,63.790},
				{25793.349,2144.664,10.000,61.970},
				{26005.991,2108.180,10.000,59.990},
				{26214.985,2071.696,10.000,57.850},
				{26420.330,2035.211,10.000,55.540},
				{26622.027,1998.727,10.000,53.100},
				{26820.075,1962.243,10.000,50.520},
				{27014.476,1925.759,10.000,47.840},
				{27205.227,1889.274,10.000,45.080},
				{27392.330,1852.790,10.000,42.270},
				{27575.785,1816.306,10.000,39.440},
				{27755.592,1779.821,10.000,36.620},
				{27931.749,1743.337,10.000,33.860},
				{28104.259,1706.853,10.000,31.180},
				{28273.120,1670.369,10.000,28.590},
				{28438.333,1633.884,10.000,26.140},
				{28599.897,1597.400,10.000,23.810},
				{28757.813,1560.916,10.000,21.630},
				{28912.080,1524.431,10.000,19.600},
				{29062.699,1487.947,10.000,17.720},
				{29209.669,1451.463,10.000,15.980},
				{29352.992,1414.979,10.000,14.380},
				{29492.665,1378.494,10.000,12.920},
				{29628.690,1342.010,10.000,11.570},
				{29761.067,1305.526,10.000,10.350},
				{29889.796,1269.041,10.000,9.230},
				{30014.875,1232.557,10.000,8.220},
				{30136.307,1196.073,10.000,7.300},
				{30254.090,1159.589,10.000,6.460},
				{30368.225,1123.104,10.000,5.710},
				{30478.711,1086.620,10.000,5.030},
				{30585.549,1050.136,10.000,4.410},
				{30688.738,1013.651,10.000,3.860},
				{30788.279,977.167,10.000,3.360},
				{30884.171,940.683,10.000,2.920},
				{30976.415,904.199,10.000,2.520},
				{31065.011,867.714,10.000,2.170},
				{31149.958,831.230,10.000,1.850},
				{31231.257,794.746,10.000,1.580},
				{31308.907,758.261,10.000,1.330},
				{31382.909,721.777,10.000,1.120},
				{31453.263,685.293,10.000,0.930},
				{31519.968,648.809,10.000,0.770},
				{31583.025,612.324,10.000,0.640},
				{31642.433,575.840,10.000,0.520},
				{31698.193,539.356,10.000,0.420},
				{31750.304,502.871,10.000,0.330},
				{31798.767,466.387,10.000,0.260},
				{31843.581,429.903,10.000,0.210},
				{31884.802,394.508,10.000,0.160},
				{31922.559,360.634,10.000,0.120},
				{31957.005,328.279,10.000,0.090},
				{31988.291,297.445,10.000,0.070},
				{32016.570,268.131,10.000,0.050},
				{32041.993,240.337,10.000,0.040},
				{32064.713,214.064,10.000,0.030},
				{32084.882,189.310,10.000,0.020},
				{32102.651,166.077,10.000,0.010},
				{32118.173,144.364,10.000,0.010},
				{32131.600,124.171,10.000,0.010},
				{32143.084,105.499,10.000,0.000},
				{32152.776,88.346,10.000,0.000},
				{32160.829,72.714,10.000,0.000},
				{32167.395,58.601,10.000,0.000},
				{32172.625,46.009,10.000,0.000},
				{32176.672,34.938,10.000,0.000},
				{32179.689,25.386,10.000,0.000},
				{32181.826,17.355,10.000,0.000},
				{32183.236,10.843,10.000,0.000},
				{32184.070,5.852,10.000,0.000},
				{32184.482,2.381,10.000,0.000},
				{32184.623,0.431,10.000,0.000},
				{32184.644,0.000,10.000,0.000},
				{32184.644,0.000,10.000,0.000}		};

}