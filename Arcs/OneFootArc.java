package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class OneFootArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (1.00,0.00,0.00)
	
    public OneFootArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public OneFootArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.435,8.704,10.000,0.000},
				{2.176,17.408,10.000,0.000},
				{6.093,39.169,10.000,0.000},
				{13.056,69.633,10.000,0.000},
				{23.936,108.802,10.000,0.000},
				{39.604,156.674,10.000,0.000},
				{60.929,213.251,10.000,0.000},
				{88.782,278.532,10.000,0.000},
				{124.034,352.517,10.000,0.000},
				{167.554,435.206,10.000,0.000},
				{220.214,526.599,10.000,0.000},
				{282.884,626.697,10.000,0.000},
				{356.434,735.498,10.000,0.000},
				{441.734,853.004,10.000,0.000},
				{539.656,979.214,10.000,0.000},
				{651.068,1114.128,10.000,0.000},
				{776.843,1257.746,10.000,0.000},
				{917.850,1410.068,10.000,0.000},
				{1074.959,1571.094,10.000,0.000},
				{1249.042,1740.824,10.000,0.000},
				{1440.532,1914.907,10.000,0.000},
				{1648.996,2084.637,10.000,0.000},
				{1873.562,2245.664,10.000,0.000},
				{2113.361,2397.986,10.000,0.000},
				{2367.521,2541.604,10.000,0.000},
				{2635.173,2676.518,10.000,0.000},
				{2915.446,2802.727,10.000,0.000},
				{3207.469,2920.233,10.000,0.000},
				{3510.373,3029.035,10.000,0.000},
				{3823.286,3129.132,10.000,0.000},
				{4145.338,3220.525,10.000,0.000},
				{4475.660,3303.214,10.000,0.000},
				{4813.380,3377.199,10.000,0.000},
				{5157.628,3442.480,10.000,0.000},
				{5507.533,3499.057,10.000,0.000},
				{5862.226,3546.930,10.000,0.000},
				{6220.836,3586.098,10.000,0.000},
				{6582.493,3616.563,10.000,0.000},
				{6946.325,3638.323,10.000,0.000},
				{7311.463,3651.379,10.000,0.000},
				{7676.840,3653.775,10.000,0.000},
				{8041.391,3645.511,10.000,0.000},
				{8404.246,3628.542,10.000,0.000},
				{8764.532,3602.869,10.000,0.000},
				{9121.382,3568.492,10.000,0.000},
				{9473.923,3525.411,10.000,0.000},
				{9821.285,3473.626,10.000,0.000},
				{10162.599,3413.137,10.000,0.000},
				{10496.993,3343.944,10.000,0.000},
				{10823.598,3266.046,10.000,0.000},
				{11141.543,3179.444,10.000,0.000},
				{11449.956,3084.139,10.000,0.000},
				{11747.969,2980.129,10.000,0.000},
				{12034.711,2867.415,10.000,0.000},
				{12309.310,2745.997,10.000,0.000},
				{12570.898,2615.874,10.000,0.000},
				{12818.603,2477.048,10.000,0.000},
				{13051.554,2329.518,10.000,0.000},
				{13268.883,2173.283,10.000,0.000},
				{13469.717,2008.344,10.000,0.000},
				{13653.383,1836.658,10.000,0.000},
				{13819.836,1664.531,10.000,0.000},
				{13969.707,1498.714,10.000,0.000},
				{14103.867,1341.600,10.000,0.000},
				{14223.186,1193.190,10.000,0.000},
				{14328.535,1053.484,10.000,0.000},
				{14420.783,922.483,10.000,0.000},
				{14500.802,800.186,10.000,0.000},
				{14569.461,686.593,10.000,0.000},
				{14627.631,581.703,10.000,0.000},
				{14676.183,485.519,10.000,0.000},
				{14715.987,398.038,10.000,0.000},
				{14747.913,319.261,10.000,0.000},
				{14772.832,249.188,10.000,0.000},
				{14791.614,187.820,10.000,0.000},
				{14805.129,135.156,10.000,0.000},
				{14814.249,91.195,10.000,0.000},
				{14819.843,55.939,10.000,0.000},
				{14822.782,29.387,10.000,0.000},
				{14823.936,11.540,10.000,0.000},
				{14824.175,2.396,10.000,0.000},
				{14824.175,0.000,10.000,0.000}		};

}