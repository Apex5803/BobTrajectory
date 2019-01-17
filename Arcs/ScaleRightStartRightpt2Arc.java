package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class ScaleRightStartRightpt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (26.38,0.29,-89.90)
	// (24.88,1.79,-179.80)
	// (15.88,3.54,-179.80)
	
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
				{0.075,1.490,10.000,-89.900},
				{0.373,4.470,10.000,-89.900},
				{1.043,8.940,10.000,-89.900},
				{2.235,14.901,10.000,-89.900},
				{4.098,22.351,10.000,-89.900},
				{6.780,31.291,10.000,-89.900},
				{10.430,41.722,10.000,-89.900},
				{15.199,53.642,10.000,-89.900},
				{21.233,67.052,10.000,-89.900},
				{28.684,81.953,10.000,-89.900},
				{37.698,98.344,10.000,-89.900},
				{48.427,116.224,10.000,-89.890},
				{61.018,135.595,10.000,-89.890},
				{75.620,156.456,10.000,-89.880},
				{92.309,177.316,10.000,-89.880},
				{111.084,198.177,10.000,-89.870},
				{131.944,219.038,10.000,-89.850},
				{154.891,239.899,10.000,-89.830},
				{179.924,260.759,10.000,-89.810},
				{207.043,281.620,10.000,-89.780},
				{236.248,302.481,10.000,-89.750},
				{267.539,323.342,10.000,-89.710},
				{300.916,344.202,10.000,-89.650},
				{336.380,365.063,10.000,-89.590},
				{373.929,385.924,10.000,-89.520},
				{413.565,406.785,10.000,-89.440},
				{455.286,427.646,10.000,-89.340},
				{499.094,448.506,10.000,-89.230},
				{544.987,469.367,10.000,-89.100},
				{592.967,490.228,10.000,-88.950},
				{643.033,511.089,10.000,-88.780},
				{695.185,531.949,10.000,-88.590},
				{749.423,552.810,10.000,-88.380},
				{805.747,573.671,10.000,-88.140},
				{864.157,594.532,10.000,-87.870},
				{924.653,615.392,10.000,-87.570},
				{987.235,636.253,10.000,-87.240},
				{1051.904,657.114,10.000,-86.870},
				{1118.658,677.975,10.000,-86.450},
				{1187.499,698.835,10.000,-86.000},
				{1258.425,719.696,10.000,-85.490},
				{1331.438,740.557,10.000,-84.930},
				{1406.537,761.418,10.000,-84.300},
				{1483.721,782.278,10.000,-83.620},
				{1562.992,803.139,10.000,-82.860},
				{1644.349,824.000,10.000,-82.020},
				{1727.792,844.861,10.000,-81.090},
				{1813.321,865.721,10.000,-80.070},
				{1900.936,886.582,10.000,-78.940},
				{1990.638,907.443,10.000,-77.690},
				{2082.425,928.304,10.000,-76.300},
				{2176.298,949.164,10.000,-74.780},
				{2272.258,970.025,10.000,-73.090},
				{2370.303,990.886,10.000,-71.230},
				{2470.435,1011.747,10.000,-69.180},
				{2572.653,1032.607,10.000,-66.930},
				{2676.957,1053.468,10.000,-64.460},
				{2783.346,1074.329,10.000,-61.770},
				{2891.822,1095.190,10.000,-58.860},
				{3002.384,1116.050,10.000,-55.730},
				{3115.032,1136.911,10.000,-52.400},
				{3229.767,1157.772,10.000,-48.900},
				{3346.587,1178.633,10.000,-45.280},
				{3465.493,1199.494,10.000,-41.580},
				{3586.486,1220.354,10.000,-37.880},
				{3709.564,1241.215,10.000,-34.220},
				{3834.729,1262.076,10.000,-30.670},
				{3961.979,1282.937,10.000,-27.270},
				{4091.316,1303.797,10.000,-24.070},
				{4222.739,1324.658,10.000,-21.080},
				{4356.248,1345.519,10.000,-18.320},
				{4491.842,1366.380,10.000,-15.790},
				{4629.523,1387.240,10.000,-13.490},
				{4769.291,1408.101,10.000,-11.400},
				{4911.144,1428.962,10.000,-9.530},
				{5055.083,1449.823,10.000,-7.850},
				{5201.108,1470.683,10.000,-6.360},
				{5349.220,1491.544,10.000,-5.040},
				{5499.417,1512.405,10.000,-3.880},
				{5651.701,1533.266,10.000,-2.880},
				{5806.070,1554.126,10.000,-2.020},
				{5962.526,1574.987,10.000,-1.300},
				{6121.068,1595.848,10.000,-0.720},
				{6281.695,1616.709,10.000,-0.280},
				{6444.409,1637.569,10.000,0.020},
				{6609.209,1658.430,10.000,0.180},
				{6776.095,1679.291,10.000,0.200},
				{6945.067,1700.152,10.000,0.170},
				{7116.126,1721.012,10.000,0.110},
				{7289.270,1741.873,10.000,0.020},
				{7464.500,1762.734,10.000,-0.100},
				{7641.817,1783.595,10.000,-0.260},
				{7821.219,1804.455,10.000,-0.440},
				{8002.708,1825.316,10.000,-0.650},
				{8186.282,1846.177,10.000,-0.880},
				{8371.943,1867.038,10.000,-1.150},
				{8559.690,1887.898,10.000,-1.450},
				{8749.523,1908.759,10.000,-1.770},
				{8941.442,1929.620,10.000,-2.120},
				{9135.447,1950.481,10.000,-2.490},
				{9331.463,1969.851,10.000,-2.890},
				{9529.343,1987.732,10.000,-3.320},
				{9728.935,2004.123,10.000,-3.760},
				{9930.093,2019.023,10.000,-4.230},
				{10132.666,2032.434,10.000,-4.720},
				{10336.505,2044.354,10.000,-5.220},
				{10541.462,2054.785,10.000,-5.740},
				{10747.387,2063.725,10.000,-6.270},
				{10954.132,2071.175,10.000,-6.820},
				{11161.548,2077.135,10.000,-7.370},
				{11369.485,2081.606,10.000,-7.930},
				{11577.794,2084.586,10.000,-8.500},
				{11786.328,2086.076,10.000,-9.070},
				{11994.935,2086.076,10.000,-9.640},
				{12203.543,2086.076,10.000,-10.210},
				{12412.150,2086.076,10.000,-10.780},
				{12620.758,2086.076,10.000,-11.340},
				{12829.365,2086.076,10.000,-11.900},
				{13037.973,2086.076,10.000,-12.450},
				{13246.581,2086.076,10.000,-12.990},
				{13455.188,2086.076,10.000,-13.520},
				{13663.796,2086.076,10.000,-14.040},
				{13872.403,2086.076,10.000,-14.540},
				{14081.011,2086.076,10.000,-15.030},
				{14289.618,2086.076,10.000,-15.510},
				{14498.226,2086.076,10.000,-15.970},
				{14706.833,2086.076,10.000,-16.420},
				{14915.441,2086.076,10.000,-16.840},
				{15124.049,2086.076,10.000,-17.250},
				{15332.656,2086.076,10.000,-17.640},
				{15541.264,2086.076,10.000,-18.010},
				{15749.871,2086.076,10.000,-18.360},
				{15958.479,2086.076,10.000,-18.680},
				{16167.086,2086.076,10.000,-18.990},
				{16375.694,2086.076,10.000,-19.270},
				{16584.302,2086.076,10.000,-19.530},
				{16792.909,2086.076,10.000,-19.770},
				{17001.517,2086.076,10.000,-19.980},
				{17210.124,2086.076,10.000,-20.170},
				{17418.732,2086.076,10.000,-20.340},
				{17627.339,2086.076,10.000,-20.480},
				{17835.947,2086.076,10.000,-20.600},
				{18044.555,2086.076,10.000,-20.700},
				{18253.162,2086.076,10.000,-20.770},
				{18461.770,2086.076,10.000,-20.810},
				{18670.377,2086.076,10.000,-20.830},
				{18878.985,2086.076,10.000,-20.830},
				{19087.568,2085.586,10.000,-20.800},
				{19296.027,2083.606,10.000,-20.750},
				{19504.215,2080.136,10.000,-20.680},
				{19711.980,2075.176,10.000,-20.580},
				{19919.175,2068.726,10.000,-20.450},
				{20125.651,2060.786,10.000,-20.310},
				{20331.258,2051.356,10.000,-20.140},
				{20535.848,2040.436,10.000,-19.950},
				{20739.271,2028.026,10.000,-19.740},
				{20941.378,2014.125,10.000,-19.500},
				{21142.021,1998.735,10.000,-19.250},
				{21341.051,1981.855,10.000,-18.980},
				{21538.318,1963.484,10.000,-18.690},
				{21733.673,1943.624,10.000,-18.390},
				{21926.992,1922.763,10.000,-18.070},
				{22118.226,1901.902,10.000,-17.730},
				{22307.373,1881.041,10.000,-17.390},
				{22494.434,1860.181,10.000,-17.030},
				{22679.409,1839.320,10.000,-16.660},
				{22862.298,1818.459,10.000,-16.280},
				{23043.101,1797.598,10.000,-15.890},
				{23221.817,1776.737,10.000,-15.490},
				{23398.448,1755.877,10.000,-15.090},
				{23572.993,1735.016,10.000,-14.680},
				{23745.451,1714.155,10.000,-14.260},
				{23915.824,1693.294,10.000,-13.850},
				{24084.110,1672.434,10.000,-13.430},
				{24250.311,1651.573,10.000,-13.000},
				{24414.425,1630.712,10.000,-12.580},
				{24576.453,1609.851,10.000,-12.150},
				{24736.395,1588.991,10.000,-11.730},
				{24894.251,1568.130,10.000,-11.310},
				{25050.021,1547.269,10.000,-10.890},
				{25203.705,1526.408,10.000,-10.470},
				{25355.303,1505.548,10.000,-10.060},
				{25504.814,1484.687,10.000,-9.650},
				{25652.240,1463.826,10.000,-9.250},
				{25797.580,1442.965,10.000,-8.850},
				{25940.833,1422.105,10.000,-8.460},
				{26082.001,1401.244,10.000,-8.070},
				{26221.082,1380.383,10.000,-7.690},
				{26358.077,1359.522,10.000,-7.330},
				{26492.986,1338.662,10.000,-6.960},
				{26625.810,1317.801,10.000,-6.610},
				{26756.547,1296.940,10.000,-6.270},
				{26885.198,1276.079,10.000,-5.930},
				{27011.763,1255.219,10.000,-5.610},
				{27136.241,1234.358,10.000,-5.290},
				{27258.634,1213.497,10.000,-4.990},
				{27378.941,1192.636,10.000,-4.690},
				{27497.161,1171.776,10.000,-4.410},
				{27613.296,1150.915,10.000,-4.130},
				{27727.344,1130.054,10.000,-3.870},
				{27839.307,1109.193,10.000,-3.610},
				{27949.183,1088.333,10.000,-3.370},
				{28056.973,1067.472,10.000,-3.130},
				{28162.677,1046.611,10.000,-2.910},
				{28266.295,1025.750,10.000,-2.700},
				{28367.827,1004.889,10.000,-2.490},
				{28467.273,984.029,10.000,-2.300},
				{28564.633,963.168,10.000,-2.110},
				{28659.907,942.307,10.000,-1.940},
				{28753.095,921.446,10.000,-1.770},
				{28844.196,900.586,10.000,-1.610},
				{28933.212,879.725,10.000,-1.460},
				{29020.141,858.864,10.000,-1.320},
				{29104.985,838.003,10.000,-1.190},
				{29187.742,817.143,10.000,-1.070},
				{29268.413,796.282,10.000,-0.950},
				{29346.998,775.421,10.000,-0.840},
				{29423.497,754.560,10.000,-0.740},
				{29497.910,733.700,10.000,-0.650},
				{29570.237,712.839,10.000,-0.560},
				{29640.478,691.978,10.000,-0.480},
				{29708.633,671.117,10.000,-0.410},
				{29774.702,650.257,10.000,-0.340},
				{29838.684,629.396,10.000,-0.280},
				{29900.581,608.535,10.000,-0.220},
				{29960.391,587.674,10.000,-0.170},
				{30018.116,566.814,10.000,-0.120},
				{30073.754,545.953,10.000,-0.080},
				{30127.306,525.092,10.000,-0.040},
				{30178.772,504.231,10.000,-0.010},
				{30228.152,483.371,10.000,0.020},
				{30275.446,462.510,10.000,0.050},
				{30320.654,441.649,10.000,0.080},
				{30363.776,420.788,10.000,0.100},
				{30404.812,399.928,10.000,0.110},
				{30443.762,379.067,10.000,0.130},
				{30480.625,358.206,10.000,0.140},
				{30515.403,337.345,10.000,0.150},
				{30548.094,316.485,10.000,0.160},
				{30578.700,295.624,10.000,0.170},
				{30607.219,274.763,10.000,0.180},
				{30633.653,253.902,10.000,0.180},
				{30658.000,233.041,10.000,0.190},
				{30680.261,212.181,10.000,0.190},
				{30700.436,191.320,10.000,0.190},
				{30718.525,170.459,10.000,0.200},
				{30734.528,149.598,10.000,0.200},
				{30748.469,129.228,10.000,0.200},
				{30760.448,110.347,10.000,0.200},
				{30770.613,92.956,10.000,0.200},
				{30779.113,77.055,10.000,0.200},
				{30786.098,62.644,10.000,0.200},
				{30791.717,49.724,10.000,0.200},
				{30796.118,38.293,10.000,0.200},
				{30799.450,28.352,10.000,0.200},
				{30801.862,19.902,10.000,0.200},
				{30803.505,12.941,10.000,0.200},
				{30804.525,7.471,10.000,0.200},
				{30805.073,3.491,10.000,0.200},
				{30805.298,1.000,10.000,0.200},
				{30805.348,0.000,10.000,0.200},
				{30805.348,0.000,10.000,0.200}		};

}