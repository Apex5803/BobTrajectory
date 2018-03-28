package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SwitchCubeToScaleRightSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (19.13,7.29,0.00)
	// (25.13,5.79,0.00)
	
    public SwitchCubeToScaleRightSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SwitchCubeToScaleRightSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.561,-11.227,10.000,0.000},
				{-2.807,-33.680,10.000,0.000},
				{-7.859,-67.361,10.000,0.000},
				{-16.840,-112.268,10.000,0.000},
				{-30.874,-168.402,10.000,0.000},
				{-51.082,-235.763,10.000,0.000},
				{-78.588,-314.350,10.000,0.000},
				{-114.513,-404.164,10.000,0.000},
				{-159.982,-505.206,10.000,0.000},
				{-216.116,-617.474,10.000,0.000},
				{-284.038,-740.968,10.000,0.000},
				{-364.871,-875.690,10.000,0.000},
				{-459.737,-1021.638,10.000,-0.010},
				{-569.760,-1178.813,10.000,-0.010},
				{-695.500,-1335.988,10.000,-0.010},
				{-836.957,-1493.163,10.000,-0.020},
				{-994.132,-1650.338,10.000,-0.020},
				{-1167.025,-1807.513,10.000,-0.030},
				{-1355.635,-1964.689,10.000,-0.050},
				{-1559.963,-2121.864,10.000,-0.060},
				{-1780.008,-2279.039,10.000,-0.080},
				{-2015.770,-2436.214,10.000,-0.100},
				{-2267.251,-2593.389,10.000,-0.130},
				{-2534.448,-2750.564,10.000,-0.160},
				{-2817.363,-2907.739,10.000,-0.190},
				{-3115.996,-3064.914,10.000,-0.230},
				{-3430.346,-3222.089,10.000,-0.280},
				{-3760.414,-3379.264,10.000,-0.340},
				{-4106.199,-3536.439,10.000,-0.400},
				{-4467.702,-3693.614,10.000,-0.470},
				{-4844.922,-3850.789,10.000,-0.550},
				{-5237.860,-4007.965,10.000,-0.640},
				{-5646.515,-4165.140,10.000,-0.740},
				{-6070.887,-4322.315,10.000,-0.850},
				{-6510.978,-4479.490,10.000,-0.970},
				{-6966.785,-4636.665,10.000,-1.100},
				{-7438.311,-4793.840,10.000,-1.250},
				{-7925.553,-4951.015,10.000,-1.410},
				{-8428.514,-5108.190,10.000,-1.580},
				{-8947.191,-5265.365,10.000,-1.760},
				{-9481.587,-5422.540,10.000,-1.970},
				{-10031.699,-5579.715,10.000,-2.180},
				{-10597.530,-5736.890,10.000,-2.420},
				{-11179.078,-5894.066,10.000,-2.670},
				{-11776.343,-6051.241,10.000,-2.930},
				{-12389.326,-6208.416,10.000,-3.220},
				{-13018.026,-6365.591,10.000,-3.520},
				{-13662.444,-6522.766,10.000,-3.840},
				{-14322.579,-6679.941,10.000,-4.180},
				{-14998.432,-6837.116,10.000,-4.540},
				{-15690.002,-6994.291,10.000,-4.910},
				{-16397.290,-7151.466,10.000,-5.310},
				{-17120.296,-7308.641,10.000,-5.720},
				{-17859.018,-7465.816,10.000,-6.160},
				{-18613.459,-7622.991,10.000,-6.610},
				{-19383.617,-7780.166,10.000,-7.080},
				{-20169.492,-7937.342,10.000,-7.570},
				{-20971.085,-8094.517,10.000,-8.080},
				{-21788.395,-8251.692,10.000,-8.600},
				{-22621.423,-8408.867,10.000,-9.140},
				{-23470.169,-8566.042,10.000,-9.700},
				{-24334.632,-8723.217,10.000,-10.280},
				{-25214.812,-8880.392,10.000,-10.860},
				{-26110.710,-9037.567,10.000,-11.460},
				{-27022.326,-9194.742,10.000,-12.070},
				{-27949.659,-9351.917,10.000,-12.700},
				{-28892.709,-9509.092,10.000,-13.330},
				{-29851.477,-9666.267,10.000,-13.970},
				{-30825.963,-9823.443,10.000,-14.610},
				{-31816.166,-9980.618,10.000,-15.260},
				{-32822.086,-10137.793,10.000,-15.910},
				{-33843.724,-10294.968,10.000,-16.560},
				{-34881.080,-10452.143,10.000,-17.210},
				{-35934.153,-10609.318,10.000,-17.850},
				{-37002.943,-10766.493,10.000,-18.480},
				{-38087.451,-10923.668,10.000,-19.110},
				{-39187.677,-11080.843,10.000,-19.730},
				{-40303.620,-11238.018,10.000,-20.330},
				{-41435.281,-11395.193,10.000,-20.910},
				{-42582.659,-11552.368,10.000,-21.480},
				{-43745.754,-11709.543,10.000,-22.030},
				{-44924.567,-11866.719,10.000,-22.550},
				{-46119.098,-12023.894,10.000,-23.050},
				{-47328.785,-12169.842,10.000,-23.530},
				{-48552.505,-12304.563,10.000,-23.970},
				{-49789.136,-12428.058,10.000,-24.380},
				{-51037.555,-12540.326,10.000,-24.760},
				{-52296.640,-12641.367,10.000,-25.100},
				{-53565.267,-12731.181,10.000,-25.400},
				{-54842.315,-12809.769,10.000,-25.670},
				{-56126.660,-12877.130,10.000,-25.890},
				{-57417.179,-12933.264,10.000,-26.070},
				{-58712.751,-12978.171,10.000,-26.210},
				{-60012.252,-13011.851,10.000,-26.310},
				{-61314.560,-13034.305,10.000,-26.360},
				{-62618.228,-13039.059,10.000,-26.370},
				{-63921.249,-13021.359,10.000,-26.340},
				{-65221.939,-12992.432,10.000,-26.260},
				{-66519.174,-12952.279,10.000,-26.140},
				{-67811.833,-12900.898,10.000,-25.970},
				{-69098.793,-12838.291,10.000,-25.770},
				{-70378.930,-12764.458,10.000,-25.520},
				{-71651.123,-12679.397,10.000,-25.230},
				{-72914.248,-12583.110,10.000,-24.910},
				{-74167.183,-12475.596,10.000,-24.540},
				{-75408.806,-12356.855,10.000,-24.150},
				{-76637.993,-12226.887,10.000,-23.720},
				{-77853.622,-12085.692,10.000,-23.260},
				{-79054.570,-11933.271,10.000,-22.770},
				{-80240.038,-11776.096,10.000,-22.250},
				{-81409.789,-11618.921,10.000,-21.720},
				{-82563.823,-11461.746,10.000,-21.160},
				{-83702.138,-11304.571,10.000,-20.580},
				{-84824.737,-11147.395,10.000,-19.980},
				{-85931.617,-10990.220,10.000,-19.370},
				{-87022.781,-10833.045,10.000,-18.750},
				{-88098.227,-10675.870,10.000,-18.120},
				{-89157.955,-10518.695,10.000,-17.480},
				{-90201.966,-10361.520,10.000,-16.830},
				{-91230.259,-10204.345,10.000,-16.190},
				{-92242.835,-10047.170,10.000,-15.540},
				{-93239.693,-9889.995,10.000,-14.890},
				{-94220.834,-9732.820,10.000,-14.240},
				{-95186.257,-9575.645,10.000,-13.600},
				{-96135.962,-9418.470,10.000,-12.970},
				{-97069.951,-9261.295,10.000,-12.340},
				{-97988.221,-9104.119,10.000,-11.720},
				{-98890.775,-8946.944,10.000,-11.120},
				{-99777.610,-8789.769,10.000,-10.520},
				{-100648.728,-8632.594,10.000,-9.940},
				{-101504.129,-8475.419,10.000,-9.380},
				{-102343.812,-8318.244,10.000,-8.830},
				{-103167.778,-8161.069,10.000,-8.300},
				{-103976.026,-8003.894,10.000,-7.780},
				{-104768.557,-7846.719,10.000,-7.290},
				{-105545.370,-7689.544,10.000,-6.810},
				{-106306.465,-7532.369,10.000,-6.350},
				{-107051.844,-7375.194,10.000,-5.900},
				{-107781.504,-7218.018,10.000,-5.480},
				{-108495.447,-7060.843,10.000,-5.080},
				{-109193.673,-6903.668,10.000,-4.690},
				{-109876.181,-6746.493,10.000,-4.330},
				{-110542.972,-6589.318,10.000,-3.980},
				{-111194.045,-6432.143,10.000,-3.650},
				{-111829.400,-6274.968,10.000,-3.340},
				{-112449.038,-6117.793,10.000,-3.050},
				{-113052.959,-5960.618,10.000,-2.780},
				{-113641.162,-5803.443,10.000,-2.520},
				{-114213.647,-5646.268,10.000,-2.280},
				{-114770.415,-5489.093,10.000,-2.060},
				{-115311.466,-5331.918,10.000,-1.850},
				{-115836.799,-5174.742,10.000,-1.660},
				{-116346.414,-5017.567,10.000,-1.480},
				{-116840.312,-4860.392,10.000,-1.310},
				{-117318.493,-4703.217,10.000,-1.160},
				{-117780.956,-4546.042,10.000,-1.020},
				{-118227.701,-4388.867,10.000,-0.900},
				{-118658.729,-4231.692,10.000,-0.780},
				{-119074.040,-4074.517,10.000,-0.680},
				{-119473.632,-3917.342,10.000,-0.590},
				{-119857.508,-3760.167,10.000,-0.500},
				{-120225.666,-3602.992,10.000,-0.430},
				{-120578.106,-3445.817,10.000,-0.360},
				{-120914.829,-3288.641,10.000,-0.300},
				{-121235.835,-3131.466,10.000,-0.250},
				{-121541.122,-2974.291,10.000,-0.210},
				{-121830.693,-2817.116,10.000,-0.170},
				{-122104.546,-2659.941,10.000,-0.140},
				{-122362.681,-2502.766,10.000,-0.110},
				{-122605.099,-2345.591,10.000,-0.090},
				{-122831.799,-2188.416,10.000,-0.070},
				{-123042.782,-2031.241,10.000,-0.050},
				{-123238.047,-1874.066,10.000,-0.040},
				{-123417.595,-1716.891,10.000,-0.030},
				{-123581.426,-1559.716,10.000,-0.020},
				{-123729.538,-1402.541,10.000,-0.010},
				{-123861.934,-1245.365,10.000,-0.010},
				{-123978.611,-1088.190,10.000,-0.010},
				{-124079.895,-937.488,10.000,0.000},
				{-124166.670,-798.013,10.000,0.000},
				{-124240.059,-669.765,10.000,0.000},
				{-124301.185,-552.743,10.000,0.000},
				{-124351.169,-446.948,10.000,0.000},
				{-124391.136,-352.380,10.000,0.000},
				{-124422.207,-269.039,10.000,0.000},
				{-124445.505,-196.924,10.000,0.000},
				{-124462.153,-136.037,10.000,0.000},
				{-124473.273,-86.376,10.000,0.000},
				{-124479.989,-47.942,10.000,0.000},
				{-124483.423,-20.734,10.000,0.000},
				{-124484.697,-4.754,10.000,0.000},
				{-124484.935,-0.000,10.000,0.000},
				{-124484.935,-0.000,10.000,0.000}		};

}