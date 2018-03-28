package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

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
				{-6923.069,-5557.374,10.000,0.000},
				{-7490.631,-5793.858,10.000,0.000},
				{-8081.841,-6030.342,10.000,0.000},
				{-8696.699,-6266.826,10.000,0.000},
				{-9335.206,-6503.310,10.000,0.000},
				{-9997.361,-6739.794,10.000,0.000},
				{-10683.164,-6976.278,10.000,0.000},
				{-11392.616,-7212.762,10.000,0.000},
				{-12125.717,-7449.246,10.000,0.000},
				{-12882.466,-7685.730,10.000,0.000},
				{-13662.863,-7922.214,10.000,0.000},
				{-14466.908,-8158.698,10.000,0.000},
				{-15294.602,-8395.182,10.000,0.000},
				{-16145.945,-8631.666,10.000,0.000},
				{-17020.936,-8868.150,10.000,0.000},
				{-17919.575,-9104.634,10.000,0.000},
				{-18841.862,-9341.118,10.000,0.000},
				{-19787.798,-9577.602,10.000,0.000},
				{-20757.383,-9814.086,10.000,0.000},
				{-21750.615,-10050.570,10.000,0.000},
				{-22767.497,-10287.054,10.000,0.000},
				{-23808.026,-10523.538,10.000,0.000},
				{-24872.204,-10760.022,10.000,0.000},
				{-25960.031,-10996.506,10.000,0.000},
				{-27071.505,-11232.990,10.000,0.000},
				{-28206.628,-11469.474,10.000,0.000},
				{-29365.400,-11705.958,10.000,0.000},
				{-30547.820,-11942.442,10.000,0.000},
				{-31753.888,-12178.926,10.000,0.000},
				{-32983.605,-12415.410,10.000,0.000},
				{-34236.970,-12651.894,10.000,0.000},
				{-35513.984,-12888.378,10.000,0.000},
				{-36814.646,-13124.862,10.000,0.000},
				{-38138.956,-13361.346,10.000,0.000},
				{-39486.915,-13597.830,10.000,0.000},
				{-40858.522,-13834.314,10.000,0.000},
				{-42253.778,-14070.798,10.000,0.000},
				{-43672.682,-14307.282,10.000,0.000},
				{-45115.234,-14543.766,10.000,0.000},
				{-46581.435,-14780.250,10.000,0.000},
				{-48071.284,-15016.734,10.000,0.000},
				{-49584.782,-15253.218,10.000,0.000},
				{-51121.928,-15489.702,10.000,0.000},
				{-52682.722,-15726.186,10.000,0.000},
				{-54267.165,-15962.670,10.000,0.000},
				{-55875.256,-16199.154,10.000,0.000},
				{-57506.995,-16435.638,10.000,0.000},
				{-59162.383,-16672.122,10.000,0.000},
				{-60841.420,-16908.606,10.000,0.000},
				{-62544.105,-17145.090,10.000,0.000},
				{-64270.438,-17381.574,10.000,0.000},
				{-66020.419,-17618.058,10.000,0.000},
				{-67793.458,-17842.717,10.000,0.000},
				{-69588.372,-18055.553,10.000,0.000},
				{-71403.977,-18256.564,10.000,0.000},
				{-73239.093,-18445.752,10.000,0.000},
				{-75092.537,-18623.115,10.000,0.000},
				{-76963.125,-18788.653,10.000,0.000},
				{-78849.676,-18942.368,10.000,0.000},
				{-80751.007,-19084.258,10.000,0.000},
				{-82665.936,-19214.325,10.000,0.000},
				{-84593.281,-19332.567,10.000,0.000},
				{-86531.859,-19438.984,10.000,0.000},
				{-88480.487,-19533.578,10.000,0.000},
				{-90437.983,-19616.347,10.000,0.000},
				{-92403.165,-19687.293,10.000,0.000},
				{-94374.850,-19746.414,10.000,0.000},
				{-96351.856,-19793.710,10.000,0.000},
				{-98333.001,-19829.183,10.000,0.000},
				{-100317.102,-19852.831,10.000,0.000},
				{-102302.976,-19864.656,10.000,0.000},
				{-104289.442,-19864.656,10.000,0.000},
				{-106275.907,-19864.656,10.000,0.000},
				{-108262.373,-19864.656,10.000,0.000},
				{-110248.838,-19864.656,10.000,0.000},
				{-112235.304,-19864.656,10.000,0.000},
				{-114221.770,-19864.656,10.000,0.000},
				{-116208.235,-19864.656,10.000,0.000},
				{-118194.701,-19864.656,10.000,0.000},
				{-120181.166,-19864.656,10.000,0.000},
				{-122167.632,-19864.656,10.000,0.000},
				{-124154.097,-19864.656,10.000,0.000},
				{-126140.563,-19864.656,10.000,0.000},
				{-128127.028,-19864.656,10.000,0.000},
				{-130113.494,-19864.656,10.000,0.000},
				{-132099.960,-19864.656,10.000,0.000},
				{-134086.425,-19864.656,10.000,0.000},
				{-136072.891,-19864.656,10.000,0.000},
				{-138059.356,-19864.656,10.000,0.000},
				{-140045.822,-19864.656,10.000,0.000},
				{-142032.287,-19864.656,10.000,0.000},
				{-144018.753,-19864.656,10.000,0.000},
				{-146005.218,-19864.656,10.000,0.000},
				{-147991.684,-19864.656,10.000,0.000},
				{-149978.150,-19864.656,10.000,0.000},
				{-151964.615,-19864.656,10.000,0.000},
				{-153951.081,-19864.656,10.000,0.000},
				{-155937.546,-19864.656,10.000,0.000},
				{-157924.012,-19864.656,10.000,0.000},
				{-159910.477,-19864.656,10.000,0.000},
				{-161896.943,-19864.656,10.000,0.000},
				{-163883.408,-19864.656,10.000,0.000},
				{-165869.874,-19864.656,10.000,0.000},
				{-167856.340,-19864.656,10.000,0.000},
				{-169842.805,-19864.656,10.000,0.000},
				{-171829.271,-19864.656,10.000,0.000},
				{-173815.736,-19864.656,10.000,0.000},
				{-175802.202,-19864.656,10.000,0.000},
				{-177788.667,-19864.656,10.000,0.000},
				{-179775.133,-19864.656,10.000,0.000},
				{-181761.598,-19864.656,10.000,0.000},
				{-183748.064,-19864.656,10.000,0.000},
				{-185734.530,-19864.656,10.000,0.000},
				{-187720.995,-19864.656,10.000,0.000},
				{-189707.461,-19864.656,10.000,0.000},
				{-191693.926,-19864.656,10.000,0.000},
				{-193680.392,-19864.656,10.000,0.000},
				{-195666.857,-19864.656,10.000,0.000},
				{-197653.323,-19864.656,10.000,0.000},
				{-199639.788,-19864.656,10.000,0.000},
				{-201626.254,-19864.656,10.000,0.000},
				{-203612.720,-19864.656,10.000,0.000},
				{-205599.185,-19864.656,10.000,0.000},
				{-207585.651,-19864.656,10.000,0.000},
				{-209572.116,-19864.656,10.000,0.000},
				{-211558.582,-19864.656,10.000,0.000},
				{-213545.047,-19864.656,10.000,0.000},
				{-215531.513,-19864.656,10.000,0.000},
				{-217517.978,-19864.656,10.000,0.000},
				{-219504.444,-19864.656,10.000,0.000},
				{-221490.910,-19864.656,10.000,0.000},
				{-223477.375,-19864.656,10.000,0.000},
				{-225463.841,-19864.656,10.000,0.000},
				{-227450.306,-19864.656,10.000,0.000},
				{-229436.772,-19864.656,10.000,0.000},
				{-231423.237,-19864.656,10.000,0.000},
				{-233409.703,-19864.656,10.000,0.000},
				{-235396.168,-19864.656,10.000,0.000},
				{-237382.634,-19864.656,10.000,0.000},
				{-239369.100,-19864.656,10.000,0.000},
				{-241355.565,-19864.656,10.000,0.000},
				{-243342.031,-19864.656,10.000,0.000},
				{-245328.496,-19864.656,10.000,0.000},
				{-247314.962,-19864.656,10.000,0.000},
				{-249301.427,-19864.656,10.000,0.000},
				{-251287.893,-19864.656,10.000,0.000},
				{-253274.358,-19864.656,10.000,0.000},
				{-255260.824,-19864.656,10.000,0.000},
				{-257247.290,-19864.656,10.000,0.000},
				{-259233.755,-19864.656,10.000,0.000},
				{-261220.221,-19864.656,10.000,0.000},
				{-263206.686,-19864.656,10.000,0.000},
				{-265193.152,-19864.656,10.000,0.000},
				{-267179.519,-19862.685,10.000,0.000},
				{-269165.098,-19848.890,10.000,0.000},
				{-271148.706,-19823.271,10.000,0.000},
				{-273129.161,-19785.828,10.000,0.000},
				{-275105.280,-19736.560,10.000,0.000},
				{-277075.881,-19675.468,10.000,0.000},
				{-279039.782,-19602.552,10.000,0.000},
				{-280995.801,-19517.812,10.000,0.000},
				{-282942.754,-19421.248,10.000,0.000},
				{-284879.459,-19312.860,10.000,0.000},
				{-286804.734,-19192.647,10.000,0.000},
				{-288717.397,-19060.610,10.000,0.000},
				{-290616.265,-18916.749,10.000,0.000},
				{-292500.156,-18761.064,10.000,0.000},
				{-294367.887,-18593.554,10.000,0.000},
				{-296218.275,-18414.220,10.000,0.000},
				{-298050.140,-18223.063,10.000,0.000},
				{-299862.297,-18020.080,10.000,0.000},
				{-301653.564,-17805.274,10.000,0.000},
				{-303422.760,-17578.644,10.000,0.000},
				{-305168.800,-17342.160,10.000,0.000},
				{-306891.192,-17105.676,10.000,0.000},
				{-308589.936,-16869.192,10.000,0.000},
				{-310265.031,-16632.708,10.000,0.000},
				{-311916.477,-16396.224,10.000,0.000},
				{-313544.275,-16159.740,10.000,0.000},
				{-315148.425,-15923.256,10.000,0.000},
				{-316728.926,-15686.772,10.000,0.000},
				{-318285.779,-15450.288,10.000,0.000},
				{-319818.984,-15213.804,10.000,0.000},
				{-321328.540,-14977.320,10.000,0.000},
				{-322814.448,-14740.836,10.000,0.000},
				{-324276.707,-14504.352,10.000,0.000},
				{-325715.318,-14267.868,10.000,0.000},
				{-327130.281,-14031.384,10.000,0.000},
				{-328521.595,-13794.900,10.000,0.000},
				{-329889.261,-13558.416,10.000,0.000},
				{-331233.278,-13321.932,10.000,0.000},
				{-332553.647,-13085.448,10.000,0.000},
				{-333850.368,-12848.964,10.000,0.000},
				{-335123.440,-12612.480,10.000,0.000},
				{-336372.864,-12375.996,10.000,0.000},
				{-337598.639,-12139.512,10.000,0.000},
				{-338800.766,-11903.028,10.000,0.000},
				{-339979.245,-11666.544,10.000,0.000},
				{-341134.075,-11430.060,10.000,0.000},
				{-342265.256,-11193.576,10.000,0.000},
				{-343372.790,-10957.092,10.000,0.000},
				{-344456.675,-10720.608,10.000,0.000},
				{-345516.911,-10484.124,10.000,0.000},
				{-346553.500,-10247.640,10.000,0.000},
				{-347566.439,-10011.156,10.000,0.000},
				{-348555.731,-9774.672,10.000,0.000},
				{-349521.374,-9538.188,10.000,0.000},
				{-350463.368,-9301.704,10.000,0.000},
				{-351381.714,-9065.220,10.000,0.000},
				{-352276.412,-8828.736,10.000,0.000},
				{-353147.462,-8592.252,10.000,0.000},
				{-353994.863,-8355.768,10.000,0.000},
				{-354818.615,-8119.284,10.000,0.000},
				{-355618.719,-7882.800,10.000,0.000},
				{-356395.175,-7646.316,10.000,0.000},
				{-357147.983,-7409.832,10.000,0.000},
				{-357877.142,-7173.348,10.000,0.000},
				{-358582.652,-6936.864,10.000,0.000},
				{-359264.514,-6700.380,10.000,0.000},
				{-359922.728,-6463.896,10.000,0.000},
				{-360557.293,-6227.412,10.000,0.000},
				{-361168.210,-5990.928,10.000,0.000},
				{-361755.479,-5754.444,10.000,0.000},
				{-362319.099,-5517.960,10.000,0.000},
				{-362859.071,-5281.476,10.000,0.000},
				{-363375.394,-5044.992,10.000,0.000},
				{-363868.069,-4808.508,10.000,0.000},
				{-364337.096,-4572.024,10.000,0.000},
				{-364782.474,-4335.540,10.000,0.000},
				{-365204.204,-4099.056,10.000,0.000},
				{-365602.285,-3862.572,10.000,0.000},
				{-365976.718,-3626.088,10.000,0.000},
				{-366327.503,-3389.604,10.000,0.000},
				{-366654.639,-3153.120,10.000,0.000},
				{-366958.127,-2916.636,10.000,0.000},
				{-367237.966,-2680.152,10.000,0.000},
				{-367494.157,-2443.668,10.000,0.000},
				{-367726.798,-2209.155,10.000,0.000},
				{-367936.579,-1986.466,10.000,0.000},
				{-368124.683,-1775.601,10.000,0.000},
				{-368292.291,-1576.560,10.000,0.000},
				{-368440.586,-1389.343,10.000,0.000},
				{-368570.751,-1213.951,10.000,0.000},
				{-368683.967,-1050.383,10.000,0.000},
				{-368781.419,-898.639,10.000,0.000},
				{-368864.286,-758.719,10.000,0.000},
				{-368933.754,-630.624,10.000,0.000},
				{-368991.002,-514.353,10.000,0.000},
				{-369037.215,-409.906,10.000,0.000},
				{-369073.575,-317.283,10.000,0.000},
				{-369101.263,-236.484,10.000,0.000},
				{-369121.463,-167.509,10.000,0.000},
				{-369135.356,-110.359,10.000,0.000},
				{-369144.126,-65.033,10.000,0.000},
				{-369148.954,-31.531,10.000,0.000},
				{-369151.023,-9.853,10.000,0.000},
				{-369151.516,-0.000,10.000,0.000},
				{-369151.516,-0.000,10.000,0.000}		};

}