package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToLeftScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (13.13,3.79,0.00)
	// (17.13,8.79,89.99)
	// (17.13,17.79,89.99)
	// (23.13,21.79,0.00)
	
    public RightWallToLeftScaleArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToLeftScaleArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{-0.445,-8.895,10.000,0.000},
				{-2.224,-17.789,10.000,0.000},
				{-6.226,-40.025,10.000,0.000},
				{-13.342,-71.156,10.000,0.000},
				{-24.460,-111.181,10.000,0.000},
				{-40.470,-160.101,10.000,0.000},
				{-62.262,-217.915,10.000,0.000},
				{-90.724,-284.624,10.000,0.000},
				{-126.747,-360.227,10.000,0.000},
				{-171.219,-444.725,10.000,0.000},
				{-225.031,-538.118,10.000,0.000},
				{-289.071,-640.404,10.000,0.000},
				{-364.230,-751.586,10.000,0.000},
				{-451.396,-871.662,10.000,0.000},
				{-551.459,-1000.632,10.000,0.000},
				{-665.309,-1138.497,10.000,0.000},
				{-793.835,-1285.256,10.000,0.000},
				{-937.926,-1440.910,10.000,0.000},
				{-1098.471,-1605.458,10.000,0.000},
				{-1276.361,-1778.901,10.000,0.000},
				{-1472.041,-1956.791,10.000,0.000},
				{-1685.509,-2134.681,10.000,0.000},
				{-1916.766,-2312.571,10.000,0.000},
				{-2165.812,-2490.461,10.000,0.000},
				{-2432.647,-2668.352,10.000,0.000},
				{-2717.271,-2846.242,10.000,0.000},
				{-3019.684,-3024.132,10.000,0.000},
				{-3339.887,-3202.022,10.000,0.000},
				{-3677.878,-3379.912,10.000,0.000},
				{-4033.658,-3557.802,10.000,0.000},
				{-4407.227,-3735.692,10.000,0.000},
				{-4798.586,-3913.582,10.000,0.000},
				{-5207.733,-4091.472,10.000,0.000},
				{-5634.669,-4269.362,10.000,0.000},
				{-6079.394,-4447.253,10.000,0.000},
				{-6541.909,-4625.143,10.000,0.000},
				{-7022.212,-4803.033,10.000,0.000},
				{-7520.304,-4980.923,10.000,0.000},
				{-8036.185,-5158.813,10.000,0.000},
				{-8569.856,-5336.703,10.000,0.000},
				{-9121.315,-5514.593,10.000,0.000},
				{-9690.563,-5692.483,10.000,0.000},
				{-10277.601,-5870.373,10.000,0.000},
				{-10882.427,-6048.263,10.000,0.000},
				{-11505.042,-6226.154,10.000,0.000},
				{-12145.447,-6404.044,10.000,0.000},
				{-12803.640,-6581.934,10.000,0.000},
				{-13479.623,-6759.824,10.000,0.000},
				{-14173.394,-6937.714,10.000,0.000},
				{-14884.954,-7115.604,10.000,0.000},
				{-15613.859,-7289.047,10.000,0.000},
				{-16359.219,-7453.595,10.000,0.000},
				{-17120.143,-7609.249,10.000,0.000},
				{-17895.744,-7756.008,10.000,0.000},
				{-18685.132,-7893.873,10.000,0.000},
				{-19487.416,-8022.844,10.000,0.000},
				{-20301.708,-8142.919,10.000,0.000},
				{-21127.118,-8254.101,10.000,0.000},
				{-21962.757,-8356.388,10.000,0.000},
				{-22807.735,-8449.780,10.000,0.000},
				{-23661.163,-8534.278,10.000,0.000},
				{-24522.151,-8609.881,10.000,0.000},
				{-25389.810,-8676.590,10.000,0.000},
				{-26263.250,-8734.404,10.000,0.000},
				{-27141.582,-8783.324,10.000,0.000},
				{-28023.917,-8823.349,10.000,0.000},
				{-28909.365,-8854.480,10.000,0.000},
				{-29797.037,-8876.716,10.000,0.000},
				{-30686.043,-8890.058,10.000,0.000},
				{-31575.493,-8894.505,10.000,0.000},
				{-32464.944,-8894.505,10.000,0.000},
				{-33354.394,-8894.505,10.000,0.000},
				{-34243.845,-8894.505,10.000,0.000},
				{-35133.295,-8894.505,10.000,0.000},
				{-36022.746,-8894.505,10.000,0.000},
				{-36912.196,-8894.505,10.000,0.000},
				{-37801.647,-8894.505,10.000,0.000},
				{-38691.097,-8894.505,10.000,0.000},
				{-39580.548,-8894.505,10.000,0.000},
				{-40469.998,-8894.505,10.000,0.000},
				{-41359.449,-8894.505,10.000,0.000},
				{-42248.899,-8894.505,10.000,0.000},
				{-43138.350,-8894.505,10.000,0.000},
				{-44027.800,-8894.505,10.000,0.000},
				{-44917.251,-8894.505,10.000,0.000},
				{-45806.701,-8894.505,10.000,0.000},
				{-46696.152,-8894.505,10.000,0.000},
				{-47585.602,-8894.505,10.000,0.000},
				{-48475.053,-8894.505,10.000,0.000},
				{-49364.504,-8894.505,10.000,0.000},
				{-50253.954,-8894.505,10.000,0.000},
				{-51143.405,-8894.505,10.000,0.000},
				{-52032.855,-8894.505,10.000,0.000},
				{-52922.306,-8894.505,10.000,0.000},
				{-53811.756,-8894.505,10.000,0.000},
				{-54701.207,-8894.505,10.000,0.000},
				{-55590.657,-8894.505,10.000,0.000},
				{-56480.108,-8894.505,10.000,0.000},
				{-57369.558,-8894.505,10.000,0.000},
				{-58259.009,-8894.505,10.000,0.000},
				{-59148.459,-8894.505,10.000,0.000},
				{-60037.910,-8894.505,10.000,0.000},
				{-60927.360,-8894.505,10.000,0.000},
				{-61816.811,-8894.505,10.000,0.000},
				{-62706.261,-8894.505,10.000,0.000},
				{-63595.712,-8894.505,10.000,0.000},
				{-64485.162,-8894.505,10.000,0.000},
				{-65374.613,-8894.505,10.000,0.000},
				{-66264.063,-8894.505,10.000,0.000},
				{-67153.514,-8894.505,10.000,0.000},
				{-68042.964,-8894.505,10.000,0.000},
				{-68932.415,-8894.505,10.000,0.000},
				{-69821.865,-8894.505,10.000,0.000},
				{-70711.316,-8894.505,10.000,0.000},
				{-71600.766,-8894.505,10.000,0.000},
				{-72490.217,-8894.505,10.000,0.000},
				{-73379.667,-8894.505,10.000,0.000},
				{-74269.118,-8894.505,10.000,0.000},
				{-75158.568,-8894.505,10.000,0.000},
				{-76048.019,-8894.505,10.000,0.000},
				{-76937.469,-8894.505,10.000,0.000},
				{-77826.920,-8894.505,10.000,0.000},
				{-78716.370,-8894.505,10.000,0.000},
				{-79605.821,-8894.505,10.000,0.000},
				{-80495.272,-8894.505,10.000,0.000},
				{-81384.722,-8894.505,10.000,0.000},
				{-82274.173,-8894.505,10.000,0.000},
				{-83163.623,-8894.505,10.000,0.000},
				{-84053.074,-8894.505,10.000,0.000},
				{-84942.524,-8894.505,10.000,0.000},
				{-85831.975,-8894.505,10.000,0.000},
				{-86721.425,-8894.505,10.000,0.000},
				{-87610.876,-8894.505,10.000,0.000},
				{-88500.326,-8894.505,10.000,0.000},
				{-89389.777,-8894.505,10.000,0.000},
				{-90279.227,-8894.505,10.000,0.000},
				{-91168.678,-8894.505,10.000,0.000},
				{-92058.128,-8894.505,10.000,0.000},
				{-92947.579,-8894.505,10.000,0.000},
				{-93837.029,-8894.505,10.000,0.000},
				{-94726.480,-8894.505,10.000,0.000},
				{-95615.930,-8894.505,10.000,0.000},
				{-96505.381,-8894.505,10.000,0.000},
				{-97394.831,-8894.505,10.000,0.000},
				{-98284.282,-8894.505,10.000,0.000},
				{-99173.732,-8894.505,10.000,0.000},
				{-100063.183,-8894.505,10.000,0.000},
				{-100952.633,-8894.505,10.000,0.000},
				{-101842.084,-8894.505,10.000,0.000},
				{-102731.534,-8894.505,10.000,0.000},
				{-103620.985,-8894.505,10.000,0.000},
				{-104510.435,-8894.505,10.000,0.000},
				{-105399.886,-8894.505,10.000,0.000},
				{-106289.336,-8894.505,10.000,0.000},
				{-107178.787,-8894.505,10.000,0.000},
				{-108068.237,-8894.505,10.000,0.000},
				{-108957.688,-8894.505,10.000,0.000},
				{-109847.138,-8894.505,10.000,0.000},
				{-110736.589,-8894.505,10.000,0.000},
				{-111626.039,-8894.505,10.000,0.000},
				{-112515.490,-8894.505,10.000,0.000},
				{-113404.941,-8894.505,10.000,0.000},
				{-114294.391,-8894.505,10.000,0.000},
				{-115183.842,-8894.505,10.000,0.000},
				{-116073.292,-8894.505,10.000,0.000},
				{-116962.743,-8894.505,10.000,0.000},
				{-117852.193,-8894.505,10.000,0.000},
				{-118741.644,-8894.505,10.000,0.000},
				{-119631.094,-8894.505,10.000,0.000},
				{-120520.545,-8894.505,10.000,0.000},
				{-121409.995,-8894.505,10.000,0.000},
				{-122299.446,-8894.505,10.000,0.000},
				{-123188.896,-8894.505,10.000,0.000},
				{-124078.347,-8894.505,10.000,0.000},
				{-124967.797,-8894.505,10.000,0.000},
				{-125857.248,-8894.505,10.000,0.000},
				{-126746.698,-8894.505,10.000,0.000},
				{-127636.149,-8894.505,10.000,0.000},
				{-128525.599,-8894.505,10.000,0.000},
				{-129415.050,-8894.505,10.000,0.000},
				{-130304.500,-8894.505,10.000,0.000},
				{-131193.951,-8894.505,10.000,0.000},
				{-132083.401,-8894.505,10.000,0.000},
				{-132972.852,-8894.505,10.000,0.000},
				{-133862.302,-8894.505,10.000,0.000},
				{-134751.753,-8894.505,10.000,0.000},
				{-135641.203,-8894.505,10.000,0.000},
				{-136530.654,-8894.505,10.000,0.000},
				{-137420.104,-8894.505,10.000,0.000},
				{-138309.555,-8894.505,10.000,0.000},
				{-139199.005,-8894.505,10.000,0.000},
				{-140088.456,-8894.505,10.000,0.000},
				{-140977.906,-8894.505,10.000,0.000},
				{-141867.357,-8894.505,10.000,0.000},
				{-142756.807,-8894.505,10.000,0.000},
				{-143646.258,-8894.505,10.000,0.000},
				{-144535.708,-8894.505,10.000,0.000},
				{-145425.159,-8894.505,10.000,0.000},
				{-146314.610,-8894.505,10.000,0.000},
				{-147204.060,-8894.505,10.000,0.000},
				{-148093.511,-8894.505,10.000,0.000},
				{-148982.961,-8894.505,10.000,0.000},
				{-149872.412,-8894.505,10.000,0.000},
				{-150761.862,-8894.505,10.000,0.000},
				{-151651.313,-8894.505,10.000,0.000},
				{-152540.763,-8894.505,10.000,0.000},
				{-153430.214,-8894.505,10.000,0.000},
				{-154319.664,-8894.505,10.000,0.000},
				{-155209.115,-8894.505,10.000,0.000},
				{-156098.565,-8894.505,10.000,0.000},
				{-156988.016,-8894.505,10.000,0.000},
				{-157877.466,-8894.505,10.000,0.000},
				{-158766.917,-8894.505,10.000,0.000},
				{-159656.367,-8894.505,10.000,0.000},
				{-160545.818,-8894.505,10.000,0.000},
				{-161435.268,-8894.505,10.000,0.000},
				{-162324.719,-8894.505,10.000,0.000},
				{-163214.169,-8894.505,10.000,0.000},
				{-164103.620,-8894.505,10.000,0.000},
				{-164993.070,-8894.505,10.000,0.000},
				{-165882.521,-8894.505,10.000,0.000},
				{-166771.971,-8894.505,10.000,0.000},
				{-167661.422,-8894.505,10.000,0.000},
				{-168550.872,-8894.505,10.000,0.000},
				{-169440.323,-8894.505,10.000,0.000},
				{-170329.773,-8894.505,10.000,0.000},
				{-171220.952,-8911.786,10.000,0.007},
				{-172116.979,-8960.274,10.000,0.033},
				{-173017.834,-9008.544,10.000,0.078},
				{-173923.444,-9056.098,10.000,0.142},
				{-174833.756,-9103.123,10.000,0.224},
				{-175748.735,-9149.794,10.000,0.325},
				{-176668.363,-9196.280,10.000,0.444},
				{-177592.638,-9242.743,10.000,0.581},
				{-178521.571,-9289.338,10.000,0.737},
				{-179455.193,-9336.219,10.000,0.911},
				{-180393.547,-9383.534,10.000,1.105},
				{-181336.690,-9431.433,10.000,1.316},
				{-182284.696,-9480.063,10.000,1.548},
				{-183237.654,-9529.571,10.000,1.798},
				{-184195.664,-9580.107,10.000,2.069},
				{-185158.847,-9631.823,10.000,2.360},
				{-186127.334,-9684.871,10.000,2.672},
				{-187101.275,-9739.409,10.000,3.005},
				{-188080.835,-9795.599,10.000,3.361},
				{-189066.195,-9853.606,10.000,3.740},
				{-190057.555,-9913.601,10.000,4.142},
				{-191055.131,-9975.759,10.000,4.569},
				{-192059.157,-10040.262,10.000,5.021},
				{-193069.887,-10107.296,10.000,5.500},
				{-194087.592,-10177.052,10.000,6.006},
				{-195112.565,-10249.727,10.000,6.541},
				{-196145.117,-10325.520,10.000,7.106},
				{-197185.580,-10404.635,10.000,7.702},
				{-198234.308,-10487.273,10.000,8.331},
				{-199291.672,-10573.638,10.000,8.994},
				{-200358.064,-10663.926,10.000,9.692},
				{-201433.897,-10758.327,10.000,10.428},
				{-202519.598,-10857.015,10.000,11.202},
				{-203615.613,-10960.146,10.000,12.018},
				{-204722.398,-11067.850,10.000,12.876},
				{-205840.420,-11180.217,10.000,13.778},
				{-206970.149,-11297.294,10.000,14.727},
				{-208112.056,-11419.066,10.000,15.723},
				{-209266.600,-11545.441,10.000,16.770},
				{-210434.224,-11676.238,10.000,17.868},
				{-211615.340,-11811.166,10.000,19.019},
				{-212810.320,-11949.800,10.000,20.225},
				{-214019.477,-12091.568,10.000,21.487},
				{-215243.050,-12235.725,10.000,22.806},
				{-216481.183,-12381.334,10.000,24.183},
				{-217733.909,-12527.257,10.000,25.617},
				{-219001.122,-12672.137,10.000,27.108},
				{-220282.563,-12814.407,10.000,28.655},
				{-221577.793,-12952.295,10.000,30.257},
				{-222886.178,-13083.850,10.000,31.911},
				{-224206.876,-13206.986,10.000,33.613},
				{-225538.830,-13319.537,10.000,35.360},
				{-226880.763,-13419.335,10.000,37.147},
				{-228231.193,-13504.295,10.000,38.966},
				{-229588.444,-13572.513,10.000,40.813},
				{-230950.681,-13622.365,10.000,42.680},
				{-232315.940,-13652.593,10.000,44.558},
				{-233682.178,-13662.385,10.000,46.440},
				{-235047.320,-13651.420,10.000,48.318},
				{-236409.310,-13619.895,10.000,50.184},
				{-237766.160,-13568.504,10.000,52.029},
				{-239116.001,-13498.408,10.000,53.846},
				{-240457.116,-13411.154,10.000,55.629},
				{-241787.976,-13308.598,10.000,57.372},
				{-243107.257,-13192.805,10.000,59.069},
				{-244413.852,-13065.949,10.000,60.716},
				{-245706.874,-12930.224,10.000,62.309},
				{-246985.650,-12787.763,10.000,63.846},
				{-248249.708,-12640.578,10.000,65.324},
				{-249498.759,-12490.508,10.000,66.744},
				{-250732.679,-12339.197,10.000,68.104},
				{-251951.486,-12188.070,10.000,69.404},
				{-253155.319,-12038.337,10.000,70.645},
				{-254344.419,-11891.000,10.000,71.828},
				{-255519.105,-11746.862,10.000,72.954},
				{-256679.760,-11606.549,10.000,74.025},
				{-257826.813,-11470.530,10.000,75.041},
				{-258960.727,-11339.136,10.000,76.006},
				{-260081.985,-11212.584,10.000,76.921},
				{-261191.085,-11090.993,10.000,77.788},
				{-262288.525,-10974.402,10.000,78.610},
				{-263374.803,-10862.787,10.000,79.386},
				{-264450.411,-10756.076,10.000,80.121},
				{-265515.827,-10654.157,10.000,80.816},
				{-266571.516,-10556.889,10.000,81.472},
				{-267617.927,-10464.113,10.000,82.092},
				{-268655.493,-10375.656,10.000,82.676},
				{-269684.626,-10291.335,10.000,83.228},
				{-270705.723,-10210.966,10.000,83.747},
				{-271719.159,-10134.363,10.000,84.237},
				{-272725.293,-10061.343,10.000,84.697},
				{-273724.466,-9991.729,10.000,85.131},
				{-274717.001,-9925.347,10.000,85.537},
				{-275703.204,-9862.032,10.000,85.919},
				{-276683.367,-9801.627,10.000,86.277},
				{-277657.765,-9743.983,10.000,86.613},
				{-278626.661,-9688.961,10.000,86.926},
				{-279590.304,-9636.428,10.000,87.219},
				{-280548.930,-9586.262,10.000,87.492},
				{-281502.765,-9538.350,10.000,87.746},
				{-282452.024,-9492.587,10.000,87.982},
				{-283396.912,-9448.877,10.000,88.201},
				{-284337.625,-9407.131,10.000,88.404},
				{-285274.352,-9367.270,10.000,88.590},
				{-286207.274,-9329.221,10.000,88.762},
				{-287136.566,-9292.920,10.000,88.919},
				{-288062.397,-9258.309,10.000,89.063},
				{-288984.931,-9225.339,10.000,89.193},
				{-289904.327,-9193.966,10.000,89.312},
				{-290820.743,-9164.154,10.000,89.418},
				{-291734.330,-9135.871,10.000,89.513},
				{-292645.239,-9109.093,10.000,89.598},
				{-293553.619,-9083.804,10.000,89.673},
				{-294459.618,-9059.989,10.000,89.738},
				{-295363.382,-9037.642,10.000,89.795},
				{-296265.059,-9016.762,10.000,89.843},
				{-297164.794,-8997.351,10.000,89.883},
				{-298062.736,-8979.419,10.000,89.917},
				{-298959.033,-8962.977,10.000,89.944},
				{-299853.838,-8948.045,10.000,89.965},
				{-300747.302,-8934.643,10.000,89.981},
				{-301639.582,-8922.796,10.000,89.992},
				{-302530.835,-8912.535,10.000,89.999},
				{-303421.224,-8903.891,10.000,90.003},
				{-304310.914,-8896.899,10.000,90.004},
				{-305200.074,-8891.597,10.000,90.003},
				{-306088.876,-8888.024,10.000,90.000},
				{-306977.498,-8886.222,10.000,89.997},
				{-307866.122,-8886.232,10.000,89.994},
				{-308754.931,-8888.097,10.000,89.991},
				{-309644.117,-8891.859,10.000,89.990},
				{-310533.571,-8894.536,10.000,89.990},
				{-311423.031,-8894.602,10.000,89.990},
				{-312312.497,-8894.664,10.000,89.990},
				{-313201.970,-8894.724,10.000,89.990},
				{-314091.448,-8894.781,10.000,89.990},
				{-314980.931,-8894.836,10.000,89.990},
				{-315870.420,-8894.888,10.000,89.991},
				{-316759.914,-8894.937,10.000,89.991},
				{-317649.412,-8894.984,10.000,89.991},
				{-318538.915,-8895.029,10.000,89.991},
				{-319428.422,-8895.071,10.000,89.991},
				{-320317.933,-8895.112,10.000,89.992},
				{-321207.448,-8895.149,10.000,89.992},
				{-322096.967,-8895.185,10.000,89.992},
				{-322986.489,-8895.218,10.000,89.992},
				{-323876.014,-8895.249,10.000,89.993},
				{-324765.541,-8895.278,10.000,89.993},
				{-325655.072,-8895.305,10.000,89.993},
				{-326544.605,-8895.330,10.000,89.994},
				{-327434.140,-8895.353,10.000,89.994},
				{-328323.678,-8895.373,10.000,89.994},
				{-329213.217,-8895.392,10.000,89.995},
				{-330102.758,-8895.409,10.000,89.995},
				{-330992.300,-8895.424,10.000,89.995},
				{-331881.844,-8895.437,10.000,89.996},
				{-332771.389,-8895.449,10.000,89.996},
				{-333660.935,-8895.458,10.000,89.997},
				{-334550.481,-8895.466,10.000,89.997},
				{-335440.028,-8895.472,10.000,89.997},
				{-336329.576,-8895.476,10.000,89.998},
				{-337219.124,-8895.479,10.000,89.998},
				{-338108.672,-8895.480,10.000,89.998},
				{-338998.220,-8895.480,10.000,89.999},
				{-339887.768,-8895.478,10.000,89.999},
				{-340777.315,-8895.474,10.000,90.000},
				{-341666.862,-8895.469,10.000,90.000},
				{-342556.408,-8895.463,10.000,90.000},
				{-343445.954,-8895.455,10.000,90.001},
				{-344335.498,-8895.446,10.000,90.001},
				{-345225.042,-8895.436,10.000,90.001},
				{-346114.584,-8895.424,10.000,90.002},
				{-347004.126,-8895.411,10.000,90.002},
				{-347893.665,-8895.397,10.000,90.003},
				{-348783.203,-8895.382,10.000,90.003},
				{-349672.740,-8895.365,10.000,90.003},
				{-350562.275,-8895.348,10.000,90.004},
				{-351451.808,-8895.329,10.000,90.004},
				{-352341.339,-8895.310,10.000,90.004},
				{-353230.868,-8895.289,10.000,90.005},
				{-354120.394,-8895.267,10.000,90.005},
				{-355009.919,-8895.245,10.000,90.005},
				{-355899.441,-8895.221,10.000,90.005},
				{-356788.961,-8895.197,10.000,90.006},
				{-357678.478,-8895.172,10.000,90.006},
				{-358567.992,-8895.146,10.000,90.006},
				{-359457.504,-8895.120,10.000,90.006},
				{-360347.014,-8895.093,10.000,90.007},
				{-361236.520,-8895.065,10.000,90.007},
				{-362126.024,-8895.036,10.000,90.007},
				{-363015.524,-8895.007,10.000,90.007},
				{-363905.022,-8894.977,10.000,90.007},
				{-364794.517,-8894.947,10.000,90.008},
				{-365684.009,-8894.916,10.000,90.008},
				{-366573.497,-8894.885,10.000,90.008},
				{-367462.982,-8894.854,10.000,90.008},
				{-368352.465,-8894.822,10.000,90.008},
				{-369241.943,-8894.789,10.000,90.008},
				{-370131.419,-8894.757,10.000,90.008},
				{-371020.892,-8894.724,10.000,90.009},
				{-371910.361,-8894.691,10.000,90.009},
				{-372799.826,-8894.657,10.000,90.009},
				{-373689.289,-8894.624,10.000,90.009},
				{-374578.748,-8894.590,10.000,90.009},
				{-375468.203,-8894.557,10.000,90.009},
				{-376357.656,-8894.523,10.000,90.009},
				{-377247.105,-8894.489,10.000,90.009},
				{-378136.550,-8894.455,10.000,90.009},
				{-379025.992,-8894.422,10.000,90.009},
				{-379915.431,-8894.388,10.000,90.009},
				{-380804.866,-8894.354,10.000,90.009},
				{-381694.299,-8894.321,10.000,90.009},
				{-382583.727,-8894.288,10.000,90.008},
				{-383473.153,-8894.255,10.000,90.008},
				{-384362.575,-8894.222,10.000,90.008},
				{-385251.994,-8894.190,10.000,90.008},
				{-386141.410,-8894.158,10.000,90.008},
				{-387030.823,-8894.127,10.000,90.008},
				{-387920.232,-8894.095,10.000,90.008},
				{-388809.639,-8894.065,10.000,90.007},
				{-389699.042,-8894.034,10.000,90.007},
				{-390588.442,-8894.005,10.000,90.007},
				{-391477.840,-8893.975,10.000,90.007},
				{-392367.235,-8893.947,10.000,90.007},
				{-393256.627,-8893.919,10.000,90.006},
				{-394146.016,-8893.892,10.000,90.006},
				{-395035.402,-8893.865,10.000,90.006},
				{-395924.786,-8893.839,10.000,90.006},
				{-396814.168,-8893.814,10.000,90.005},
				{-397703.547,-8893.790,10.000,90.005},
				{-398592.923,-8893.766,10.000,90.005},
				{-399482.298,-8893.744,10.000,90.005},
				{-400371.670,-8893.722,10.000,90.004},
				{-401261.040,-8893.702,10.000,90.004},
				{-402150.408,-8893.682,10.000,90.004},
				{-403039.774,-8893.663,10.000,90.003},
				{-403929.139,-8893.646,10.000,90.003},
				{-404818.502,-8893.629,10.000,90.003},
				{-405707.863,-8893.614,10.000,90.002},
				{-406597.223,-8893.600,10.000,90.002},
				{-407486.582,-8893.587,10.000,90.001},
				{-408375.939,-8893.575,10.000,90.001},
				{-409265.296,-8893.564,10.000,90.001},
				{-410154.651,-8893.555,10.000,90.000},
				{-411044.006,-8893.548,10.000,90.000},
				{-411933.360,-8893.541,10.000,90.000},
				{-412822.714,-8893.536,10.000,89.999},
				{-413712.067,-8893.533,10.000,89.999},
				{-414601.420,-8893.531,10.000,89.998},
				{-415490.773,-8893.530,10.000,89.998},
				{-416380.126,-8893.531,10.000,89.998},
				{-417269.480,-8893.534,10.000,89.997},
				{-418158.834,-8893.538,10.000,89.997},
				{-419048.188,-8893.544,10.000,89.997},
				{-419937.543,-8893.552,10.000,89.996},
				{-420826.899,-8893.561,10.000,89.996},
				{-421716.257,-8893.573,10.000,89.995},
				{-422605.615,-8893.586,10.000,89.995},
				{-423494.975,-8893.600,10.000,89.995},
				{-424384.337,-8893.617,10.000,89.994},
				{-425273.700,-8893.636,10.000,89.994},
				{-426163.066,-8893.657,10.000,89.994},
				{-427052.434,-8893.679,10.000,89.993},
				{-427941.804,-8893.704,10.000,89.993},
				{-428831.178,-8893.731,10.000,89.993},
				{-429720.554,-8893.760,10.000,89.992},
				{-430609.933,-8893.791,10.000,89.992},
				{-431499.315,-8893.824,10.000,89.992},
				{-432388.701,-8893.859,10.000,89.992},
				{-433278.091,-8893.897,10.000,89.991},
				{-434167.484,-8893.937,10.000,89.991},
				{-435056.882,-8893.979,10.000,89.991},
				{-435946.285,-8894.024,10.000,89.991},
				{-436835.692,-8894.071,10.000,89.991},
				{-437725.104,-8894.120,10.000,89.990},
				{-438614.521,-8894.172,10.000,89.990},
				{-439503.944,-8894.227,10.000,89.990},
				{-440393.372,-8894.284,10.000,89.990},
				{-441282.806,-8894.343,10.000,89.990},
				{-442172.247,-8894.406,10.000,89.990},
				{-443061.694,-8894.470,10.000,89.990},
				{-443949.424,-8877.303,10.000,89.983},
				{-444833.606,-8841.820,10.000,89.962},
				{-445714.297,-8806.904,10.000,89.928},
				{-446591.541,-8772.439,10.000,89.880},
				{-447465.371,-8738.308,10.000,89.818},
				{-448335.811,-8704.398,10.000,89.743},
				{-449202.871,-8670.601,10.000,89.655},
				{-450066.553,-8636.813,10.000,89.553},
				{-450926.846,-8602.932,10.000,89.438},
				{-451783.732,-8568.858,10.000,89.309},
				{-452637.181,-8534.492,10.000,89.167},
				{-453487.154,-8499.737,10.000,89.011},
				{-454333.604,-8464.491,10.000,88.842},
				{-455176.469,-8428.657,10.000,88.658},
				{-456015.683,-8392.133,10.000,88.459},
				{-456851.164,-8354.814,10.000,88.246},
				{-457682.823,-8316.594,10.000,88.018},
				{-458510.560,-8277.364,10.000,87.775},
				{-459334.261,-8237.009,10.000,87.515},
				{-460153.802,-8195.410,10.000,87.239},
				{-460969.046,-8152.443,10.000,86.946},
				{-461779.844,-8107.977,10.000,86.636},
				{-462586.031,-8061.877,10.000,86.307},
				{-463387.431,-8013.997,10.000,85.960},
				{-464183.850,-7964.186,10.000,85.592},
				{-464975.078,-7912.281,10.000,85.205},
				{-465760.889,-7858.114,10.000,84.796},
				{-466541.039,-7801.503,10.000,84.364},
				{-467315.265,-7742.259,10.000,83.909},
				{-468083.283,-7680.179,10.000,83.430},
				{-468844.788,-7615.049,10.000,82.925},
				{-469599.453,-7546.647,10.000,82.393},
				{-470346.926,-7474.735,10.000,81.833},
				{-471086.833,-7399.065,10.000,81.242},
				{-471818.771,-7319.379,10.000,80.621},
				{-472542.312,-7235.410,10.000,79.966},
				{-473257.000,-7146.881,10.000,79.276},
				{-473962.351,-7053.513,10.000,78.549},
				{-474657.853,-6955.022,10.000,77.784},
				{-475342.966,-6851.131,10.000,76.977},
				{-476017.123,-6741.570,10.000,76.127},
				{-476679.732,-6626.089,10.000,75.232},
				{-477330.179,-6504.466,10.000,74.289},
				{-477967.831,-6376.522,10.000,73.295},
				{-478592.045,-6242.137,10.000,72.248},
				{-479202.172,-6101.271,10.000,71.145},
				{-479797.570,-5953.985,10.000,69.985},
				{-480377.618,-5800.472,10.000,68.763},
				{-480941.726,-5641.088,10.000,67.479},
				{-481489.365,-5476.384,10.000,66.130},
				{-482020.079,-5307.147,10.000,64.714},
				{-482533.523,-5134.436,10.000,63.230},
				{-483029.485,-4959.615,10.000,61.677},
				{-483507.923,-4784.382,10.000,60.054},
				{-483969.001,-4610.785,10.000,58.364},
				{-484413.123,-4441.218,10.000,56.606},
				{-484840.963,-4278.402,10.000,54.784},
				{-485253.496,-4125.325,10.000,52.901},
				{-485652.011,-3985.155,10.000,50.964},
				{-486038.124,-3861.124,10.000,48.977},
				{-486413.761,-3756.374,10.000,46.949},
				{-486781.140,-3673.785,10.000,44.888},
				{-487142.720,-3615.805,10.000,42.805},
				{-487501.148,-3584.279,10.000,40.709},
				{-487859.180,-3580.320,10.000,38.611},
				{-488219.602,-3604.224,10.000,36.523},
				{-488585.147,-3655.450,10.000,34.455},
				{-488958.413,-3732.653,10.000,32.418},
				{-489341.792,-3833.789,10.000,30.420},
				{-489737.417,-3956.254,10.000,28.471},
				{-490147.122,-4097.052,10.000,26.577},
				{-490572.420,-4252.979,10.000,24.745},
				{-491014.499,-4420.783,10.000,22.979},
				{-491474.230,-4597.311,10.000,21.283},
				{-491952.192,-4779.623,10.000,19.659},
				{-492448.699,-4965.067,10.000,18.108},
				{-492963.831,-5151.329,10.000,16.631},
				{-493497.476,-5336.450,10.000,15.226},
				{-494049.359,-5518.822,10.000,13.894},
				{-494619.075,-5697.166,10.000,12.632},
				{-495206.126,-5870.504,10.000,11.438},
				{-495809.938,-6038.124,10.000,10.311},
				{-496429.892,-6199.538,10.000,9.247},
				{-497065.337,-6354.448,10.000,8.244},
				{-497715.608,-6502.710,10.000,7.300},
				{-498380.038,-6644.303,10.000,6.412},
				{-499057.968,-6779.304,10.000,5.577},
				{-499748.754,-6907.860,10.000,4.793},
				{-500451.772,-7030.175,10.000,4.057},
				{-501166.421,-7146.488,10.000,3.367},
				{-501892.127,-7257.064,10.000,2.721},
				{-502628.345,-7362.182,10.000,2.116},
				{-503374.558,-7462.129,10.000,1.551},
				{-504130.277,-7557.191,10.000,1.023},
				{-504895.042,-7647.651,10.000,0.531},
				{-505668.421,-7733.784,10.000,0.072},
				{-506450.006,-7815.854,10.000,-0.353},
				{-507239.417,-7894.114,10.000,-0.748},
				{-508036.298,-7968.806,10.000,-1.114},
				{-508840.313,-8040.155,10.000,-1.451},
				{-509651.151,-8108.375,10.000,-1.761},
				{-510468.517,-8173.665,10.000,-2.046},
				{-511292.139,-8236.211,10.000,-2.306},
				{-512121.757,-8296.185,10.000,-2.542},
				{-512957.132,-8353.746,10.000,-2.755},
				{-513798.036,-8409.040,10.000,-2.947},
				{-514644.256,-8462.202,10.000,-3.117},
				{-515495.591,-8513.353,10.000,-3.268},
				{-516351.852,-8562.604,10.000,-3.399},
				{-517212.857,-8610.056,10.000,-3.511},
				{-518078.437,-8655.797,10.000,-3.605},
				{-518948.428,-8699.906,10.000,-3.682},
				{-519822.673,-8742.452,10.000,-3.742},
				{-520701.022,-8783.493,10.000,-3.786},
				{-521583.330,-8823.079,10.000,-3.814},
				{-522469.455,-8861.249,10.000,-3.827},
				{-523359.258,-8898.034,10.000,-3.826},
				{-524252.342,-8930.834,10.000,-3.811},
				{-525147.855,-8955.130,10.000,-3.782},
				{-526044.750,-8968.959,10.000,-3.740},
				{-526941.970,-8972.200,10.000,-3.687},
				{-527838.444,-8964.740,10.000,-3.622},
				{-528733.091,-8946.471,10.000,-3.546},
				{-529624.821,-8917.292,10.000,-3.460},
				{-530512.532,-8877.113,10.000,-3.366},
				{-531395.117,-8825.849,10.000,-3.263},
				{-532271.460,-8763.430,10.000,-3.153},
				{-533140.440,-8689.796,10.000,-3.037},
				{-534000.930,-8604.901,10.000,-2.915},
				{-534851.801,-8508.716,10.000,-2.789},
				{-535691.924,-8401.226,10.000,-2.659},
				{-536520.167,-8282.436,10.000,-2.527},
				{-537335.405,-8152.370,10.000,-2.393},
				{-538136.512,-8011.071,10.000,-2.258},
				{-538922.372,-7858.603,10.000,-2.124},
				{-539691.877,-7695.050,10.000,-1.990},
				{-540443.929,-7520.516,10.000,-1.859},
				{-541177.714,-7337.852,10.000,-1.730},
				{-541892.899,-7151.854,10.000,-1.605},
				{-542589.359,-6964.600,10.000,-1.483},
				{-543266.983,-6776.239,10.000,-1.365},
				{-543925.675,-6586.920,10.000,-1.251},
				{-544565.354,-6396.788,10.000,-1.143},
				{-545185.953,-6205.988,10.000,-1.040},
				{-545787.418,-6014.658,10.000,-0.942},
				{-546369.712,-5822.936,10.000,-0.849},
				{-546932.807,-5630.949,10.000,-0.762},
				{-547476.689,-5438.825,10.000,-0.680},
				{-548001.357,-5246.679,10.000,-0.605},
				{-548506.820,-5054.623,10.000,-0.534},
				{-548993.096,-4862.759,10.000,-0.470},
				{-549460.214,-4671.183,10.000,-0.410},
				{-549908.212,-4479.980,10.000,-0.356},
				{-550337.135,-4289.227,10.000,-0.307},
				{-550747.034,-4098.992,10.000,-0.263},
				{-551137.967,-3909.334,10.000,-0.224},
				{-551509.997,-3720.301,10.000,-0.189},
				{-551863.191,-3531.935,10.000,-0.158},
				{-552197.617,-3344.264,10.000,-0.131},
				{-552513.348,-3157.312,10.000,-0.107},
				{-552810.458,-2971.091,10.000,-0.087},
				{-553089.018,-2785.607,10.000,-0.070},
				{-553349.104,-2600.854,10.000,-0.056},
				{-553590.786,-2416.823,10.000,-0.043},
				{-553814.135,-2233.494,10.000,-0.034},
				{-554019.220,-2050.843,10.000,-0.026},
				{-554206.103,-1868.838,10.000,-0.019},
				{-554375.110,-1690.064,10.000,-0.014},
				{-554527.004,-1518.942,10.000,-0.010},
				{-554662.729,-1357.253,10.000,-0.007},
				{-554783.221,-1204.922,10.000,-0.005},
				{-554889.410,-1061.881,10.000,-0.003},
				{-554982.216,-928.066,10.000,-0.002},
				{-555062.558,-803.420,10.000,-0.001},
				{-555131.347,-687.892,10.000,-0.001},
				{-555189.491,-581.438,10.000,-0.001},
				{-555237.893,-484.019,10.000,-0.000},
				{-555277.453,-395.602,10.000,-0.000},
				{-555309.069,-316.160,10.000,-0.000},
				{-555333.636,-245.669,10.000,-0.000},
				{-555352.048,-184.113,10.000,-0.000},
				{-555365.195,-131.477,10.000,-0.000},
				{-555373.970,-87.751,10.000,-0.000},
				{-555379.263,-52.928,10.000,-0.000},
				{-555381.964,-27.004,10.000,-0.000},
				{-555382.961,-9.976,10.000,-0.000},
				{-555383.145,-1.843,10.000,-360.000},
				{-555383.145,-0.000,10.000,-360.000}		};

}