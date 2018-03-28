package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.53,13.08,0.00)
	// (8.90,21.08,45.00)
	
    public CenterToLeftScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.568,11.351,10.000,0.000},
				{2.838,34.054,10.000,0.000},
				{7.946,68.107,10.000,0.000},
				{17.027,113.512,10.000,0.000},
				{31.216,170.268,10.000,0.000},
				{51.648,238.376,10.000,0.000},
				{79.459,317.834,10.000,0.000},
				{115.783,408.644,10.000,0.000},
				{161.755,510.805,10.000,0.000},
				{218.511,624.318,10.000,0.000},
				{287.186,749.181,10.000,0.000},
				{368.915,885.396,10.000,0.001},
				{464.833,1032.962,10.000,0.001},
				{576.075,1191.879,10.000,0.002},
				{703.209,1350.797,10.000,0.002},
				{846.234,1509.714,10.000,0.004},
				{1005.152,1668.631,10.000,0.005},
				{1179.961,1827.548,10.000,0.007},
				{1370.661,1986.466,10.000,0.009},
				{1577.254,2145.383,10.000,0.012},
				{1799.738,2304.300,10.000,0.016},
				{2038.114,2463.217,10.000,0.021},
				{2292.381,2622.135,10.000,0.026},
				{2562.541,2781.052,10.000,0.032},
				{2848.592,2939.969,10.000,0.040},
				{3150.534,3098.886,10.000,0.049},
				{3468.369,3257.804,10.000,0.059},
				{3802.095,3416.721,10.000,0.071},
				{4151.713,3575.638,10.000,0.085},
				{4517.223,3734.555,10.000,0.100},
				{4898.624,3893.472,10.000,0.118},
				{5295.917,4052.390,10.000,0.137},
				{5709.102,4211.307,10.000,0.159},
				{6138.179,4370.224,10.000,0.184},
				{6583.147,4529.141,10.000,0.211},
				{7044.007,4688.059,10.000,0.241},
				{7520.759,4846.976,10.000,0.274},
				{8013.402,5005.893,10.000,0.311},
				{8521.937,5164.810,10.000,0.351},
				{9046.364,5323.728,10.000,0.395},
				{9586.683,5482.645,10.000,0.443},
				{10142.893,5641.562,10.000,0.496},
				{10714.995,5800.479,10.000,0.553},
				{11302.989,5959.397,10.000,0.614},
				{11906.875,6118.314,10.000,0.681},
				{12526.652,6277.231,10.000,0.753},
				{13162.321,6436.148,10.000,0.830},
				{13813.881,6595.066,10.000,0.914},
				{14481.334,6753.983,10.000,1.003},
				{15164.678,6912.900,10.000,1.100},
				{15863.914,7071.817,10.000,1.203},
				{16579.042,7230.735,10.000,1.313},
				{17310.061,7389.652,10.000,1.431},
				{18056.972,7548.569,10.000,1.558},
				{18819.775,7707.486,10.000,1.692},
				{19598.469,7866.404,10.000,1.836},
				{20393.055,8025.321,10.000,1.988},
				{21203.533,8184.238,10.000,2.151},
				{22029.903,8343.155,10.000,2.324},
				{22872.164,8502.073,10.000,2.507},
				{23730.318,8660.990,10.000,2.703},
				{24604.362,8819.907,10.000,2.910},
				{25494.299,8978.824,10.000,3.129},
				{26400.127,9137.742,10.000,3.363},
				{27321.847,9296.659,10.000,3.610},
				{28259.459,9455.576,10.000,3.871},
				{29212.962,9614.493,10.000,4.149},
				{30182.358,9773.411,10.000,4.442},
				{31167.645,9932.328,10.000,4.754},
				{32168.823,10091.245,10.000,5.083},
				{33185.894,10250.162,10.000,5.431},
				{34218.856,10409.080,10.000,5.800},
				{35267.709,10567.997,10.000,6.191},
				{36332.455,10726.914,10.000,6.605},
				{37413.092,10885.831,10.000,7.042},
				{38509.054,11033.397,10.000,7.505},
				{39619.204,11169.612,10.000,7.995},
				{40742.409,11294.476,10.000,8.511},
				{41877.532,11407.988,10.000,9.056},
				{43023.439,11510.149,10.000,9.631},
				{44178.994,11600.959,10.000,10.236},
				{45343.063,11680.417,10.000,10.872},
				{46514.510,11748.525,10.000,11.541},
				{47692.200,11805.281,10.000,12.244},
				{48874.999,11850.686,10.000,12.980},
				{50061.770,11884.740,10.000,13.752},
				{51251.379,11907.442,10.000,14.559},
				{52442.691,11918.793,10.000,15.403},
				{53634.570,11918.793,10.000,16.283},
				{54826.449,11918.793,10.000,17.202},
				{56018.329,11918.793,10.000,18.159},
				{57210.208,11918.793,10.000,19.156},
				{58402.087,11918.793,10.000,20.193},
				{59593.967,11918.793,10.000,21.272},
				{60785.846,11918.793,10.000,22.393},
				{61977.725,11918.793,10.000,23.557},
				{63169.605,11918.793,10.000,24.764},
				{64361.484,11918.793,10.000,26.013},
				{65553.363,11918.793,10.000,27.304},
				{66745.243,11918.793,10.000,28.637},
				{67937.122,11918.793,10.000,30.011},
				{69129.001,11918.793,10.000,31.423},
				{70320.881,11918.793,10.000,32.873},
				{71512.760,11918.793,10.000,34.356},
				{72704.639,11918.793,10.000,35.871},
				{73896.519,11918.793,10.000,37.414},
				{75088.398,11918.793,10.000,38.980},
				{76280.277,11918.793,10.000,40.566},
				{77472.157,11918.793,10.000,42.167},
				{78664.036,11918.793,10.000,43.778},
				{79855.915,11918.793,10.000,45.394},
				{81047.795,11918.793,10.000,47.009},
				{82239.674,11918.793,10.000,48.618},
				{83431.553,11918.793,10.000,50.215},
				{84623.433,11918.793,10.000,51.796},
				{85815.312,11918.793,10.000,53.357},
				{87007.191,11918.793,10.000,54.891},
				{88199.071,11918.793,10.000,56.396},
				{89390.950,11918.793,10.000,57.867},
				{90582.829,11918.793,10.000,59.301},
				{91774.709,11918.793,10.000,60.697},
				{92966.588,11918.793,10.000,62.051},
				{94158.467,11918.793,10.000,63.361},
				{95350.347,11918.793,10.000,64.627},
				{96542.226,11918.793,10.000,65.848},
				{97734.105,11918.793,10.000,67.022},
				{98925.985,11918.793,10.000,68.151},
				{100117.864,11918.793,10.000,69.233},
				{101309.743,11918.793,10.000,70.270},
				{102501.623,11918.793,10.000,71.262},
				{103693.502,11918.793,10.000,72.209},
				{104885.381,11918.793,10.000,73.113},
				{106077.261,11918.793,10.000,73.974},
				{107269.140,11918.793,10.000,74.795},
				{108461.019,11918.793,10.000,75.575},
				{109652.899,11918.793,10.000,76.316},
				{110844.778,11918.793,10.000,77.019},
				{112036.657,11918.793,10.000,77.685},
				{113228.537,11918.793,10.000,78.316},
				{114420.416,11918.793,10.000,78.913},
				{115612.295,11918.793,10.000,79.476},
				{116804.175,11918.793,10.000,80.008},
				{117996.054,11918.793,10.000,80.508},
				{119187.933,11918.793,10.000,80.979},
				{120379.813,11918.793,10.000,81.420},
				{121571.692,11918.793,10.000,81.834},
				{122763.571,11918.793,10.000,82.220},
				{123955.451,11918.793,10.000,82.580},
				{125147.330,11918.793,10.000,82.914},
				{126339.209,11918.793,10.000,83.223},
				{127531.089,11918.793,10.000,83.508},
				{128722.968,11918.793,10.000,83.770},
				{129914.847,11918.793,10.000,84.009},
				{131106.727,11918.793,10.000,84.226},
				{132298.606,11918.793,10.000,84.420},
				{133490.485,11918.793,10.000,84.594},
				{134682.365,11918.793,10.000,84.746},
				{135874.244,11918.793,10.000,84.878},
				{137066.123,11918.793,10.000,84.990},
				{138258.003,11918.793,10.000,85.082},
				{139449.882,11918.793,10.000,85.154},
				{140641.761,11918.793,10.000,85.207},
				{141833.641,11918.793,10.000,85.241},
				{143025.520,11918.793,10.000,85.256},
				{144217.399,11918.793,10.000,85.252},
				{145409.279,11918.793,10.000,85.230},
				{146601.158,11918.793,10.000,85.189},
				{147793.037,11918.793,10.000,85.129},
				{148984.917,11918.793,10.000,85.051},
				{150176.796,11918.793,10.000,84.955},
				{151368.675,11918.793,10.000,84.840},
				{152560.555,11918.793,10.000,84.706},
				{153752.434,11918.793,10.000,84.554},
				{154944.313,11918.793,10.000,84.383},
				{156136.193,11918.793,10.000,84.193},
				{157328.072,11918.793,10.000,83.985},
				{158519.951,11918.793,10.000,83.757},
				{159711.831,11918.793,10.000,83.510},
				{160903.710,11918.793,10.000,83.244},
				{162095.589,11918.793,10.000,82.958},
				{163287.469,11918.793,10.000,82.652},
				{164479.348,11918.793,10.000,82.326},
				{165671.227,11918.793,10.000,81.980},
				{166863.107,11918.793,10.000,81.613},
				{168054.986,11918.793,10.000,81.226},
				{169246.865,11918.793,10.000,80.817},
				{170438.745,11918.793,10.000,80.387},
				{171630.624,11918.793,10.000,79.936},
				{172822.503,11918.793,10.000,79.463},
				{174014.383,11918.793,10.000,78.968},
				{175206.262,11918.793,10.000,78.451},
				{176398.141,11918.793,10.000,77.912},
				{177590.021,11918.793,10.000,77.350},
				{178781.900,11918.793,10.000,76.766},
				{179973.779,11918.793,10.000,76.159},
				{181165.659,11918.793,10.000,75.530},
				{182357.381,11915.642,10.000,74.879},
				{183548.220,11901.140,10.000,74.207},
				{184737.041,11875.287,10.000,73.513},
				{185922.710,11838.082,10.000,72.801},
				{187104.090,11789.526,10.000,72.070},
				{188280.047,11729.619,10.000,71.322},
				{189449.446,11658.361,10.000,70.560},
				{190611.152,11575.752,10.000,69.785},
				{191764.029,11481.791,10.000,68.998},
				{192906.943,11376.479,10.000,68.203},
				{194038.757,11259.816,10.000,67.402},
				{195158.338,11131.801,10.000,66.596},
				{196264.550,10992.435,10.000,65.788},
				{197356.258,10841.718,10.000,64.982},
				{198432.484,10682.801,10.000,64.179},
				{199492.818,10523.884,10.000,63.382},
				{200537.260,10364.967,10.000,62.592},
				{201565.811,10206.049,10.000,61.810},
				{202578.470,10047.132,10.000,61.040},
				{203575.238,9888.215,10.000,60.281},
				{204556.113,9729.298,10.000,59.536},
				{205521.097,9570.381,10.000,58.805},
				{206470.189,9411.463,10.000,58.091},
				{207403.390,9252.546,10.000,57.393},
				{208320.699,9093.629,10.000,56.714},
				{209222.116,8934.712,10.000,56.054},
				{210107.641,8775.794,10.000,55.413},
				{210977.274,8616.877,10.000,54.793},
				{211831.016,8457.960,10.000,54.194},
				{212668.866,8299.043,10.000,53.617},
				{213490.825,8140.125,10.000,53.061},
				{214296.891,7981.208,10.000,52.527},
				{215087.066,7822.291,10.000,52.015},
				{215861.350,7663.374,10.000,51.526},
				{216619.741,7504.456,10.000,51.058},
				{217362.241,7345.539,10.000,50.613},
				{218088.849,7186.622,10.000,50.189},
				{218799.565,7027.705,10.000,49.787},
				{219494.390,6868.787,10.000,49.406},
				{220173.323,6709.870,10.000,49.047},
				{220836.364,6550.953,10.000,48.707},
				{221483.513,6392.036,10.000,48.388},
				{222114.771,6233.118,10.000,48.088},
				{222730.137,6074.201,10.000,47.806},
				{223329.611,5915.284,10.000,47.544},
				{223913.194,5756.367,10.000,47.299},
				{224480.885,5597.449,10.000,47.071},
				{225032.684,5438.532,10.000,46.859},
				{225568.591,5279.615,10.000,46.664},
				{226088.607,5120.698,10.000,46.483},
				{226592.730,4961.780,10.000,46.317},
				{227080.963,4802.863,10.000,46.165},
				{227553.303,4643.946,10.000,46.026},
				{228009.752,4485.029,10.000,45.899},
				{228450.309,4326.111,10.000,45.785},
				{228874.974,4167.194,10.000,45.681},
				{229283.748,4008.277,10.000,45.588},
				{229676.630,3849.360,10.000,45.504},
				{230053.620,3690.442,10.000,45.430},
				{230414.718,3531.525,10.000,45.364},
				{230759.925,3372.608,10.000,45.306},
				{231089.240,3213.691,10.000,45.255},
				{231402.663,3054.773,10.000,45.210},
				{231700.194,2895.856,10.000,45.172},
				{231981.834,2736.939,10.000,45.139},
				{232247.582,2578.022,10.000,45.111},
				{232497.438,2419.104,10.000,45.088},
				{232731.403,2260.187,10.000,45.069},
				{232949.476,2101.270,10.000,45.053},
				{233151.657,1942.353,10.000,45.040},
				{233337.946,1783.436,10.000,45.029},
				{233508.344,1624.518,10.000,45.021},
				{233662.850,1465.601,10.000,45.015},
				{233801.464,1306.684,10.000,45.010},
				{233924.187,1147.767,10.000,45.007},
				{234031.175,992.000,10.000,45.004},
				{234123.154,847.585,10.000,45.003},
				{234201.260,714.521,10.000,45.002},
				{234266.626,592.809,10.000,45.001},
				{234320.389,482.447,10.000,45.001},
				{234363.683,383.437,10.000,45.000},
				{234397.644,295.778,10.000,45.000},
				{234423.406,219.470,10.000,45.000},
				{234442.106,154.514,10.000,45.000},
				{234454.877,100.909,10.000,45.000},
				{234462.855,58.655,10.000,45.000},
				{234467.175,27.752,10.000,45.000},
				{234468.973,8.200,10.000,45.000},
				{234469.383,0.000,10.000,45.000},
				{234469.383,0.000,10.000,45.000}		};

}