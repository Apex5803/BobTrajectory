package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt4Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (7.13,13.08,0.00)
	// (2.93,13.08,0.00)
	
    public CenterToRightSwitchPt4Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt4Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.595,-11.902,10.000,0.000},
				{-2.976,-35.707,10.000,0.000},
				{-8.332,-71.413,10.000,0.000},
				{-17.853,-119.022,10.000,0.000},
				{-32.731,-178.533,10.000,0.000},
				{-54.155,-249.947,10.000,0.000},
				{-83.316,-333.262,10.000,0.000},
				{-121.403,-428.480,10.000,0.000},
				{-169.607,-535.600,10.000,0.000},
				{-229.118,-654.623,10.000,0.000},
				{-301.126,-785.547,10.000,0.000},
				{-386.822,-928.374,10.000,0.000},
				{-487.396,-1083.103,10.000,0.000},
				{-604.038,-1249.734,10.000,0.000},
				{-737.938,-1428.268,10.000,0.000},
				{-890.287,-1618.703,10.000,0.000},
				{-1062.274,-1821.041,10.000,0.000},
				{-1255.090,-2035.281,10.000,0.000},
				{-1469.925,-2261.424,10.000,0.000},
				{-1707.970,-2499.468,10.000,0.000},
				{-1969.819,-2737.513,10.000,0.000},
				{-2255.473,-2975.557,10.000,0.000},
				{-2564.931,-3213.602,10.000,0.000},
				{-2898.193,-3451.647,10.000,0.000},
				{-3255.260,-3689.691,10.000,0.000},
				{-3636.131,-3927.736,10.000,0.000},
				{-4040.807,-4165.780,10.000,0.000},
				{-4469.287,-4403.825,10.000,0.000},
				{-4921.572,-4641.870,10.000,0.000},
				{-5397.661,-4879.914,10.000,0.000},
				{-5897.555,-5117.959,10.000,0.000},
				{-6421.253,-5356.003,10.000,0.000},
				{-6968.756,-5594.048,10.000,0.000},
				{-7540.063,-5832.093,10.000,0.000},
				{-8135.174,-6070.137,10.000,0.000},
				{-8754.090,-6308.182,10.000,0.000},
				{-9396.810,-6546.226,10.000,0.000},
				{-10063.335,-6784.271,10.000,0.000},
				{-10753.665,-7022.316,10.000,0.000},
				{-11467.798,-7260.360,10.000,0.000},
				{-12205.737,-7498.405,10.000,0.000},
				{-12967.479,-7736.449,10.000,0.000},
				{-13753.027,-7974.494,10.000,0.000},
				{-14562.378,-8212.539,10.000,0.000},
				{-15395.534,-8450.583,10.000,0.000},
				{-16252.495,-8688.628,10.000,0.000},
				{-17133.260,-8926.672,10.000,0.000},
				{-18037.829,-9164.717,10.000,0.000},
				{-18966.203,-9402.762,10.000,0.000},
				{-19918.382,-9640.806,10.000,0.000},
				{-20893.769,-9866.949,10.000,0.000},
				{-21891.176,-10081.189,10.000,0.000},
				{-22909.412,-10283.527,10.000,0.000},
				{-23947.286,-10473.962,10.000,0.000},
				{-25003.609,-10652.496,10.000,0.000},
				{-26077.191,-10819.127,10.000,0.000},
				{-27166.840,-10973.856,10.000,0.000},
				{-28271.367,-11116.683,10.000,0.000},
				{-29389.581,-11247.607,10.000,0.000},
				{-30520.293,-11366.630,10.000,0.000},
				{-31662.312,-11473.750,10.000,0.000},
				{-32814.448,-11568.967,10.000,0.000},
				{-33975.510,-11652.283,10.000,0.000},
				{-35144.309,-11723.696,10.000,0.000},
				{-36319.654,-11783.208,10.000,0.000},
				{-37500.356,-11830.816,10.000,0.000},
				{-38685.223,-11866.523,10.000,0.000},
				{-39873.065,-11890.328,10.000,0.000},
				{-41062.693,-11902.230,10.000,0.000},
				{-42252.875,-11901.403,10.000,0.000},
				{-43442.379,-11888.674,10.000,0.000},
				{-44630.014,-11864.042,10.000,0.000},
				{-45814.592,-11827.508,10.000,0.000},
				{-46994.921,-11779.072,10.000,0.000},
				{-48169.811,-11718.734,10.000,0.000},
				{-49338.073,-11646.494,10.000,0.000},
				{-50498.515,-11562.351,10.000,0.000},
				{-51649.948,-11466.306,10.000,0.000},
				{-52791.181,-11358.359,10.000,0.000},
				{-53921.024,-11238.510,10.000,0.000},
				{-55038.288,-11106.758,10.000,0.000},
				{-56141.781,-10963.105,10.000,0.000},
				{-57230.314,-10807.549,10.000,0.000},
				{-58302.696,-10640.090,10.000,0.000},
				{-59357.737,-10460.730,10.000,0.000},
				{-60394.247,-10269.467,10.000,0.000},
				{-61411.035,-10066.302,10.000,0.000},
				{-62406.912,-9851.235,10.000,0.000},
				{-63380.687,-9624.266,10.000,0.000},
				{-64331.211,-9386.221,10.000,0.000},
				{-65257.931,-9148.177,10.000,0.000},
				{-66160.847,-8910.132,10.000,0.000},
				{-67039.958,-8672.087,10.000,0.000},
				{-67895.264,-8434.043,10.000,0.000},
				{-68726.766,-8195.998,10.000,0.000},
				{-69534.464,-7957.954,10.000,0.000},
				{-70318.357,-7719.909,10.000,0.000},
				{-71078.446,-7481.864,10.000,0.000},
				{-71814.730,-7243.820,10.000,0.000},
				{-72527.209,-7005.775,10.000,0.000},
				{-73215.885,-6767.731,10.000,0.000},
				{-73880.756,-6529.686,10.000,0.000},
				{-74521.822,-6291.641,10.000,0.000},
				{-75139.084,-6053.597,10.000,0.000},
				{-75732.541,-5815.552,10.000,0.000},
				{-76302.194,-5577.508,10.000,0.000},
				{-76848.043,-5339.463,10.000,0.000},
				{-77370.087,-5101.418,10.000,0.000},
				{-77868.326,-4863.374,10.000,0.000},
				{-78342.762,-4625.329,10.000,0.000},
				{-78793.392,-4387.285,10.000,0.000},
				{-79220.219,-4149.240,10.000,0.000},
				{-79623.240,-3911.195,10.000,0.000},
				{-80002.458,-3673.151,10.000,0.000},
				{-80357.870,-3435.106,10.000,0.000},
				{-80689.479,-3197.062,10.000,0.000},
				{-80997.283,-2959.017,10.000,0.000},
				{-81281.282,-2720.972,10.000,0.000},
				{-81541.477,-2482.928,10.000,0.000},
				{-81777.909,-2245.710,10.000,0.000},
				{-81991.214,-2020.395,10.000,0.000},
				{-82182.583,-1806.982,10.000,0.000},
				{-82353.206,-1605.471,10.000,0.000},
				{-82504.273,-1415.862,10.000,0.000},
				{-82636.973,-1238.156,10.000,0.000},
				{-82752.499,-1072.352,10.000,0.000},
				{-82852.039,-918.450,10.000,0.000},
				{-82936.784,-776.450,10.000,0.000},
				{-83007.924,-646.352,10.000,0.000},
				{-83066.649,-528.157,10.000,0.000},
				{-83114.151,-421.864,10.000,0.000},
				{-83151.617,-327.473,10.000,0.000},
				{-83180.240,-244.985,10.000,0.000},
				{-83201.209,-174.398,10.000,0.000},
				{-83215.715,-115.714,10.000,0.000},
				{-83224.947,-68.932,10.000,0.000},
				{-83230.097,-34.053,10.000,0.000},
				{-83232.353,-11.075,10.000,0.000},
				{-83232.907,-0.000,10.000,0.000},
				{-83232.907,-0.000,10.000,0.000}		};

}