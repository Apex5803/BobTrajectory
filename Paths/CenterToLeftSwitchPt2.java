package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchPt2 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (-6.50,0.00,0.00)
	
	public CenterToLeftSwitchPt2() {
		this(false);
	}
			
    public CenterToLeftSwitchPt2(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.125,-2.508,10.000},
				{-0.627,-5.016,10.000},
				{-1.756,-11.286,10.000},
				{-3.762,-20.063,10.000},
				{-6.897,-31.349,10.000},
				{-11.411,-45.142,10.000},
				{-17.555,-61.443,10.000},
				{-25.581,-80.253,10.000},
				{-35.737,-101.570,10.000},
				{-48.277,-125.395,10.000},
				{-63.450,-151.727,10.000},
				{-81.507,-180.568,10.000},
				{-102.698,-211.917,10.000},
				{-127.276,-245.773,10.000},
				{-155.489,-282.138,10.000},
				{-187.590,-321.010,10.000},
				{-223.829,-362.390,10.000},
				{-264.332,-405.025,10.000},
				{-309.098,-447.659,10.000},
				{-358.127,-490.293,10.000},
				{-411.420,-532.927,10.000},
				{-468.976,-575.561,10.000},
				{-530.795,-618.195,10.000},
				{-596.878,-660.830,10.000},
				{-667.225,-703.464,10.000},
				{-741.835,-746.098,10.000},
				{-820.708,-788.732,10.000},
				{-903.844,-831.366,10.000},
				{-991.244,-874.001,10.000},
				{-1082.908,-916.635,10.000},
				{-1178.835,-959.269,10.000},
				{-1279.025,-1001.903,10.000},
				{-1383.479,-1044.537,10.000},
				{-1492.196,-1087.171,10.000},
				{-1605.177,-1129.806,10.000},
				{-1722.421,-1172.440,10.000},
				{-1843.928,-1215.074,10.000},
				{-1969.699,-1257.708,10.000},
				{-2099.733,-1300.342,10.000},
				{-2234.031,-1342.976,10.000},
				{-2372.466,-1384.357,10.000},
				{-2514.789,-1423.229,10.000},
				{-2660.748,-1459.593,10.000},
				{-2810.093,-1493.450,10.000},
				{-2962.573,-1524.799,10.000},
				{-3117.937,-1553.639,10.000},
				{-3275.935,-1579.972,10.000},
				{-3436.314,-1603.797,10.000},
				{-3598.826,-1625.114,10.000},
				{-3763.218,-1643.923,10.000},
				{-3929.240,-1660.225,10.000},
				{-4096.642,-1674.018,10.000},
				{-4265.173,-1685.304,10.000},
				{-4434.581,-1694.081,10.000},
				{-4604.616,-1700.351,10.000},
				{-4775.027,-1704.113,10.000},
				{-4945.564,-1705.367,10.000},
				{-5116.101,-1705.367,10.000},
				{-5286.637,-1705.367,10.000},
				{-5457.174,-1705.367,10.000},
				{-5627.711,-1705.367,10.000},
				{-5798.247,-1705.367,10.000},
				{-5968.784,-1705.367,10.000},
				{-6139.321,-1705.367,10.000},
				{-6309.857,-1705.367,10.000},
				{-6480.394,-1705.367,10.000},
				{-6650.931,-1705.367,10.000},
				{-6821.467,-1705.367,10.000},
				{-6992.004,-1705.367,10.000},
				{-7162.541,-1705.367,10.000},
				{-7333.077,-1705.367,10.000},
				{-7503.614,-1705.367,10.000},
				{-7674.151,-1705.367,10.000},
				{-7844.688,-1705.367,10.000},
				{-8015.224,-1705.367,10.000},
				{-8185.761,-1705.367,10.000},
				{-8356.298,-1705.367,10.000},
				{-8526.834,-1705.367,10.000},
				{-8697.371,-1705.367,10.000},
				{-8867.908,-1705.367,10.000},
				{-9038.444,-1705.367,10.000},
				{-9208.981,-1705.367,10.000},
				{-9379.518,-1705.367,10.000},
				{-9550.054,-1705.367,10.000},
				{-9720.591,-1705.367,10.000},
				{-9891.128,-1705.367,10.000},
				{-10061.664,-1705.367,10.000},
				{-10232.201,-1705.367,10.000},
				{-10402.738,-1705.367,10.000},
				{-10573.275,-1705.367,10.000},
				{-10743.811,-1705.367,10.000},
				{-10914.348,-1705.367,10.000},
				{-11084.885,-1705.367,10.000},
				{-11255.421,-1705.367,10.000},
				{-11425.958,-1705.367,10.000},
				{-11596.495,-1705.367,10.000},
				{-11767.031,-1705.367,10.000},
				{-11937.568,-1705.367,10.000},
				{-12108.105,-1705.367,10.000},
				{-12278.641,-1705.367,10.000},
				{-12449.178,-1705.367,10.000},
				{-12619.715,-1705.367,10.000},
				{-12790.251,-1705.367,10.000},
				{-12960.788,-1705.367,10.000},
				{-13131.325,-1705.367,10.000},
				{-13301.862,-1705.367,10.000},
				{-13472.398,-1705.367,10.000},
				{-13642.935,-1705.367,10.000},
				{-13813.472,-1705.367,10.000},
				{-13984.008,-1705.367,10.000},
				{-14154.545,-1705.367,10.000},
				{-14325.082,-1705.367,10.000},
				{-14495.618,-1705.367,10.000},
				{-14666.155,-1705.367,10.000},
				{-14836.692,-1705.367,10.000},
				{-15007.228,-1705.367,10.000},
				{-15177.765,-1705.367,10.000},
				{-15348.302,-1705.367,10.000},
				{-15518.838,-1705.367,10.000},
				{-15689.375,-1705.367,10.000},
				{-15859.912,-1705.367,10.000},
				{-16030.448,-1705.367,10.000},
				{-16200.985,-1705.367,10.000},
				{-16371.522,-1705.367,10.000},
				{-16542.059,-1705.367,10.000},
				{-16712.595,-1705.367,10.000},
				{-16883.132,-1705.367,10.000},
				{-17053.669,-1705.367,10.000},
				{-17224.205,-1705.367,10.000},
				{-17394.742,-1705.367,10.000},
				{-17565.279,-1705.367,10.000},
				{-17735.815,-1705.367,10.000},
				{-17906.352,-1705.367,10.000},
				{-18076.889,-1705.367,10.000},
				{-18247.425,-1705.367,10.000},
				{-18417.962,-1705.367,10.000},
				{-18588.499,-1705.367,10.000},
				{-18759.035,-1705.367,10.000},
				{-18929.572,-1705.367,10.000},
				{-19100.109,-1705.367,10.000},
				{-19270.646,-1705.367,10.000},
				{-19441.182,-1705.367,10.000},
				{-19611.719,-1705.367,10.000},
				{-19782.256,-1705.367,10.000},
				{-19952.792,-1705.367,10.000},
				{-20123.329,-1705.367,10.000},
				{-20293.866,-1705.367,10.000},
				{-20464.402,-1705.367,10.000},
				{-20634.939,-1705.367,10.000},
				{-20805.476,-1705.367,10.000},
				{-20976.012,-1705.367,10.000},
				{-21146.549,-1705.367,10.000},
				{-21317.086,-1705.367,10.000},
				{-21487.622,-1705.367,10.000},
				{-21658.159,-1705.367,10.000},
				{-21828.696,-1705.367,10.000},
				{-21999.232,-1705.367,10.000},
				{-22169.769,-1705.367,10.000},
				{-22340.306,-1705.367,10.000},
				{-22510.843,-1705.367,10.000},
				{-22681.379,-1705.367,10.000},
				{-22851.916,-1705.367,10.000},
				{-23022.390,-1704.740,10.000},
				{-23192.613,-1702.232,10.000},
				{-23362.335,-1697.216,10.000},
				{-23531.304,-1689.693,10.000},
				{-23699.270,-1679.661,10.000},
				{-23865.982,-1667.122,10.000},
				{-24031.190,-1652.074,10.000},
				{-24194.642,-1634.519,10.000},
				{-24356.087,-1614.456,10.000},
				{-24515.276,-1591.885,10.000},
				{-24671.956,-1566.806,10.000},
				{-24825.878,-1539.219,10.000},
				{-24976.790,-1509.124,10.000},
				{-25124.443,-1476.522,10.000},
				{-25268.584,-1441.411,10.000},
				{-25408.963,-1403.793,10.000},
				{-25545.330,-1363.667,10.000},
				{-25677.496,-1321.659,10.000},
				{-25805.398,-1279.025,10.000},
				{-25929.037,-1236.391,10.000},
				{-26048.413,-1193.757,10.000},
				{-26163.525,-1151.123,10.000},
				{-26274.374,-1108.488,10.000},
				{-26380.959,-1065.854,10.000},
				{-26483.281,-1023.220,10.000},
				{-26581.340,-980.586,10.000},
				{-26675.135,-937.952,10.000},
				{-26764.667,-895.318,10.000},
				{-26849.935,-852.683,10.000},
				{-26930.940,-810.049,10.000},
				{-27007.682,-767.415,10.000},
				{-27080.160,-724.781,10.000},
				{-27148.375,-682.147,10.000},
				{-27212.326,-639.513,10.000},
				{-27272.014,-596.878,10.000},
				{-27327.438,-554.244,10.000},
				{-27378.599,-511.610,10.000},
				{-27425.497,-468.976,10.000},
				{-27468.131,-426.342,10.000},
				{-27506.502,-383.708,10.000},
				{-27540.672,-341.700,10.000},
				{-27570.829,-301.574,10.000},
				{-27597.225,-263.956,10.000},
				{-27620.109,-228.845,10.000},
				{-27639.733,-196.243,10.000},
				{-27656.348,-166.148,10.000},
				{-27670.204,-138.561,10.000},
				{-27681.552,-113.482,10.000},
				{-27690.644,-90.911,10.000},
				{-27697.728,-70.848,10.000},
				{-27703.058,-53.293,10.000},
				{-27706.882,-38.245,10.000},
				{-27709.453,-25.706,10.000},
				{-27711.020,-15.674,10.000},
				{-27711.835,-8.151,10.000},
				{-27712.149,-3.135,10.000},
				{-27712.211,-0.627,10.000},
				{-27712.211,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.125,-2.508,10.000},
				{-0.627,-5.016,10.000},
				{-1.756,-11.286,10.000},
				{-3.762,-20.063,10.000},
				{-6.897,-31.349,10.000},
				{-11.411,-45.142,10.000},
				{-17.555,-61.443,10.000},
				{-25.581,-80.253,10.000},
				{-35.737,-101.570,10.000},
				{-48.277,-125.395,10.000},
				{-63.450,-151.727,10.000},
				{-81.507,-180.568,10.000},
				{-102.698,-211.917,10.000},
				{-127.276,-245.773,10.000},
				{-155.489,-282.138,10.000},
				{-187.590,-321.010,10.000},
				{-223.829,-362.390,10.000},
				{-264.332,-405.025,10.000},
				{-309.098,-447.659,10.000},
				{-358.127,-490.293,10.000},
				{-411.420,-532.927,10.000},
				{-468.976,-575.561,10.000},
				{-530.795,-618.195,10.000},
				{-596.878,-660.830,10.000},
				{-667.225,-703.464,10.000},
				{-741.835,-746.098,10.000},
				{-820.708,-788.732,10.000},
				{-903.844,-831.366,10.000},
				{-991.244,-874.001,10.000},
				{-1082.908,-916.635,10.000},
				{-1178.835,-959.269,10.000},
				{-1279.025,-1001.903,10.000},
				{-1383.479,-1044.537,10.000},
				{-1492.196,-1087.171,10.000},
				{-1605.177,-1129.806,10.000},
				{-1722.421,-1172.440,10.000},
				{-1843.928,-1215.074,10.000},
				{-1969.699,-1257.708,10.000},
				{-2099.733,-1300.342,10.000},
				{-2234.031,-1342.976,10.000},
				{-2372.466,-1384.357,10.000},
				{-2514.789,-1423.229,10.000},
				{-2660.748,-1459.593,10.000},
				{-2810.093,-1493.450,10.000},
				{-2962.573,-1524.799,10.000},
				{-3117.937,-1553.639,10.000},
				{-3275.935,-1579.972,10.000},
				{-3436.314,-1603.797,10.000},
				{-3598.826,-1625.114,10.000},
				{-3763.218,-1643.923,10.000},
				{-3929.240,-1660.225,10.000},
				{-4096.642,-1674.018,10.000},
				{-4265.173,-1685.304,10.000},
				{-4434.581,-1694.081,10.000},
				{-4604.616,-1700.351,10.000},
				{-4775.027,-1704.113,10.000},
				{-4945.564,-1705.367,10.000},
				{-5116.101,-1705.367,10.000},
				{-5286.637,-1705.367,10.000},
				{-5457.174,-1705.367,10.000},
				{-5627.711,-1705.367,10.000},
				{-5798.247,-1705.367,10.000},
				{-5968.784,-1705.367,10.000},
				{-6139.321,-1705.367,10.000},
				{-6309.857,-1705.367,10.000},
				{-6480.394,-1705.367,10.000},
				{-6650.931,-1705.367,10.000},
				{-6821.467,-1705.367,10.000},
				{-6992.004,-1705.367,10.000},
				{-7162.541,-1705.367,10.000},
				{-7333.077,-1705.367,10.000},
				{-7503.614,-1705.367,10.000},
				{-7674.151,-1705.367,10.000},
				{-7844.688,-1705.367,10.000},
				{-8015.224,-1705.367,10.000},
				{-8185.761,-1705.367,10.000},
				{-8356.298,-1705.367,10.000},
				{-8526.834,-1705.367,10.000},
				{-8697.371,-1705.367,10.000},
				{-8867.908,-1705.367,10.000},
				{-9038.444,-1705.367,10.000},
				{-9208.981,-1705.367,10.000},
				{-9379.518,-1705.367,10.000},
				{-9550.054,-1705.367,10.000},
				{-9720.591,-1705.367,10.000},
				{-9891.128,-1705.367,10.000},
				{-10061.664,-1705.367,10.000},
				{-10232.201,-1705.367,10.000},
				{-10402.738,-1705.367,10.000},
				{-10573.275,-1705.367,10.000},
				{-10743.811,-1705.367,10.000},
				{-10914.348,-1705.367,10.000},
				{-11084.885,-1705.367,10.000},
				{-11255.421,-1705.367,10.000},
				{-11425.958,-1705.367,10.000},
				{-11596.495,-1705.367,10.000},
				{-11767.031,-1705.367,10.000},
				{-11937.568,-1705.367,10.000},
				{-12108.105,-1705.367,10.000},
				{-12278.641,-1705.367,10.000},
				{-12449.178,-1705.367,10.000},
				{-12619.715,-1705.367,10.000},
				{-12790.251,-1705.367,10.000},
				{-12960.788,-1705.367,10.000},
				{-13131.325,-1705.367,10.000},
				{-13301.862,-1705.367,10.000},
				{-13472.398,-1705.367,10.000},
				{-13642.935,-1705.367,10.000},
				{-13813.472,-1705.367,10.000},
				{-13984.008,-1705.367,10.000},
				{-14154.545,-1705.367,10.000},
				{-14325.082,-1705.367,10.000},
				{-14495.618,-1705.367,10.000},
				{-14666.155,-1705.367,10.000},
				{-14836.692,-1705.367,10.000},
				{-15007.228,-1705.367,10.000},
				{-15177.765,-1705.367,10.000},
				{-15348.302,-1705.367,10.000},
				{-15518.838,-1705.367,10.000},
				{-15689.375,-1705.367,10.000},
				{-15859.912,-1705.367,10.000},
				{-16030.448,-1705.367,10.000},
				{-16200.985,-1705.367,10.000},
				{-16371.522,-1705.367,10.000},
				{-16542.059,-1705.367,10.000},
				{-16712.595,-1705.367,10.000},
				{-16883.132,-1705.367,10.000},
				{-17053.669,-1705.367,10.000},
				{-17224.205,-1705.367,10.000},
				{-17394.742,-1705.367,10.000},
				{-17565.279,-1705.367,10.000},
				{-17735.815,-1705.367,10.000},
				{-17906.352,-1705.367,10.000},
				{-18076.889,-1705.367,10.000},
				{-18247.425,-1705.367,10.000},
				{-18417.962,-1705.367,10.000},
				{-18588.499,-1705.367,10.000},
				{-18759.035,-1705.367,10.000},
				{-18929.572,-1705.367,10.000},
				{-19100.109,-1705.367,10.000},
				{-19270.646,-1705.367,10.000},
				{-19441.182,-1705.367,10.000},
				{-19611.719,-1705.367,10.000},
				{-19782.256,-1705.367,10.000},
				{-19952.792,-1705.367,10.000},
				{-20123.329,-1705.367,10.000},
				{-20293.866,-1705.367,10.000},
				{-20464.402,-1705.367,10.000},
				{-20634.939,-1705.367,10.000},
				{-20805.476,-1705.367,10.000},
				{-20976.012,-1705.367,10.000},
				{-21146.549,-1705.367,10.000},
				{-21317.086,-1705.367,10.000},
				{-21487.622,-1705.367,10.000},
				{-21658.159,-1705.367,10.000},
				{-21828.696,-1705.367,10.000},
				{-21999.232,-1705.367,10.000},
				{-22169.769,-1705.367,10.000},
				{-22340.306,-1705.367,10.000},
				{-22510.843,-1705.367,10.000},
				{-22681.379,-1705.367,10.000},
				{-22851.916,-1705.367,10.000},
				{-23022.390,-1704.740,10.000},
				{-23192.613,-1702.232,10.000},
				{-23362.335,-1697.216,10.000},
				{-23531.304,-1689.693,10.000},
				{-23699.270,-1679.661,10.000},
				{-23865.982,-1667.122,10.000},
				{-24031.190,-1652.074,10.000},
				{-24194.642,-1634.519,10.000},
				{-24356.087,-1614.456,10.000},
				{-24515.276,-1591.885,10.000},
				{-24671.956,-1566.806,10.000},
				{-24825.878,-1539.219,10.000},
				{-24976.790,-1509.124,10.000},
				{-25124.443,-1476.522,10.000},
				{-25268.584,-1441.411,10.000},
				{-25408.963,-1403.793,10.000},
				{-25545.330,-1363.667,10.000},
				{-25677.496,-1321.659,10.000},
				{-25805.398,-1279.025,10.000},
				{-25929.037,-1236.391,10.000},
				{-26048.413,-1193.757,10.000},
				{-26163.525,-1151.123,10.000},
				{-26274.374,-1108.488,10.000},
				{-26380.959,-1065.854,10.000},
				{-26483.281,-1023.220,10.000},
				{-26581.340,-980.586,10.000},
				{-26675.135,-937.952,10.000},
				{-26764.667,-895.318,10.000},
				{-26849.935,-852.683,10.000},
				{-26930.940,-810.049,10.000},
				{-27007.682,-767.415,10.000},
				{-27080.160,-724.781,10.000},
				{-27148.375,-682.147,10.000},
				{-27212.326,-639.513,10.000},
				{-27272.014,-596.878,10.000},
				{-27327.438,-554.244,10.000},
				{-27378.599,-511.610,10.000},
				{-27425.497,-468.976,10.000},
				{-27468.131,-426.342,10.000},
				{-27506.502,-383.708,10.000},
				{-27540.672,-341.700,10.000},
				{-27570.829,-301.574,10.000},
				{-27597.225,-263.956,10.000},
				{-27620.109,-228.845,10.000},
				{-27639.733,-196.243,10.000},
				{-27656.348,-166.148,10.000},
				{-27670.204,-138.561,10.000},
				{-27681.552,-113.482,10.000},
				{-27690.644,-90.911,10.000},
				{-27697.728,-70.848,10.000},
				{-27703.058,-53.293,10.000},
				{-27706.882,-38.245,10.000},
				{-27709.453,-25.706,10.000},
				{-27711.020,-15.674,10.000},
				{-27711.835,-8.151,10.000},
				{-27712.149,-3.135,10.000},
				{-27712.211,-0.627,10.000},
				{-27712.211,-0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}