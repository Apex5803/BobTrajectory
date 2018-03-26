package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (10.00,9.08,0.00)
	
    public CenterToRightSwitchArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.596,11.919,10.000,0.000},
				{2.980,35.756,10.000,0.000},
				{8.343,71.513,10.000,0.000},
				{17.878,119.188,10.000,0.000},
				{32.777,178.782,10.000,0.000},
				{54.231,250.295,10.000,0.000},
				{83.432,333.726,10.000,0.000},
				{121.572,429.077,10.000,0.000},
				{169.843,536.346,10.000,0.000},
				{229.437,655.534,10.000,0.000},
				{301.545,786.640,10.000,0.000},
				{387.361,929.666,10.000,0.000},
				{488.075,1084.610,10.000,0.000},
				{604.879,1251.473,10.000,-0.010},
				{738.965,1430.255,10.000,-0.010},
				{891.526,1620.956,10.000,-0.010},
				{1063.752,1823.575,10.000,-0.020},
				{1256.837,2038.114,10.000,-0.020},
				{1471.971,2264.571,10.000,-0.030},
				{1710.347,2502.947,10.000,-0.050},
				{1972.560,2741.322,10.000,-0.060},
				{2258.611,2979.698,10.000,-0.080},
				{2568.500,3218.074,10.000,-0.100},
				{2902.226,3456.450,10.000,-0.130},
				{3259.790,3694.826,10.000,-0.170},
				{3641.191,3933.202,10.000,-0.210},
				{4046.430,4171.578,10.000,-0.250},
				{4475.507,4409.954,10.000,-0.310},
				{4928.421,4648.329,10.000,-0.370},
				{5405.173,4886.705,10.000,-0.450},
				{5905.762,5125.081,10.000,-0.530},
				{6430.189,5363.457,10.000,-0.630},
				{6978.454,5601.833,10.000,-0.730},
				{7550.556,5840.209,10.000,-0.860},
				{8146.495,6078.585,10.000,-0.990},
				{8766.273,6316.960,10.000,-1.140},
				{9409.887,6555.336,10.000,-1.310},
				{10077.340,6793.712,10.000,-1.500},
				{10768.630,7032.088,10.000,-1.700},
				{11483.757,7270.464,10.000,-1.930},
				{12222.723,7508.840,10.000,-2.180},
				{12985.525,7747.216,10.000,-2.450},
				{13772.166,7985.592,10.000,-2.740},
				{14582.644,8223.967,10.000,-3.060},
				{15416.959,8462.343,10.000,-3.400},
				{16275.112,8700.719,10.000,-3.770},
				{17157.103,8939.095,10.000,-4.170},
				{18062.931,9177.471,10.000,-4.600},
				{18992.597,9415.847,10.000,-5.060},
				{19946.101,9654.223,10.000,-5.560},
				{20922.846,9880.680,10.000,-6.080},
				{21921.641,10095.218,10.000,-6.650},
				{22941.293,10297.837,10.000,-7.240},
				{23980.612,10488.538,10.000,-7.870},
				{25038.405,10667.320,10.000,-8.540},
				{26113.480,10834.183,10.000,-9.240},
				{27204.646,10989.127,10.000,-9.970},
				{28310.710,11132.153,10.000,-10.740},
				{29430.480,11263.260,10.000,-11.530},
				{30562.766,11382.448,10.000,-12.360},
				{31706.374,11489.717,10.000,-13.220},
				{32860.113,11585.067,10.000,-14.110},
				{34022.792,11668.499,10.000,-15.020},
				{35193.217,11740.011,10.000,-15.950},
				{36370.198,11799.605,10.000,-16.910},
				{37552.542,11847.281,10.000,-17.880},
				{38739.058,11883.037,10.000,-18.870},
				{39928.554,11906.875,10.000,-19.870},
				{41119.837,11918.793,10.000,-20.880},
				{42311.716,11918.793,10.000,-21.890},
				{43503.596,11918.793,10.000,-22.910},
				{44695.475,11918.793,10.000,-23.920},
				{45887.354,11918.793,10.000,-24.930},
				{47079.234,11918.793,10.000,-25.940},
				{48271.113,11918.793,10.000,-26.940},
				{49462.992,11918.793,10.000,-27.930},
				{50654.872,11918.793,10.000,-28.910},
				{51846.751,11918.793,10.000,-29.870},
				{53038.630,11918.793,10.000,-30.820},
				{54230.510,11918.793,10.000,-31.750},
				{55422.389,11918.793,10.000,-32.660},
				{56614.268,11918.793,10.000,-33.550},
				{57806.148,11918.793,10.000,-34.420},
				{58998.027,11918.793,10.000,-35.270},
				{60189.906,11918.793,10.000,-36.090},
				{61381.786,11918.793,10.000,-36.880},
				{62573.665,11918.793,10.000,-37.660},
				{63765.544,11918.793,10.000,-38.400},
				{64957.424,11918.793,10.000,-39.120},
				{66149.303,11918.793,10.000,-39.810},
				{67341.182,11918.793,10.000,-40.470},
				{68533.062,11918.793,10.000,-41.100},
				{69724.941,11918.793,10.000,-41.710},
				{70916.820,11918.793,10.000,-42.290},
				{72108.700,11918.793,10.000,-42.840},
				{73300.579,11918.793,10.000,-43.360},
				{74492.458,11918.793,10.000,-43.860},
				{75684.338,11918.793,10.000,-44.320},
				{76876.217,11918.793,10.000,-44.760},
				{78068.096,11918.793,10.000,-45.170},
				{79259.976,11918.793,10.000,-45.560},
				{80451.855,11918.793,10.000,-45.920},
				{81643.734,11918.793,10.000,-46.250},
				{82835.614,11918.793,10.000,-46.550},
				{84027.493,11918.793,10.000,-46.830},
				{85219.372,11918.793,10.000,-47.080},
				{86411.252,11918.793,10.000,-47.310},
				{87603.131,11918.793,10.000,-47.510},
				{88795.010,11918.793,10.000,-47.680},
				{89986.890,11918.793,10.000,-47.830},
				{91178.769,11918.793,10.000,-47.960},
				{92370.648,11918.793,10.000,-48.060},
				{93562.528,11918.793,10.000,-48.130},
				{94754.407,11918.793,10.000,-48.180},
				{95946.286,11918.793,10.000,-48.210},
				{97138.166,11918.793,10.000,-48.210},
				{98330.045,11918.793,10.000,-48.180},
				{99521.924,11918.793,10.000,-48.130},
				{100713.804,11918.793,10.000,-48.060},
				{101905.683,11918.793,10.000,-47.960},
				{103097.562,11918.793,10.000,-47.830},
				{104289.442,11918.793,10.000,-47.680},
				{105481.321,11918.793,10.000,-47.510},
				{106673.200,11918.793,10.000,-47.310},
				{107865.080,11918.793,10.000,-47.080},
				{109056.959,11918.793,10.000,-46.830},
				{110248.838,11918.793,10.000,-46.550},
				{111440.718,11918.793,10.000,-46.240},
				{112632.597,11918.793,10.000,-45.910},
				{113824.476,11918.793,10.000,-45.550},
				{115016.356,11918.793,10.000,-45.170},
				{116208.235,11918.793,10.000,-44.760},
				{117400.114,11918.793,10.000,-44.320},
				{118591.994,11918.793,10.000,-43.850},
				{119783.873,11918.793,10.000,-43.350},
				{120975.752,11918.793,10.000,-42.830},
				{122167.632,11918.793,10.000,-42.280},
				{123359.511,11918.793,10.000,-41.700},
				{124551.390,11918.793,10.000,-41.090},
				{125743.270,11918.793,10.000,-40.460},
				{126935.149,11918.793,10.000,-39.800},
				{128127.028,11918.793,10.000,-39.110},
				{129318.908,11918.793,10.000,-38.390},
				{130510.787,11918.793,10.000,-37.640},
				{131702.666,11918.793,10.000,-36.870},
				{132894.546,11918.793,10.000,-36.080},
				{134086.425,11918.793,10.000,-35.250},
				{135278.304,11918.793,10.000,-34.410},
				{136470.184,11918.793,10.000,-33.540},
				{137662.063,11918.793,10.000,-32.650},
				{138853.942,11918.793,10.000,-31.740},
				{140045.822,11918.793,10.000,-30.810},
				{141237.701,11918.793,10.000,-29.860},
				{142429.580,11918.793,10.000,-28.890},
				{143621.460,11918.793,10.000,-27.920},
				{144813.339,11918.793,10.000,-26.930},
				{146005.218,11918.793,10.000,-25.930},
				{147197.098,11918.793,10.000,-24.920},
				{148388.977,11918.793,10.000,-23.910},
				{149580.856,11918.793,10.000,-22.890},
				{150772.736,11918.793,10.000,-21.880},
				{151964.606,11918.619,10.000,-20.860},
				{153155.864,11906.526,10.000,-19.860},
				{154345.316,11882.514,10.000,-18.860},
				{155531.770,11846.583,10.000,-17.870},
				{156714.036,11798.734,10.000,-16.890},
				{157890.921,11738.965,10.000,-15.940},
				{159061.233,11667.278,10.000,-15.010},
				{160223.781,11583.672,10.000,-14.090},
				{161377.372,11488.148,10.000,-13.210},
				{162520.815,11380.704,10.000,-12.350},
				{163652.917,11261.342,10.000,-11.520},
				{164772.487,11130.061,10.000,-10.720},
				{165878.333,10986.861,10.000,-9.960},
				{166969.263,10831.742,10.000,-9.230},
				{168044.086,10664.705,10.000,-8.530},
				{169101.608,10485.749,10.000,-7.860},
				{170140.640,10294.874,10.000,-7.230},
				{171159.987,10092.080,10.000,-6.640},
				{172158.460,9877.367,10.000,-6.080},
				{173134.865,9650.736,10.000,-5.550},
				{174088.020,9412.360,10.000,-5.050},
				{175017.337,9173.984,10.000,-4.590},
				{175922.816,8935.608,10.000,-4.160},
				{176804.458,8697.232,10.000,-3.760},
				{177662.263,8458.857,10.000,-3.390},
				{178496.230,8220.481,10.000,-3.050},
				{179306.359,7982.105,10.000,-2.730},
				{180092.651,7743.729,10.000,-2.440},
				{180855.105,7505.353,10.000,-2.170},
				{181593.721,7266.977,10.000,-1.930},
				{182308.500,7028.601,10.000,-1.700},
				{182999.442,6790.225,10.000,-1.500},
				{183666.545,6551.850,10.000,-1.310},
				{184309.811,6313.474,10.000,-1.140},
				{184929.240,6075.098,10.000,-0.990},
				{185524.831,5836.722,10.000,-0.850},
				{186096.584,5598.346,10.000,-0.730},
				{186644.500,5359.970,10.000,-0.620},
				{187168.578,5121.594,10.000,-0.530},
				{187668.819,4883.219,10.000,-0.450},
				{188145.222,4644.843,10.000,-0.370},
				{188597.788,4406.467,10.000,-0.310},
				{189026.516,4168.091,10.000,-0.250},
				{189431.406,3929.715,10.000,-0.200},
				{189812.459,3691.339,10.000,-0.160},
				{190169.674,3452.963,10.000,-0.130},
				{190503.051,3214.587,10.000,-0.100},
				{190812.591,2976.212,10.000,-0.080},
				{191098.294,2737.836,10.000,-0.060},
				{191360.158,2499.460,10.000,-0.050},
				{191598.194,2261.258,10.000,-0.030},
				{191813.006,2034.976,10.000,-0.020},
				{192005.785,1820.612,10.000,-0.020},
				{192177.724,1618.166,10.000,-0.010},
				{192330.015,1427.640,10.000,-0.010},
				{192463.848,1249.033,10.000,-0.010},
				{192580.417,1082.344,10.000,0.000},
				{192680.913,927.574,10.000,0.000},
				{192766.528,784.723,10.000,0.000},
				{192838.453,653.790,10.000,0.000},
				{192897.882,534.777,10.000,0.000},
				{192946.005,427.682,10.000,0.000},
				{192984.014,332.506,10.000,0.000},
				{193013.102,249.249,10.000,0.000},
				{193034.460,177.910,10.000,0.000},
				{193049.280,118.491,10.000,0.000},
				{193058.754,70.990,10.000,0.000},
				{193064.074,35.408,10.000,0.000},
				{193066.431,11.744,10.000,0.000},
				{193067.018,0.000,10.000,0.000},
				{193067.018,0.000,10.000,0.000}		};

}