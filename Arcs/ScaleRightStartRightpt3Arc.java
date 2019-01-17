package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class ScaleRightStartRightpt3Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (15.88,3.54,-179.80)
	// (23.88,-2.46,-89.90)
	
    public ScaleRightStartRightpt3Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleRightStartRightpt3Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.075,-1.490,10.000,0.200},
				{-0.373,-4.470,10.000,0.200},
				{-1.043,-8.940,10.000,0.200},
				{-2.235,-14.901,10.000,0.200},
				{-4.098,-22.351,10.000,0.200},
				{-6.780,-31.291,10.000,0.200},
				{-10.430,-41.722,10.000,0.200},
				{-15.199,-53.642,10.000,0.200},
				{-21.233,-67.052,10.000,0.200},
				{-28.684,-81.953,10.000,0.200},
				{-37.698,-98.344,10.000,0.200},
				{-48.427,-116.224,10.000,0.200},
				{-61.018,-135.595,10.000,0.200},
				{-75.620,-156.456,10.000,0.200},
				{-92.309,-177.316,10.000,0.200},
				{-111.084,-198.177,10.000,0.200},
				{-131.944,-219.038,10.000,0.200},
				{-154.891,-239.899,10.000,0.200},
				{-179.924,-260.759,10.000,0.200},
				{-207.043,-281.620,10.000,0.200},
				{-236.248,-302.481,10.000,0.200},
				{-267.539,-323.342,10.000,0.210},
				{-300.916,-344.202,10.000,0.210},
				{-336.380,-365.063,10.000,0.210},
				{-373.929,-385.924,10.000,0.210},
				{-413.565,-406.785,10.000,0.210},
				{-455.286,-427.646,10.000,0.220},
				{-499.094,-448.506,10.000,0.220},
				{-544.987,-469.367,10.000,0.220},
				{-592.967,-490.228,10.000,0.230},
				{-643.033,-511.089,10.000,0.230},
				{-695.185,-531.949,10.000,0.230},
				{-749.423,-552.810,10.000,0.240},
				{-805.747,-573.671,10.000,0.240},
				{-864.157,-594.532,10.000,0.250},
				{-924.653,-615.392,10.000,0.260},
				{-987.235,-636.253,10.000,0.270},
				{-1051.904,-657.114,10.000,0.270},
				{-1118.658,-677.975,10.000,0.280},
				{-1187.499,-698.835,10.000,0.290},
				{-1258.425,-719.696,10.000,0.300},
				{-1331.438,-740.557,10.000,0.310},
				{-1406.537,-761.418,10.000,0.320},
				{-1483.721,-782.278,10.000,0.330},
				{-1562.992,-803.139,10.000,0.340},
				{-1644.349,-824.000,10.000,0.360},
				{-1727.792,-844.861,10.000,0.370},
				{-1813.321,-865.721,10.000,0.380},
				{-1900.936,-886.582,10.000,0.400},
				{-1990.638,-907.443,10.000,0.410},
				{-2082.425,-928.304,10.000,0.430},
				{-2176.298,-949.164,10.000,0.440},
				{-2272.258,-970.025,10.000,0.460},
				{-2370.303,-990.886,10.000,0.480},
				{-2470.435,-1011.747,10.000,0.490},
				{-2572.653,-1032.607,10.000,0.510},
				{-2676.957,-1053.468,10.000,0.520},
				{-2783.346,-1074.329,10.000,0.540},
				{-2891.822,-1095.190,10.000,0.560},
				{-3002.384,-1116.050,10.000,0.570},
				{-3115.032,-1136.911,10.000,0.590},
				{-3229.767,-1157.772,10.000,0.600},
				{-3346.587,-1178.633,10.000,0.620},
				{-3465.493,-1199.494,10.000,0.630},
				{-3586.486,-1220.354,10.000,0.640},
				{-3709.564,-1241.215,10.000,0.660},
				{-3834.729,-1262.076,10.000,0.670},
				{-3961.979,-1282.937,10.000,0.670},
				{-4091.316,-1303.797,10.000,0.680},
				{-4222.739,-1324.658,10.000,0.690},
				{-4356.248,-1345.519,10.000,0.690},
				{-4491.842,-1366.380,10.000,0.690},
				{-4629.523,-1387.240,10.000,0.690},
				{-4769.291,-1408.101,10.000,0.680},
				{-4911.144,-1428.962,10.000,0.680},
				{-5055.083,-1449.823,10.000,0.670},
				{-5201.108,-1470.683,10.000,0.650},
				{-5349.220,-1491.544,10.000,0.630},
				{-5499.417,-1512.405,10.000,0.610},
				{-5651.701,-1533.266,10.000,0.580},
				{-5806.070,-1554.126,10.000,0.550},
				{-5962.526,-1574.987,10.000,0.510},
				{-6121.068,-1595.848,10.000,0.470},
				{-6281.695,-1616.709,10.000,0.420},
				{-6444.409,-1637.569,10.000,0.360},
				{-6609.209,-1658.430,10.000,0.300},
				{-6776.095,-1679.291,10.000,0.230},
				{-6945.067,-1700.152,10.000,0.150},
				{-7116.126,-1721.012,10.000,0.070},
				{-7289.270,-1741.873,10.000,-0.030},
				{-7464.500,-1762.734,10.000,-0.130},
				{-7641.817,-1783.595,10.000,-0.250},
				{-7821.219,-1804.455,10.000,-0.380},
				{-8002.708,-1825.316,10.000,-0.510},
				{-8186.282,-1846.177,10.000,-0.660},
				{-8371.943,-1867.038,10.000,-0.830},
				{-8559.690,-1887.898,10.000,-1.000},
				{-8749.523,-1908.759,10.000,-1.190},
				{-8941.442,-1929.620,10.000,-1.400},
				{-9135.447,-1950.481,10.000,-1.620},
				{-9331.463,-1969.851,10.000,-1.860},
				{-9529.343,-1987.732,10.000,-2.120},
				{-9728.935,-2004.123,10.000,-2.400},
				{-9930.093,-2019.023,10.000,-2.690},
				{-10132.666,-2032.434,10.000,-3.010},
				{-10336.505,-2044.354,10.000,-3.350},
				{-10541.462,-2054.785,10.000,-3.720},
				{-10747.387,-2063.725,10.000,-4.100},
				{-10954.132,-2071.175,10.000,-4.510},
				{-11161.548,-2077.135,10.000,-4.950},
				{-11369.485,-2081.606,10.000,-5.410},
				{-11577.794,-2084.586,10.000,-5.900},
				{-11786.328,-2086.076,10.000,-6.420},
				{-11994.935,-2086.076,10.000,-6.970},
				{-12203.543,-2086.076,10.000,-7.550},
				{-12412.150,-2086.076,10.000,-8.160},
				{-12620.758,-2086.076,10.000,-8.810},
				{-12829.365,-2086.076,10.000,-9.490},
				{-13037.973,-2086.076,10.000,-10.200},
				{-13246.581,-2086.076,10.000,-10.950},
				{-13455.188,-2086.076,10.000,-11.740},
				{-13663.796,-2086.076,10.000,-12.580},
				{-13872.403,-2086.076,10.000,-13.450},
				{-14081.011,-2086.076,10.000,-14.370},
				{-14289.618,-2086.076,10.000,-15.330},
				{-14498.226,-2086.076,10.000,-16.340},
				{-14706.833,-2086.076,10.000,-17.400},
				{-14915.441,-2086.076,10.000,-18.510},
				{-15124.049,-2086.076,10.000,-19.660},
				{-15332.656,-2086.076,10.000,-20.870},
				{-15541.264,-2086.076,10.000,-22.120},
				{-15749.871,-2086.076,10.000,-23.430},
				{-15958.479,-2086.076,10.000,-24.790},
				{-16167.086,-2086.076,10.000,-26.190},
				{-16375.694,-2086.076,10.000,-27.650},
				{-16584.302,-2086.076,10.000,-29.150},
				{-16792.909,-2086.076,10.000,-30.690},
				{-17001.517,-2086.076,10.000,-32.270},
				{-17210.124,-2086.076,10.000,-33.890},
				{-17418.732,-2086.076,10.000,-35.540},
				{-17627.339,-2086.076,10.000,-37.220},
				{-17835.947,-2086.076,10.000,-38.920},
				{-18044.555,-2086.076,10.000,-40.630},
				{-18253.162,-2086.076,10.000,-42.360},
				{-18461.770,-2086.076,10.000,-44.090},
				{-18670.377,-2086.076,10.000,-45.810},
				{-18878.985,-2086.076,10.000,-47.530},
				{-19087.592,-2086.076,10.000,-49.230},
				{-19296.200,-2086.076,10.000,-50.910},
				{-19504.808,-2086.076,10.000,-52.560},
				{-19713.415,-2086.076,10.000,-54.180},
				{-19922.023,-2086.076,10.000,-55.770},
				{-20130.630,-2086.076,10.000,-57.320},
				{-20339.238,-2086.076,10.000,-58.830},
				{-20547.814,-2085.458,10.000,-60.290},
				{-20756.255,-2083.349,10.000,-61.710},
				{-20964.410,-2079.751,10.000,-63.080},
				{-21172.130,-2074.663,10.000,-64.400},
				{-21379.268,-2068.084,10.000,-65.660},
				{-21585.673,-2060.016,10.000,-66.880},
				{-21791.197,-2050.457,10.000,-68.040},
				{-21995.690,-2039.409,10.000,-69.150},
				{-22199.004,-2026.870,10.000,-70.220},
				{-22400.989,-2012.842,10.000,-71.230},
				{-22601.498,-1997.323,10.000,-72.190},
				{-22800.380,-1980.314,10.000,-73.110},
				{-22997.486,-1961.815,10.000,-73.980},
				{-23192.668,-1941.827,10.000,-74.810},
				{-23385.808,-1920.966,10.000,-75.600},
				{-23576.861,-1900.105,10.000,-76.350},
				{-23765.829,-1879.244,10.000,-77.050},
				{-23952.710,-1858.384,10.000,-77.730},
				{-24137.505,-1837.523,10.000,-78.360},
				{-24320.215,-1816.662,10.000,-78.970},
				{-24500.838,-1795.801,10.000,-79.550},
				{-24679.375,-1774.941,10.000,-80.090},
				{-24855.826,-1754.080,10.000,-80.610},
				{-25030.191,-1733.219,10.000,-81.110},
				{-25202.470,-1712.358,10.000,-81.580},
				{-25372.663,-1691.498,10.000,-82.020},
				{-25540.769,-1670.637,10.000,-82.450},
				{-25706.790,-1649.776,10.000,-82.850},
				{-25870.725,-1628.915,10.000,-83.240},
				{-26032.573,-1608.055,10.000,-83.600},
				{-26192.335,-1587.194,10.000,-83.950},
				{-26350.012,-1566.333,10.000,-84.280},
				{-26505.602,-1545.472,10.000,-84.590},
				{-26659.106,-1524.611,10.000,-84.890},
				{-26810.524,-1503.751,10.000,-85.170},
				{-26959.856,-1482.890,10.000,-85.450},
				{-27107.102,-1462.029,10.000,-85.700},
				{-27252.262,-1441.168,10.000,-85.950},
				{-27395.336,-1420.308,10.000,-86.180},
				{-27536.324,-1399.447,10.000,-86.400},
				{-27675.225,-1378.586,10.000,-86.610},
				{-27812.041,-1357.725,10.000,-86.810},
				{-27946.771,-1336.865,10.000,-87.000},
				{-28079.414,-1316.004,10.000,-87.180},
				{-28209.971,-1295.143,10.000,-87.350},
				{-28338.443,-1274.282,10.000,-87.510},
				{-28464.828,-1253.422,10.000,-87.670},
				{-28589.127,-1232.561,10.000,-87.810},
				{-28711.340,-1211.700,10.000,-87.950},
				{-28831.467,-1190.839,10.000,-88.080},
				{-28949.508,-1169.979,10.000,-88.210},
				{-29065.463,-1149.118,10.000,-88.320},
				{-29179.331,-1128.257,10.000,-88.430},
				{-29291.114,-1107.396,10.000,-88.540},
				{-29400.811,-1086.536,10.000,-88.640},
				{-29508.421,-1065.675,10.000,-88.730},
				{-29613.946,-1044.814,10.000,-88.820},
				{-29717.384,-1023.953,10.000,-88.900},
				{-29818.736,-1003.093,10.000,-88.980},
				{-29918.003,-982.232,10.000,-89.050},
				{-30015.183,-961.371,10.000,-89.120},
				{-30110.277,-940.510,10.000,-89.190},
				{-30203.285,-919.650,10.000,-89.250},
				{-30294.207,-898.789,10.000,-89.300},
				{-30383.043,-877.928,10.000,-89.350},
				{-30469.792,-857.067,10.000,-89.400},
				{-30554.456,-836.207,10.000,-89.450},
				{-30637.034,-815.346,10.000,-89.490},
				{-30717.525,-794.485,10.000,-89.530},
				{-30795.931,-773.624,10.000,-89.570},
				{-30872.250,-752.763,10.000,-89.600},
				{-30946.483,-731.903,10.000,-89.630},
				{-31018.631,-711.042,10.000,-89.660},
				{-31088.692,-690.181,10.000,-89.690},
				{-31156.667,-669.320,10.000,-89.710},
				{-31222.556,-648.460,10.000,-89.730},
				{-31286.359,-627.599,10.000,-89.750},
				{-31348.076,-606.738,10.000,-89.770},
				{-31407.706,-585.877,10.000,-89.790},
				{-31465.251,-565.017,10.000,-89.800},
				{-31520.710,-544.156,10.000,-89.820},
				{-31574.082,-523.295,10.000,-89.830},
				{-31625.369,-502.434,10.000,-89.840},
				{-31674.569,-481.574,10.000,-89.850},
				{-31721.683,-460.713,10.000,-89.860},
				{-31766.712,-439.852,10.000,-89.860},
				{-31809.654,-418.991,10.000,-89.870},
				{-31850.510,-398.131,10.000,-89.870},
				{-31889.280,-377.270,10.000,-89.880},
				{-31925.964,-356.409,10.000,-89.880},
				{-31960.562,-335.548,10.000,-89.890},
				{-31993.074,-314.688,10.000,-89.890},
				{-32023.499,-293.827,10.000,-89.890},
				{-32051.839,-272.966,10.000,-89.890},
				{-32078.093,-252.105,10.000,-89.900},
				{-32102.260,-231.245,10.000,-89.900},
				{-32124.341,-210.384,10.000,-89.900},
				{-32144.337,-189.523,10.000,-89.900},
				{-32162.246,-168.662,10.000,-89.900},
				{-32178.069,-147.802,10.000,-89.900},
				{-32191.837,-127.559,10.000,-89.900},
				{-32203.656,-108.806,10.000,-89.900},
				{-32213.673,-91.544,10.000,-89.900},
				{-32222.039,-75.771,10.000,-89.900},
				{-32228.902,-61.489,10.000,-89.900},
				{-32234.411,-48.697,10.000,-89.900},
				{-32238.716,-37.394,10.000,-89.900},
				{-32241.965,-27.582,10.000,-89.900},
				{-32244.307,-19.260,10.000,-89.900},
				{-32245.891,-12.428,10.000,-89.900},
				{-32246.867,-7.086,10.000,-89.900},
				{-32247.383,-3.234,10.000,-89.900},
				{-32247.588,-0.872,10.000,-89.900},
				{-32247.632,-0.000,10.000,-89.900},
				{-32247.632,-0.000,10.000,-89.900}		};

}