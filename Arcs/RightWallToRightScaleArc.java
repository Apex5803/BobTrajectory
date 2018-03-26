package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (17.63,4.79,10.00)
	// (24.13,6.79,0.00)
	
    public RightWallToRightScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.591,-11.824,10.000,0.000},
				{-2.956,-35.473,10.000,0.000},
				{-8.277,-70.945,10.000,0.000},
				{-17.736,-118.242,10.000,0.000},
				{-32.517,-177.363,10.000,0.000},
				{-53.800,-248.308,10.000,0.000},
				{-82.769,-331.078,10.000,0.000},
				{-120.607,-425.671,10.000,0.000},
				{-168.495,-532.089,10.000,0.000},
				{-227.616,-650.331,10.000,0.000},
				{-299.152,-780.397,10.000,0.000},
				{-384.286,-922.288,10.000,0.000},
				{-484.201,-1076.002,10.000,0.000},
				{-600.078,-1241.541,10.000,0.000},
				{-733.100,-1418.904,10.000,0.000},
				{-884.450,-1608.091,10.000,0.000},
				{-1055.310,-1809.103,10.000,0.000},
				{-1246.862,-2021.938,10.000,0.000},
				{-1460.289,-2246.598,10.000,0.000},
				{-1696.773,-2483.082,10.000,0.000},
				{-1956.905,-2719.566,10.000,0.000},
				{-2240.686,-2956.050,10.000,0.000},
				{-2548.115,-3192.534,10.000,0.000},
				{-2879.193,-3429.018,10.000,0.000},
				{-3233.919,-3665.502,10.000,0.000},
				{-3612.293,-3901.986,10.000,0.000},
				{-4014.316,-4138.470,10.000,0.000},
				{-4439.987,-4374.954,10.000,0.000},
				{-4889.307,-4611.438,10.000,0.000},
				{-5362.275,-4847.922,10.000,0.000},
				{-5858.891,-5084.406,10.000,0.000},
				{-6379.156,-5320.890,10.000,0.000},
				{-6923.069,-5557.374,10.000,-0.010},
				{-7490.631,-5793.858,10.000,-0.010},
				{-8081.841,-6030.342,10.000,-0.010},
				{-8696.699,-6266.826,10.000,-0.010},
				{-9335.206,-6503.310,10.000,-0.010},
				{-9997.361,-6739.794,10.000,-0.010},
				{-10683.164,-6976.278,10.000,-0.010},
				{-11392.616,-7212.762,10.000,-0.010},
				{-12125.717,-7449.246,10.000,-0.020},
				{-12882.466,-7685.730,10.000,-0.020},
				{-13662.863,-7922.214,10.000,-0.020},
				{-14466.908,-8158.698,10.000,-0.020},
				{-15294.602,-8395.182,10.000,-0.020},
				{-16145.945,-8631.666,10.000,-0.020},
				{-17020.936,-8868.150,10.000,-0.030},
				{-17919.575,-9104.634,10.000,-0.030},
				{-18841.862,-9341.118,10.000,-0.030},
				{-19787.798,-9577.602,10.000,-0.030},
				{-20757.383,-9814.086,10.000,-0.040},
				{-21750.615,-10050.570,10.000,-0.040},
				{-22767.497,-10287.054,10.000,-0.040},
				{-23808.026,-10523.538,10.000,-0.050},
				{-24872.204,-10760.022,10.000,-0.050},
				{-25960.031,-10996.506,10.000,-0.050},
				{-27071.505,-11232.990,10.000,-0.050},
				{-28206.628,-11469.474,10.000,-0.060},
				{-29365.400,-11705.958,10.000,-0.060},
				{-30547.820,-11942.442,10.000,-0.060},
				{-31753.888,-12178.926,10.000,-0.070},
				{-32983.605,-12415.410,10.000,-0.070},
				{-34236.970,-12651.894,10.000,-0.070},
				{-35513.984,-12888.378,10.000,-0.080},
				{-36814.646,-13124.862,10.000,-0.080},
				{-38138.956,-13361.346,10.000,-0.080},
				{-39486.915,-13597.830,10.000,-0.080},
				{-40858.522,-13834.314,10.000,-0.080},
				{-42253.778,-14070.798,10.000,-0.090},
				{-43672.682,-14307.282,10.000,-0.090},
				{-45115.234,-14543.766,10.000,-0.090},
				{-46581.435,-14780.250,10.000,-0.090},
				{-48071.284,-15016.734,10.000,-0.090},
				{-49584.782,-15253.218,10.000,-0.090},
				{-51121.928,-15489.702,10.000,-0.090},
				{-52682.722,-15726.186,10.000,-0.090},
				{-54267.165,-15962.670,10.000,-0.090},
				{-55875.256,-16199.154,10.000,-0.080},
				{-57506.995,-16435.638,10.000,-0.080},
				{-59162.383,-16672.122,10.000,-0.070},
				{-60841.420,-16908.606,10.000,-0.070},
				{-62544.105,-17145.090,10.000,-0.060},
				{-64270.438,-17381.574,10.000,-0.060},
				{-66020.419,-17618.058,10.000,-0.050},
				{-67793.458,-17842.717,10.000,-0.040},
				{-69588.372,-18055.553,10.000,-0.030},
				{-71403.977,-18256.564,10.000,-0.020},
				{-73239.093,-18445.752,10.000,0.000},
				{-75092.537,-18623.115,10.000,0.010},
				{-76963.125,-18788.653,10.000,0.030},
				{-78849.676,-18942.368,10.000,0.040},
				{-80751.007,-19084.258,10.000,0.060},
				{-82665.936,-19214.325,10.000,0.080},
				{-84593.281,-19332.567,10.000,0.110},
				{-86531.859,-19438.984,10.000,0.130},
				{-88480.487,-19533.578,10.000,0.160},
				{-90437.983,-19616.347,10.000,0.180},
				{-92403.165,-19687.293,10.000,0.210},
				{-94374.850,-19746.414,10.000,0.250},
				{-96351.856,-19793.710,10.000,0.280},
				{-98333.001,-19829.183,10.000,0.310},
				{-100317.102,-19852.831,10.000,0.350},
				{-102302.976,-19864.656,10.000,0.390},
				{-104289.442,-19864.656,10.000,0.430},
				{-106275.907,-19864.656,10.000,0.470},
				{-108262.373,-19864.656,10.000,0.520},
				{-110248.838,-19864.656,10.000,0.560},
				{-112235.304,-19864.656,10.000,0.610},
				{-114221.770,-19864.656,10.000,0.660},
				{-116208.235,-19864.656,10.000,0.710},
				{-118194.701,-19864.656,10.000,0.770},
				{-120181.166,-19864.656,10.000,0.820},
				{-122167.632,-19864.656,10.000,0.880},
				{-124154.097,-19864.656,10.000,0.940},
				{-126140.563,-19864.656,10.000,1.000},
				{-128127.028,-19864.656,10.000,1.070},
				{-130113.494,-19864.656,10.000,1.130},
				{-132099.960,-19864.656,10.000,1.200},
				{-134086.425,-19864.656,10.000,1.270},
				{-136072.891,-19864.656,10.000,1.340},
				{-138059.356,-19864.656,10.000,1.410},
				{-140045.822,-19864.656,10.000,1.490},
				{-142032.287,-19864.656,10.000,1.570},
				{-144018.753,-19864.656,10.000,1.640},
				{-146005.218,-19864.656,10.000,1.730},
				{-147991.684,-19864.656,10.000,1.810},
				{-149978.150,-19864.656,10.000,1.890},
				{-151964.615,-19864.656,10.000,1.980},
				{-153951.081,-19864.656,10.000,2.070},
				{-155937.546,-19864.656,10.000,2.160},
				{-157924.012,-19864.656,10.000,2.250},
				{-159910.477,-19864.656,10.000,2.340},
				{-161896.943,-19864.656,10.000,2.440},
				{-163883.408,-19864.656,10.000,2.530},
				{-165869.874,-19864.656,10.000,2.630},
				{-167856.340,-19864.656,10.000,2.730},
				{-169842.805,-19864.656,10.000,2.830},
				{-171829.271,-19864.656,10.000,2.940},
				{-173815.736,-19864.656,10.000,3.040},
				{-175802.202,-19864.656,10.000,3.150},
				{-177788.667,-19864.656,10.000,3.250},
				{-179775.133,-19864.656,10.000,3.360},
				{-181761.598,-19864.656,10.000,3.470},
				{-183748.064,-19864.656,10.000,3.580},
				{-185734.530,-19864.656,10.000,3.690},
				{-187720.995,-19864.656,10.000,3.810},
				{-189707.461,-19864.656,10.000,3.920},
				{-191693.926,-19864.656,10.000,4.040},
				{-193680.392,-19864.656,10.000,4.150},
				{-195666.857,-19864.656,10.000,4.270},
				{-197653.323,-19864.656,10.000,4.390},
				{-199639.788,-19864.656,10.000,4.510},
				{-201626.254,-19864.656,10.000,4.630},
				{-203612.720,-19864.656,10.000,4.750},
				{-205599.185,-19864.656,10.000,4.870},
				{-207585.651,-19864.656,10.000,4.990},
				{-209572.116,-19864.656,10.000,5.120},
				{-211558.582,-19864.656,10.000,5.240},
				{-213545.047,-19864.656,10.000,5.360},
				{-215531.513,-19864.656,10.000,5.480},
				{-217517.978,-19864.656,10.000,5.610},
				{-219504.444,-19864.656,10.000,5.730},
				{-221490.910,-19864.656,10.000,5.860},
				{-223477.375,-19864.656,10.000,5.980},
				{-225463.841,-19864.656,10.000,6.100},
				{-227450.306,-19864.656,10.000,6.230},
				{-229436.772,-19864.656,10.000,6.350},
				{-231423.237,-19864.656,10.000,6.470},
				{-233409.703,-19864.656,10.000,6.590},
				{-235396.168,-19864.656,10.000,6.720},
				{-237382.634,-19864.656,10.000,6.840},
				{-239369.100,-19864.656,10.000,6.960},
				{-241355.565,-19864.656,10.000,7.080},
				{-243342.031,-19864.656,10.000,7.200},
				{-245328.496,-19864.656,10.000,7.310},
				{-247314.962,-19864.656,10.000,7.430},
				{-249301.427,-19864.656,10.000,7.550},
				{-251287.893,-19864.656,10.000,7.660},
				{-253274.358,-19864.656,10.000,7.770},
				{-255260.824,-19864.656,10.000,7.880},
				{-257247.290,-19864.656,10.000,7.990},
				{-259233.755,-19864.656,10.000,8.100},
				{-261220.221,-19864.656,10.000,8.210},
				{-263206.686,-19864.656,10.000,8.310},
				{-265193.152,-19864.656,10.000,8.410},
				{-267179.617,-19864.656,10.000,8.510},
				{-269166.083,-19864.656,10.000,8.610},
				{-271152.549,-19864.656,10.000,8.710},
				{-273139.014,-19864.656,10.000,8.800},
				{-275125.480,-19864.656,10.000,8.890},
				{-277111.945,-19864.656,10.000,8.980},
				{-279098.411,-19864.656,10.000,9.070},
				{-281084.876,-19864.656,10.000,9.150},
				{-283071.342,-19864.656,10.000,9.230},
				{-285057.807,-19864.656,10.000,9.300},
				{-287044.273,-19864.656,10.000,9.380},
				{-289030.739,-19864.656,10.000,9.450},
				{-291017.204,-19864.656,10.000,9.510},
				{-293003.670,-19864.656,10.000,9.580},
				{-294990.135,-19864.656,10.000,9.630},
				{-296976.601,-19864.656,10.000,9.690},
				{-298963.066,-19864.656,10.000,9.740},
				{-300949.532,-19864.656,10.000,9.790},
				{-302935.997,-19864.656,10.000,9.830},
				{-304922.463,-19864.656,10.000,9.870},
				{-306908.929,-19864.656,10.000,9.900},
				{-308895.394,-19864.656,10.000,9.930},
				{-310881.860,-19864.656,10.000,9.950},
				{-312868.325,-19864.656,10.000,9.970},
				{-314854.791,-19864.656,10.000,9.990},
				{-316841.256,-19864.656,10.000,10.000},
				{-318827.722,-19864.656,10.000,10.000},
				{-320814.187,-19864.656,10.000,10.050},
				{-322800.653,-19864.656,10.000,10.230},
				{-324787.119,-19864.656,10.000,10.540},
				{-326773.584,-19864.656,10.000,10.950},
				{-328760.050,-19864.656,10.000,11.450},
				{-330746.515,-19864.656,10.000,12.040},
				{-332732.981,-19864.656,10.000,12.710},
				{-334719.446,-19864.656,10.000,13.440},
				{-336705.912,-19864.656,10.000,14.220},
				{-338692.377,-19864.656,10.000,15.040},
				{-340678.843,-19864.656,10.000,15.900},
				{-342665.309,-19864.656,10.000,16.790},
				{-344651.774,-19864.656,10.000,17.680},
				{-346638.240,-19864.656,10.000,18.580},
				{-348624.705,-19864.656,10.000,19.480},
				{-350611.171,-19864.656,10.000,20.360},
				{-352597.636,-19864.656,10.000,21.220},
				{-354583.776,-19858.135,10.000,22.060},
				{-356568.672,-19839.790,10.000,22.850},
				{-358551.143,-19809.621,10.000,23.610},
				{-360530.005,-19767.628,10.000,24.320},
				{-362504.077,-19713.811,10.000,24.980},
				{-364472.176,-19648.169,10.000,25.580},
				{-366433.120,-19570.704,10.000,26.120},
				{-368385.726,-19481.414,10.000,26.600},
				{-370328.811,-19380.299,10.000,27.020},
				{-372261.194,-19267.361,10.000,27.370},
				{-374181.692,-19142.599,10.000,27.660},
				{-376089.123,-19006.012,10.000,27.880},
				{-377982.303,-18857.601,10.000,28.030},
				{-379860.052,-18697.366,10.000,28.110},
				{-381721.185,-18525.306,10.000,28.130},
				{-383564.522,-18341.423,10.000,28.090},
				{-385388.879,-18145.715,10.000,27.980},
				{-387193.074,-17938.183,10.000,27.810},
				{-388975.924,-17718.827,10.000,27.580},
				{-390736.248,-17487.647,10.000,27.300},
				{-392473.188,-17251.163,10.000,26.960},
				{-394186.480,-17014.679,10.000,26.570},
				{-395876.124,-16778.195,10.000,26.130},
				{-397542.119,-16541.711,10.000,25.650},
				{-399184.466,-16305.227,10.000,25.120},
				{-400803.165,-16068.743,10.000,24.550},
				{-402398.215,-15832.259,10.000,23.950},
				{-403969.616,-15595.775,10.000,23.310},
				{-405517.370,-15359.291,10.000,22.640},
				{-407041.474,-15122.807,10.000,21.950},
				{-408541.931,-14886.323,10.000,21.230},
				{-410018.739,-14649.839,10.000,20.490},
				{-411471.899,-14413.355,10.000,19.740},
				{-412901.410,-14176.871,10.000,18.970},
				{-414307.273,-13940.387,10.000,18.200},
				{-415689.487,-13703.903,10.000,17.410},
				{-417048.053,-13467.419,10.000,16.630},
				{-418382.971,-13230.935,10.000,15.850},
				{-419694.240,-12994.451,10.000,15.070},
				{-420981.861,-12757.967,10.000,14.300},
				{-422245.834,-12521.483,10.000,13.540},
				{-423486.158,-12284.999,10.000,12.800},
				{-424702.833,-12048.515,10.000,12.060},
				{-425895.861,-11812.031,10.000,11.350},
				{-427065.239,-11575.547,10.000,10.650},
				{-428210.970,-11339.063,10.000,9.970},
				{-429333.052,-11102.579,10.000,9.320},
				{-430431.486,-10866.095,10.000,8.680},
				{-431506.271,-10629.611,10.000,8.070},
				{-432557.408,-10393.127,10.000,7.490},
				{-433584.896,-10156.643,10.000,6.930},
				{-434588.736,-9920.159,10.000,6.400},
				{-435568.928,-9683.675,10.000,5.890},
				{-436525.471,-9447.191,10.000,5.410},
				{-437458.366,-9210.707,10.000,4.950},
				{-438367.613,-8974.223,10.000,4.520},
				{-439253.211,-8737.739,10.000,4.120},
				{-440115.160,-8501.255,10.000,3.740},
				{-440953.462,-8264.771,10.000,3.380},
				{-441768.115,-8028.287,10.000,3.050},
				{-442559.119,-7791.803,10.000,2.740},
				{-443326.475,-7555.319,10.000,2.450},
				{-444070.183,-7318.835,10.000,2.190},
				{-444790.242,-7082.351,10.000,1.950},
				{-445486.653,-6845.867,10.000,1.720},
				{-446159.416,-6609.383,10.000,1.520},
				{-446808.530,-6372.899,10.000,1.330},
				{-447433.995,-6136.415,10.000,1.160},
				{-448035.813,-5899.931,10.000,1.000},
				{-448613.981,-5663.447,10.000,0.870},
				{-449168.502,-5426.963,10.000,0.740},
				{-449699.374,-5190.479,10.000,0.630},
				{-450206.598,-4953.995,10.000,0.540},
				{-450690.173,-4717.511,10.000,0.450},
				{-451150.100,-4481.027,10.000,0.370},
				{-451586.378,-4244.543,10.000,0.310},
				{-451999.008,-4008.059,10.000,0.250},
				{-452387.990,-3771.575,10.000,0.200},
				{-452753.323,-3535.091,10.000,0.160},
				{-453095.008,-3298.607,10.000,0.130},
				{-453413.045,-3062.123,10.000,0.100},
				{-453707.433,-2825.639,10.000,0.080},
				{-453978.173,-2589.155,10.000,0.060},
				{-454225.264,-2352.671,10.000,0.040},
				{-454449.033,-2122.707,10.000,0.030},
				{-454650.397,-1904.568,10.000,0.020},
				{-454830.538,-1698.253,10.000,0.020},
				{-454990.638,-1503.762,10.000,0.010},
				{-455131.881,-1321.096,10.000,0.010},
				{-455255.449,-1150.253,10.000,0.010},
				{-455362.523,-991.235,10.000,0.000},
				{-455454.287,-844.041,10.000,0.000},
				{-455531.923,-708.671,10.000,0.000},
				{-455596.612,-585.125,10.000,0.000},
				{-455649.539,-473.404,10.000,0.000},
				{-455691.884,-373.507,10.000,0.000},
				{-455724.832,-285.434,10.000,0.000},
				{-455749.562,-209.185,10.000,0.000},
				{-455767.260,-144.760,10.000,0.000},
				{-455779.106,-92.160,10.000,0.000},
				{-455786.283,-51.384,10.000,0.000},
				{-455789.974,-22.431,10.000,0.000},
				{-455791.360,-5.304,10.000,0.000},
				{-455791.626,-0.000,10.000,0.000},
				{-455791.626,-0.000,10.000,0.000}		};

}