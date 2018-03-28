package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchPt3Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (3.63,13.08,0.00)
	// (6.63,13.08,0.00)
	
    public CenterToLeftSwitchPt3Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchPt3Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.567,11.337,10.000,0.000},
				{2.834,34.012,10.000,0.000},
				{7.936,68.024,10.000,0.000},
				{17.006,113.373,10.000,0.000},
				{31.178,170.059,10.000,0.000},
				{51.585,238.083,10.000,0.000},
				{79.361,317.444,10.000,0.000},
				{115.640,408.142,10.000,0.000},
				{161.556,510.178,10.000,0.000},
				{218.243,623.550,10.000,0.000},
				{286.833,748.260,10.000,0.000},
				{368.462,884.308,10.000,0.000},
				{464.262,1031.692,10.000,0.000},
				{575.367,1190.414,10.000,0.000},
				{702.344,1349.136,10.000,0.000},
				{845.194,1507.858,10.000,0.000},
				{1003.916,1666.580,10.000,0.000},
				{1178.510,1825.302,10.000,0.000},
				{1368.976,1984.024,10.000,0.000},
				{1575.315,2142.746,10.000,0.000},
				{1797.526,2301.468,10.000,0.000},
				{2035.608,2460.190,10.000,0.000},
				{2289.564,2618.911,10.000,0.000},
				{2559.391,2777.633,10.000,0.000},
				{2845.090,2936.355,10.000,0.000},
				{3146.662,3095.077,10.000,0.000},
				{3464.106,3253.799,10.000,0.000},
				{3797.422,3412.521,10.000,0.000},
				{4146.610,3571.243,10.000,0.000},
				{4511.670,3729.965,10.000,0.000},
				{4892.603,3888.687,10.000,0.000},
				{5289.408,4047.409,10.000,0.000},
				{5702.085,4206.131,10.000,0.000},
				{6130.634,4364.852,10.000,0.000},
				{6575.055,4523.574,10.000,0.000},
				{7035.349,4682.296,10.000,0.000},
				{7511.514,4841.018,10.000,0.000},
				{8003.552,4999.740,10.000,0.000},
				{8511.462,5158.462,10.000,0.000},
				{9035.245,5317.184,10.000,0.000},
				{9574.899,5475.906,10.000,0.000},
				{10130.426,5634.628,10.000,0.000},
				{10701.825,5793.350,10.000,0.000},
				{11289.096,5952.072,10.000,0.000},
				{11892.239,6110.793,10.000,0.000},
				{12511.254,6269.515,10.000,0.000},
				{13146.142,6428.237,10.000,0.000},
				{13796.902,6586.959,10.000,0.000},
				{14463.534,6745.681,10.000,0.000},
				{15146.038,6904.403,10.000,0.000},
				{15844.414,7063.125,10.000,0.000},
				{16558.663,7221.847,10.000,0.000},
				{17288.784,7380.569,10.000,0.000},
				{18034.777,7539.291,10.000,0.000},
				{18796.642,7698.013,10.000,0.000},
				{19573.812,7845.397,10.000,0.000},
				{20365.154,7981.444,10.000,0.000},
				{21169.534,8106.155,10.000,0.000},
				{21985.819,8219.527,10.000,0.000},
				{22812.873,8321.563,10.000,0.000},
				{23649.564,8412.261,10.000,0.000},
				{24494.758,8491.622,10.000,0.000},
				{25347.322,8559.646,10.000,0.000},
				{26206.121,8616.332,10.000,0.000},
				{27070.021,8661.681,10.000,0.000},
				{27937.890,8695.693,10.000,0.000},
				{28808.593,8718.368,10.000,0.000},
				{29680.997,8729.705,10.000,0.000},
				{30553.551,8721.380,10.000,0.000},
				{31424.706,8701.718,10.000,0.000},
				{32293.328,8670.719,10.000,0.000},
				{33158.283,8628.383,10.000,0.000},
				{34018.437,8574.709,10.000,0.000},
				{34872.658,8509.698,10.000,0.000},
				{35719.810,8433.350,10.000,0.000},
				{36558.761,8345.664,10.000,0.000},
				{37388.376,8246.641,10.000,0.000},
				{38207.522,8136.281,10.000,0.000},
				{39015.065,8014.584,10.000,0.000},
				{39809.872,7881.549,10.000,0.000},
				{40590.808,7737.177,10.000,0.000},
				{41356.741,7581.468,10.000,0.000},
				{42106.951,7422.746,10.000,0.000},
				{42841.290,7264.024,10.000,0.000},
				{43559.756,7105.302,10.000,0.000},
				{44262.350,6946.580,10.000,0.000},
				{44949.072,6787.858,10.000,0.000},
				{45619.922,6629.136,10.000,0.000},
				{46274.899,6470.414,10.000,0.000},
				{46914.004,6311.692,10.000,0.000},
				{47537.238,6152.970,10.000,0.000},
				{48144.599,5994.248,10.000,0.000},
				{48736.087,5835.527,10.000,0.000},
				{49311.704,5676.805,10.000,0.000},
				{49871.448,5518.083,10.000,0.000},
				{50415.320,5359.361,10.000,0.000},
				{50943.320,5200.639,10.000,0.000},
				{51455.448,5041.917,10.000,0.000},
				{51951.704,4883.195,10.000,0.000},
				{52432.087,4724.473,10.000,0.000},
				{52896.598,4565.751,10.000,0.000},
				{53345.238,4407.029,10.000,0.000},
				{53778.004,4248.308,10.000,0.000},
				{54194.899,4089.586,10.000,0.000},
				{54595.921,3930.864,10.000,0.000},
				{54981.072,3772.142,10.000,0.000},
				{55350.350,3613.420,10.000,0.000},
				{55703.756,3454.698,10.000,0.000},
				{56041.289,3295.976,10.000,0.000},
				{56362.951,3137.254,10.000,0.000},
				{56668.740,2978.532,10.000,0.000},
				{56958.657,2819.810,10.000,0.000},
				{57232.702,2661.088,10.000,0.000},
				{57490.875,2502.367,10.000,0.000},
				{57733.176,2343.645,10.000,0.000},
				{57959.604,2184.923,10.000,0.000},
				{58170.160,2026.201,10.000,0.000},
				{58364.844,1867.479,10.000,0.000},
				{58543.656,1708.757,10.000,0.000},
				{58706.596,1550.035,10.000,0.000},
				{58853.663,1391.313,10.000,0.000},
				{58984.858,1232.591,10.000,0.000},
				{59100.181,1073.869,10.000,0.000},
				{59200.048,923.472,10.000,0.000},
				{59285.443,784.412,10.000,0.000},
				{59357.498,656.689,10.000,0.000},
				{59417.347,540.304,10.000,0.000},
				{59466.125,435.256,10.000,0.000},
				{59504.965,341.545,10.000,0.000},
				{59535.001,259.171,10.000,0.000},
				{59557.366,188.135,10.000,0.000},
				{59573.195,128.436,10.000,0.000},
				{59583.620,80.074,10.000,0.000},
				{59589.777,43.050,10.000,0.000},
				{59592.797,17.363,10.000,0.000},
				{59593.816,3.013,10.000,0.000},
				{59593.967,0.000,10.000,0.000},
				{59593.967,0.000,10.000,0.000}		};

}