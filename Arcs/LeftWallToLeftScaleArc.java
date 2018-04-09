package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToLeftScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.15,0.00)
	// (13.63,22.15,-10.00)
	// (24.13,17.90,-10.00)
	
    public LeftWallToLeftScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToLeftScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.554,-11.071,10.000,-0.000},
				{-2.768,-33.213,10.000,-0.000},
				{-7.750,-66.427,10.000,-0.000},
				{-16.607,-110.711,10.000,-0.000},
				{-30.446,-166.067,10.000,-0.000},
				{-50.374,-232.493,10.000,-0.000},
				{-77.498,-309.991,10.000,-0.000},
				{-112.925,-398.560,10.000,-0.000},
				{-157.763,-498.200,10.000,-0.000},
				{-213.119,-608.911,10.000,-0.000},
				{-280.099,-730.693,10.000,-0.000},
				{-359.811,-863.546,10.000,-0.000},
				{-453.362,-1007.470,10.000,-0.000},
				{-561.858,-1162.466,10.000,-0.000},
				{-685.855,-1317.461,10.000,-0.000},
				{-825.351,-1472.457,10.000,-0.000},
				{-980.346,-1627.452,10.000,-0.000},
				{-1150.841,-1782.447,10.000,-0.001},
				{-1336.836,-1937.443,10.000,-0.001},
				{-1538.330,-2092.438,10.000,-0.001},
				{-1755.323,-2247.434,10.000,-0.001},
				{-1987.816,-2402.429,10.000,-0.002},
				{-2235.809,-2557.424,10.000,-0.002},
				{-2499.301,-2712.420,10.000,-0.003},
				{-2778.293,-2867.415,10.000,-0.003},
				{-3072.784,-3022.411,10.000,-0.004},
				{-3382.775,-3177.406,10.000,-0.005},
				{-3708.265,-3332.402,10.000,-0.006},
				{-4049.255,-3487.397,10.000,-0.007},
				{-4405.745,-3642.392,10.000,-0.008},
				{-4777.734,-3797.388,10.000,-0.009},
				{-5165.222,-3952.383,10.000,-0.011},
				{-5568.211,-4107.379,10.000,-0.013},
				{-5986.698,-4262.374,10.000,-0.015},
				{-6420.685,-4417.370,10.000,-0.017},
				{-6870.172,-4572.365,10.000,-0.019},
				{-7335.158,-4727.360,10.000,-0.022},
				{-7815.644,-4882.356,10.000,-0.025},
				{-8311.630,-5037.351,10.000,-0.028},
				{-8823.114,-5192.347,10.000,-0.032},
				{-9350.099,-5347.342,10.000,-0.036},
				{-9892.583,-5502.337,10.000,-0.040},
				{-10450.566,-5657.333,10.000,-0.045},
				{-11024.049,-5812.328,10.000,-0.050},
				{-11613.032,-5967.324,10.000,-0.055},
				{-12217.514,-6122.319,10.000,-0.061},
				{-12837.496,-6277.315,10.000,-0.067},
				{-13472.977,-6432.310,10.000,-0.074},
				{-14123.958,-6587.305,10.000,-0.082},
				{-14790.438,-6742.301,10.000,-0.089},
				{-15472.418,-6897.296,10.000,-0.098},
				{-16169.897,-7052.292,10.000,-0.107},
				{-16882.876,-7207.287,10.000,-0.116},
				{-17611.355,-7362.283,10.000,-0.126},
				{-18355.333,-7517.278,10.000,-0.137},
				{-19114.810,-7672.273,10.000,-0.148},
				{-19889.788,-7827.269,10.000,-0.161},
				{-20680.264,-7982.264,10.000,-0.173},
				{-21486.240,-8137.260,10.000,-0.187},
				{-22307.716,-8292.255,10.000,-0.201},
				{-23144.691,-8447.251,10.000,-0.216},
				{-23997.166,-8602.246,10.000,-0.232},
				{-24865.141,-8757.241,10.000,-0.249},
				{-25748.615,-8912.237,10.000,-0.267},
				{-26647.588,-9067.232,10.000,-0.286},
				{-27562.061,-9222.228,10.000,-0.305},
				{-28492.034,-9377.223,10.000,-0.326},
				{-29437.506,-9532.218,10.000,-0.347},
				{-30398.477,-9687.214,10.000,-0.370},
				{-31374.948,-9842.209,10.000,-0.393},
				{-32366.919,-9997.205,10.000,-0.418},
				{-33374.389,-10152.200,10.000,-0.444},
				{-34397.359,-10307.196,10.000,-0.471},
				{-35435.828,-10462.191,10.000,-0.499},
				{-36489.797,-10617.186,10.000,-0.528},
				{-37559.266,-10772.182,10.000,-0.559},
				{-38644.234,-10927.177,10.000,-0.590},
				{-39744.701,-11082.173,10.000,-0.623},
				{-40860.668,-11237.168,10.000,-0.658},
				{-41992.135,-11392.164,10.000,-0.693},
				{-43139.101,-11547.159,10.000,-0.731},
				{-44301.567,-11702.154,10.000,-0.769},
				{-45479.532,-11857.150,10.000,-0.809},
				{-46672.997,-12012.145,10.000,-0.850},
				{-47881.961,-12167.141,10.000,-0.893},
				{-49106.425,-12322.136,10.000,-0.937},
				{-50346.388,-12477.131,10.000,-0.983},
				{-51601.851,-12632.127,10.000,-1.031},
				{-52872.813,-12787.122,10.000,-1.080},
				{-54159.275,-12942.118,10.000,-1.131},
				{-55461.237,-13097.113,10.000,-1.183},
				{-56778.698,-13252.109,10.000,-1.237},
				{-58111.659,-13407.104,10.000,-1.292},
				{-59460.119,-13562.099,10.000,-1.350},
				{-60824.079,-13717.095,10.000,-1.409},
				{-62203.538,-13872.090,10.000,-1.470},
				{-63598.497,-14027.086,10.000,-1.532},
				{-65008.955,-14182.081,10.000,-1.597},
				{-66434.913,-14337.077,10.000,-1.663},
				{-67876.370,-14492.072,10.000,-1.731},
				{-69333.327,-14647.067,10.000,-1.801},
				{-70805.784,-14802.063,10.000,-1.873},
				{-72293.740,-14957.058,10.000,-1.947},
				{-73797.195,-15112.054,10.000,-2.022},
				{-75316.151,-15267.049,10.000,-2.100},
				{-76850.605,-15422.045,10.000,-2.179},
				{-78400.559,-15577.040,10.000,-2.260},
				{-79966.013,-15732.035,10.000,-2.343},
				{-81546.967,-15887.031,10.000,-2.429},
				{-83143.419,-16042.026,10.000,-2.516},
				{-84755.372,-16197.022,10.000,-2.605},
				{-86382.824,-16352.017,10.000,-2.696},
				{-88025.775,-16507.012,10.000,-2.789},
				{-89684.226,-16662.008,10.000,-2.883},
				{-91358.177,-16817.003,10.000,-2.980},
				{-93047.627,-16971.999,10.000,-3.079},
				{-94752.577,-17126.994,10.000,-3.179},
				{-96473.026,-17281.990,10.000,-3.282},
				{-98208.974,-17436.985,10.000,-3.386},
				{-99960.423,-17591.980,10.000,-3.492},
				{-101727.371,-17746.976,10.000,-3.601},
				{-103509.818,-17901.971,10.000,-3.710},
				{-105307.765,-18056.967,10.000,-3.822},
				{-107121.211,-18211.962,10.000,-3.935},
				{-108950.157,-18366.958,10.000,-4.050},
				{-110794.049,-18510.882,10.000,-4.167},
				{-112651.780,-18643.735,10.000,-4.285},
				{-114522.243,-18765.517,10.000,-4.405},
				{-116404.330,-18876.228,10.000,-4.526},
				{-118296.935,-18975.868,10.000,-4.648},
				{-120198.950,-19064.437,10.000,-4.771},
				{-122109.269,-19141.935,10.000,-4.895},
				{-124026.783,-19208.361,10.000,-5.020},
				{-125950.387,-19263.717,10.000,-5.146},
				{-127878.973,-19308.001,10.000,-5.271},
				{-129811.434,-19341.214,10.000,-5.398},
				{-131746.662,-19363.357,10.000,-5.524},
				{-133683.552,-19374.428,10.000,-5.651},
				{-135620.995,-19374.428,10.000,-5.777},
				{-137558.437,-19374.428,10.000,-5.903},
				{-139495.880,-19374.428,10.000,-6.029},
				{-141433.323,-19374.428,10.000,-6.154},
				{-143370.766,-19374.428,10.000,-6.279},
				{-145308.208,-19374.428,10.000,-6.404},
				{-147245.651,-19374.428,10.000,-6.527},
				{-149183.094,-19374.428,10.000,-6.651},
				{-151120.537,-19374.428,10.000,-6.773},
				{-153057.980,-19374.428,10.000,-6.894},
				{-154995.422,-19374.428,10.000,-7.015},
				{-156932.865,-19374.428,10.000,-7.134},
				{-158870.308,-19374.428,10.000,-7.252},
				{-160807.751,-19374.428,10.000,-7.369},
				{-162745.193,-19374.428,10.000,-7.485},
				{-164682.636,-19374.428,10.000,-7.599},
				{-166620.079,-19374.428,10.000,-7.712},
				{-168557.522,-19374.428,10.000,-7.824},
				{-170494.965,-19374.428,10.000,-7.933},
				{-172432.407,-19374.428,10.000,-8.041},
				{-174369.850,-19374.428,10.000,-8.147},
				{-176307.293,-19374.428,10.000,-8.251},
				{-178244.736,-19374.428,10.000,-8.353},
				{-180182.178,-19374.428,10.000,-8.453},
				{-182119.621,-19374.428,10.000,-8.551},
				{-184057.064,-19374.428,10.000,-8.646},
				{-185994.507,-19374.428,10.000,-8.739},
				{-187931.950,-19374.428,10.000,-8.830},
				{-189869.392,-19374.428,10.000,-8.918},
				{-191806.835,-19374.428,10.000,-9.003},
				{-193744.278,-19374.428,10.000,-9.086},
				{-195681.721,-19374.428,10.000,-9.166},
				{-197619.163,-19374.428,10.000,-9.242},
				{-199556.606,-19374.428,10.000,-9.316},
				{-201494.049,-19374.428,10.000,-9.386},
				{-203431.492,-19374.428,10.000,-9.453},
				{-205368.935,-19374.428,10.000,-9.517},
				{-207306.377,-19374.428,10.000,-9.578},
				{-209243.820,-19374.428,10.000,-9.634},
				{-211181.263,-19374.428,10.000,-9.687},
				{-213118.706,-19374.428,10.000,-9.737},
				{-215056.148,-19374.428,10.000,-9.782},
				{-216993.591,-19374.428,10.000,-9.824},
				{-218931.034,-19374.428,10.000,-9.861},
				{-220868.477,-19374.428,10.000,-9.894},
				{-222805.920,-19374.428,10.000,-9.923},
				{-224743.362,-19374.428,10.000,-9.948},
				{-226680.805,-19374.428,10.000,-9.967},
				{-228618.248,-19374.428,10.000,-9.983},
				{-230555.691,-19374.428,10.000,-9.993},
				{-232493.133,-19374.428,10.000,-9.999},
				{-234430.576,-19374.428,10.000,-10.003},
				{-236368.019,-19374.428,10.000,-10.047},
				{-238305.462,-19374.428,10.000,-10.140},
				{-240242.905,-19374.428,10.000,-10.279},
				{-242180.347,-19374.428,10.000,-10.461},
				{-244117.790,-19374.428,10.000,-10.686},
				{-246055.233,-19374.428,10.000,-10.950},
				{-247992.676,-19374.428,10.000,-11.251},
				{-249930.118,-19374.428,10.000,-11.587},
				{-251867.561,-19374.428,10.000,-11.956},
				{-253805.004,-19374.428,10.000,-12.357},
				{-255742.447,-19374.428,10.000,-12.786},
				{-257679.890,-19374.428,10.000,-13.243},
				{-259617.332,-19374.428,10.000,-13.724},
				{-261554.775,-19374.428,10.000,-14.229},
				{-263492.218,-19374.428,10.000,-14.754},
				{-265429.661,-19374.428,10.000,-15.299},
				{-267367.103,-19374.428,10.000,-15.860},
				{-269304.546,-19374.428,10.000,-16.436},
				{-271241.989,-19374.428,10.000,-17.024},
				{-273179.432,-19374.428,10.000,-17.623},
				{-275116.875,-19374.428,10.000,-18.231},
				{-277054.317,-19374.428,10.000,-18.845},
				{-278991.760,-19374.428,10.000,-19.464},
				{-280929.203,-19374.428,10.000,-20.085},
				{-282866.646,-19374.428,10.000,-20.706},
				{-284804.088,-19374.428,10.000,-21.326},
				{-286741.531,-19374.428,10.000,-21.943},
				{-288678.974,-19374.428,10.000,-22.554},
				{-290616.417,-19374.428,10.000,-23.159},
				{-292553.860,-19374.428,10.000,-23.755},
				{-294491.302,-19374.428,10.000,-24.340},
				{-296428.745,-19374.428,10.000,-24.914},
				{-298366.188,-19374.428,10.000,-25.475},
				{-300303.631,-19374.428,10.000,-26.021},
				{-302241.073,-19374.428,10.000,-26.551},
				{-304178.516,-19374.428,10.000,-27.065},
				{-306115.959,-19374.428,10.000,-27.560},
				{-308053.402,-19374.428,10.000,-28.035},
				{-309990.845,-19374.428,10.000,-28.491},
				{-311928.287,-19374.428,10.000,-28.926},
				{-313865.730,-19374.428,10.000,-29.339},
				{-315803.173,-19374.428,10.000,-29.730},
				{-317740.616,-19374.428,10.000,-30.097},
				{-319678.058,-19374.428,10.000,-30.441},
				{-321615.501,-19374.428,10.000,-30.761},
				{-323552.396,-19363.472,10.000,-31.057},
				{-325487.642,-19341.445,10.000,-31.327},
				{-327420.132,-19308.347,10.000,-31.571},
				{-329348.758,-19264.177,10.000,-31.790},
				{-331272.414,-19208.937,10.000,-31.982},
				{-333189.992,-19142.625,10.000,-32.149},
				{-335100.385,-19065.243,10.000,-32.289},
				{-337002.487,-18976.789,10.000,-32.403},
				{-338895.189,-18877.264,10.000,-32.492},
				{-340777.386,-18766.668,10.000,-32.554},
				{-342647.969,-18645.001,10.000,-32.592},
				{-344505.833,-18512.263,10.000,-32.604},
				{-346349.869,-18368.454,10.000,-32.592},
				{-348178.970,-18213.574,10.000,-32.557},
				{-349992.578,-18058.578,10.000,-32.498},
				{-351790.686,-17903.583,10.000,-32.417},
				{-353573.294,-17748.588,10.000,-32.314},
				{-355340.403,-17593.592,10.000,-32.190},
				{-357092.013,-17438.597,10.000,-32.045},
				{-358828.122,-17283.601,10.000,-31.881},
				{-360548.733,-17128.606,10.000,-31.697},
				{-362253.844,-16973.610,10.000,-31.495},
				{-363943.455,-16818.615,10.000,-31.276},
				{-365617.567,-16663.620,10.000,-31.039},
				{-367276.179,-16508.624,10.000,-30.787},
				{-368919.291,-16353.629,10.000,-30.519},
				{-370546.905,-16198.633,10.000,-30.236},
				{-372159.018,-16043.638,10.000,-29.940},
				{-373755.632,-15888.642,10.000,-29.630},
				{-375336.747,-15733.647,10.000,-29.308},
				{-376902.362,-15578.652,10.000,-28.974},
				{-378452.477,-15423.656,10.000,-28.630},
				{-379987.093,-15268.661,10.000,-28.276},
				{-381506.209,-15113.665,10.000,-27.913},
				{-383009.826,-14958.670,10.000,-27.541},
				{-384497.943,-14803.675,10.000,-27.162},
				{-385970.561,-14648.679,10.000,-26.776},
				{-387427.679,-14493.684,10.000,-26.384},
				{-388869.297,-14338.688,10.000,-25.988},
				{-390295.417,-14183.693,10.000,-25.586},
				{-391706.036,-14028.697,10.000,-25.182},
				{-393101.156,-13873.702,10.000,-24.774},
				{-394480.776,-13718.707,10.000,-24.364},
				{-395844.897,-13563.711,10.000,-23.953},
				{-397193.519,-13408.716,10.000,-23.542},
				{-398526.640,-13253.720,10.000,-23.131},
				{-399844.263,-13098.725,10.000,-22.720},
				{-401146.385,-12943.729,10.000,-22.311},
				{-402433.009,-12788.734,10.000,-21.904},
				{-403704.132,-12633.739,10.000,-21.500},
				{-404959.756,-12478.743,10.000,-21.099},
				{-406199.881,-12323.748,10.000,-20.702},
				{-407424.506,-12168.752,10.000,-20.309},
				{-408633.631,-12013.757,10.000,-19.921},
				{-409827.257,-11858.761,10.000,-19.538},
				{-411005.384,-11703.766,10.000,-19.162},
				{-412168.010,-11548.771,10.000,-18.791},
				{-413315.138,-11393.775,10.000,-18.427},
				{-414446.766,-11238.780,10.000,-18.070},
				{-415562.894,-11083.784,10.000,-17.720},
				{-416663.522,-10928.789,10.000,-17.378},
				{-417748.651,-10773.794,10.000,-17.043},
				{-418818.281,-10618.798,10.000,-16.717},
				{-419872.411,-10463.803,10.000,-16.398},
				{-420911.042,-10308.807,10.000,-16.088},
				{-421934.173,-10153.812,10.000,-15.787},
				{-422941.804,-9998.816,10.000,-15.494},
				{-423933.936,-9843.821,10.000,-15.210},
				{-424910.568,-9688.826,10.000,-14.935},
				{-425871.701,-9533.830,10.000,-14.668},
				{-426817.334,-9378.835,10.000,-14.411},
				{-427747.468,-9223.839,10.000,-14.163},
				{-428662.102,-9068.844,10.000,-13.923},
				{-429561.237,-8913.848,10.000,-13.692},
				{-430444.872,-8758.853,10.000,-13.470},
				{-431313.007,-8603.858,10.000,-13.257},
				{-432165.643,-8448.862,10.000,-13.053},
				{-433002.780,-8293.867,10.000,-12.857},
				{-433824.417,-8138.871,10.000,-12.669},
				{-434630.554,-7983.876,10.000,-12.490},
				{-435421.192,-7828.881,10.000,-12.320},
				{-436196.330,-7673.885,10.000,-12.157},
				{-436955.969,-7518.890,10.000,-12.002},
				{-437700.108,-7363.894,10.000,-11.855},
				{-438428.748,-7208.899,10.000,-11.715},
				{-439141.888,-7053.903,10.000,-11.583},
				{-439839.528,-6898.908,10.000,-11.458},
				{-440521.669,-6743.913,10.000,-11.341},
				{-441188.311,-6588.917,10.000,-11.229},
				{-441839.453,-6433.922,10.000,-11.125},
				{-442475.095,-6278.926,10.000,-11.027},
				{-443095.238,-6123.931,10.000,-10.935},
				{-443699.881,-5968.935,10.000,-10.849},
				{-444289.025,-5813.940,10.000,-10.769},
				{-444862.669,-5658.945,10.000,-10.695},
				{-445420.814,-5503.949,10.000,-10.626},
				{-445963.459,-5348.954,10.000,-10.562},
				{-446490.605,-5193.958,10.000,-10.502},
				{-447002.251,-5038.963,10.000,-10.448},
				{-447498.397,-4883.967,10.000,-10.398},
				{-447979.044,-4728.972,10.000,-10.352},
				{-448444.192,-4573.977,10.000,-10.310},
				{-448893.840,-4418.981,10.000,-10.272},
				{-449327.988,-4263.986,10.000,-10.237},
				{-449746.637,-4108.990,10.000,-10.206},
				{-450149.786,-3953.995,10.000,-10.178},
				{-450537.436,-3799.000,10.000,-10.153},
				{-450909.586,-3644.004,10.000,-10.130},
				{-451266.237,-3489.009,10.000,-10.110},
				{-451607.388,-3334.013,10.000,-10.093},
				{-451933.039,-3179.018,10.000,-10.077},
				{-452243.191,-3024.022,10.000,-10.064},
				{-452537.844,-2869.027,10.000,-10.053},
				{-452816.997,-2714.032,10.000,-10.043},
				{-453080.650,-2559.036,10.000,-10.034},
				{-453328.804,-2404.041,10.000,-10.027},
				{-453561.458,-2249.045,10.000,-10.021},
				{-453778.613,-2094.050,10.000,-10.016},
				{-453980.268,-1939.054,10.000,-10.012},
				{-454166.424,-1784.059,10.000,-10.009},
				{-454337.080,-1629.064,10.000,-10.007},
				{-454492.237,-1474.068,10.000,-10.005},
				{-454631.894,-1319.073,10.000,-10.003},
				{-454756.051,-1164.077,10.000,-10.002},
				{-454864.709,-1009.082,10.000,-10.001},
				{-454958.415,-865.042,10.000,-10.001},
				{-455038.271,-732.074,10.000,-10.001},
				{-455105.384,-610.177,10.000,-10.000},
				{-455160.860,-499.351,10.000,-10.000},
				{-455205.807,-399.596,10.000,-10.000},
				{-455241.333,-310.912,10.000,-10.000},
				{-455268.543,-233.299,10.000,-10.000},
				{-455288.546,-166.757,10.000,-10.000},
				{-455302.448,-111.287,10.000,-10.000},
				{-455311.357,-66.887,10.000,-10.000},
				{-455316.379,-33.559,10.000,-10.000},
				{-455318.622,-11.301,10.000,-10.000},
				{-455319.193,-0.115,10.000,-10.000},
				{-455319.199,-0.000,10.000,-10.000},
				{-455319.199,-0.000,10.000,-10.000}		};

}