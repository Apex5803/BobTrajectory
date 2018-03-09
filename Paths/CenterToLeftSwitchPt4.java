package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchPt4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (-3.25,5.25,45.00)
	
	public CenterToLeftSwitchPt4() {
		this(false);
	}
			
    public CenterToLeftSwitchPt4(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.125,-2.508,10.000},
				{-0.627,-5.016,10.000},
				{-1.756,-11.286,10.000},
				{-3.762,-20.065,10.000},
				{-6.897,-31.353,10.000},
				{-11.413,-45.154,10.000},
				{-17.560,-61.469,10.000},
				{-25.590,-80.302,10.000},
				{-35.756,-101.659,10.000},
				{-48.311,-125.546,10.000},
				{-63.508,-151.971,10.000},
				{-81.602,-180.944,10.000},
				{-102.850,-212.476,10.000},
				{-127.508,-246.581,10.000},
				{-155.835,-283.275,10.000},
				{-188.093,-322.576,10.000},
				{-224.543,-364.503,10.000},
				{-265.325,-407.815,10.000},
				{-310.451,-451.267,10.000},
				{-359.938,-494.869,10.000},
				{-413.802,-538.634,10.000},
				{-472.059,-582.571,10.000},
				{-534.728,-626.691,10.000},
				{-601.828,-671.003,10.000},
				{-673.379,-715.512,10.000},
				{-749.402,-760.227,10.000},
				{-829.917,-805.150,10.000},
				{-914.946,-850.287,10.000},
				{-1004.510,-895.638,10.000},
				{-1098.630,-941.203,10.000},
				{-1197.328,-986.982,10.000},
				{-1300.625,-1032.971,10.000},
				{-1408.542,-1079.165,10.000},
				{-1521.098,-1125.557,10.000},
				{-1638.311,-1172.139,10.000},
				{-1760.201,-1218.899,10.000},
				{-1886.784,-1265.825,10.000},
				{-2018.074,-1312.903,10.000},
				{-2154.086,-1360.116,10.000},
				{-2294.830,-1407.448,10.000},
				{-2440.186,-1453.560,10.000},
				{-2589.897,-1497.103,10.000},
				{-2743.700,-1538.036,10.000},
				{-2901.332,-1576.322,10.000},
				{-3062.525,-1611.924,10.000},
				{-3227.006,-1644.808,10.000},
				{-3394.500,-1674.943,10.000},
				{-3564.730,-1702.300,10.000},
				{-3737.416,-1726.856,10.000},
				{-3912.275,-1748.590,10.000},
				{-4089.023,-1767.484,10.000},
				{-4267.376,-1783.526,10.000},
				{-4447.046,-1796.705,10.000},
				{-4627.748,-1807.017,10.000},
				{-4809.194,-1814.459,10.000},
				{-4991.097,-1819.032,10.000},
				{-5173.171,-1820.740,10.000},
				{-5355.264,-1820.929,10.000},
				{-5537.358,-1820.947,10.000},
				{-5719.439,-1820.803,10.000},
				{-5901.490,-1820.507,10.000},
				{-6083.496,-1820.067,10.000},
				{-6265.445,-1819.492,10.000},
				{-6447.324,-1818.790,10.000},
				{-6629.121,-1817.969,10.000},
				{-6810.825,-1817.036,10.000},
				{-6992.425,-1815.999,10.000},
				{-7173.911,-1814.864,10.000},
				{-7355.275,-1813.638,10.000},
				{-7536.508,-1812.328,10.000},
				{-7717.602,-1810.939,10.000},
				{-7898.549,-1809.476,10.000},
				{-8079.344,-1807.945,10.000},
				{-8259.979,-1806.351,10.000},
				{-8440.449,-1804.699,10.000},
				{-8620.748,-1802.992,10.000},
				{-8800.872,-1801.235,10.000},
				{-8980.815,-1799.431,10.000},
				{-9160.573,-1797.585,10.000},
				{-9340.143,-1795.698,10.000},
				{-9519.520,-1793.775,10.000},
				{-9698.702,-1791.819,10.000},
				{-9877.685,-1789.831,10.000},
				{-10056.467,-1787.814,10.000},
				{-10235.044,-1785.770,10.000},
				{-10413.414,-1783.701,10.000},
				{-10591.575,-1781.610,10.000},
				{-10769.525,-1779.497,10.000},
				{-10947.261,-1777.363,10.000},
				{-11124.782,-1775.211,10.000},
				{-11302.086,-1773.042,10.000},
				{-11479.172,-1770.856,10.000},
				{-11656.037,-1768.654,10.000},
				{-11832.681,-1766.436,10.000},
				{-12009.101,-1764.204,10.000},
				{-12185.297,-1761.958,10.000},
				{-12361.267,-1759.699,10.000},
				{-12537.009,-1757.425,10.000},
				{-12712.523,-1755.138,10.000},
				{-12887.807,-1752.838,10.000},
				{-13062.859,-1750.524,10.000},
				{-13237.679,-1748.196,10.000},
				{-13412.264,-1745.853,10.000},
				{-13586.614,-1743.497,10.000},
				{-13760.726,-1741.125,10.000},
				{-13934.600,-1738.738,10.000},
				{-14108.234,-1736.335,10.000},
				{-14281.625,-1733.914,10.000},
				{-14454.773,-1731.476,10.000},
				{-14627.675,-1729.019,10.000},
				{-14800.329,-1726.542,10.000},
				{-14972.733,-1724.044,10.000},
				{-15144.886,-1721.524,10.000},
				{-15316.784,-1718.981,10.000},
				{-15488.425,-1716.412,10.000},
				{-15659.807,-1713.818,10.000},
				{-15830.926,-1711.196,10.000},
				{-16001.781,-1708.544,10.000},
				{-16172.367,-1705.861,10.000},
				{-16342.681,-1703.145,10.000},
				{-16512.721,-1700.394,10.000},
				{-16682.481,-1697.606,10.000},
				{-16851.959,-1694.778,10.000},
				{-17021.150,-1691.908,10.000},
				{-17190.049,-1688.994,10.000},
				{-17358.653,-1686.033,10.000},
				{-17526.955,-1683.022,10.000},
				{-17694.951,-1679.959,10.000},
				{-17862.635,-1676.840,10.000},
				{-18030.001,-1673.662,10.000},
				{-18197.043,-1670.421,10.000},
				{-18363.754,-1667.115,10.000},
				{-18530.128,-1663.738,10.000},
				{-18696.157,-1660.287,10.000},
				{-18861.833,-1656.757,10.000},
				{-19027.147,-1653.144,10.000},
				{-19192.091,-1649.443,10.000},
				{-19356.656,-1645.649,10.000},
				{-19520.832,-1641.756,10.000},
				{-19684.608,-1637.758,10.000},
				{-19847.973,-1633.649,10.000},
				{-20010.915,-1629.423,10.000},
				{-20173.422,-1625.071,10.000},
				{-20335.481,-1620.587,10.000},
				{-20497.077,-1615.962,10.000},
				{-20658.196,-1611.188,10.000},
				{-20818.821,-1606.255,10.000},
				{-20978.937,-1601.154,10.000},
				{-21138.524,-1595.872,10.000},
				{-21297.564,-1590.400,10.000},
				{-21456.036,-1584.724,10.000},
				{-21613.920,-1578.832,10.000},
				{-21771.190,-1572.708,10.000},
				{-21927.824,-1566.337,10.000},
				{-22083.794,-1559.702,10.000},
				{-22239.073,-1552.786,10.000},
				{-22393.630,-1545.568,10.000},
				{-22547.432,-1538.027,10.000},
				{-22700.446,-1530.139,10.000},
				{-22852.634,-1521.880,10.000},
				{-23003.956,-1513.221,10.000},
				{-23154.370,-1504.132,10.000},
				{-23303.828,-1494.581,10.000},
				{-23452.281,-1484.532,10.000},
				{-23599.675,-1473.943,10.000},
				{-23745.952,-1462.773,10.000},
				{-23891.050,-1450.972,10.000},
				{-24034.899,-1438.489,10.000},
				{-24177.425,-1425.264,10.000},
				{-24318.548,-1411.233,10.000},
				{-24458.181,-1396.324,10.000},
				{-24596.226,-1380.456,10.000},
				{-24732.580,-1363.542,10.000},
				{-24867.129,-1345.481,10.000},
				{-24999.745,-1326.162,10.000},
				{-25130.291,-1305.462,10.000},
				{-25258.615,-1283.239,10.000},
				{-25384.548,-1259.335,10.000},
				{-25507.906,-1233.574,10.000},
				{-25628.481,-1205.752,10.000},
				{-25746.045,-1175.641,10.000},
				{-25860.343,-1142.981,10.000},
				{-25971.091,-1107.475,10.000},
				{-26077.969,-1068.783,10.000},
				{-26180.621,-1026.516,10.000},
				{-26278.644,-980.230,10.000},
				{-26371.585,-929.410,10.000},
				{-26458.931,-873.466,10.000},
				{-26540.103,-811.717,10.000},
				{-26614.440,-743.376,10.000},
				{-26681.194,-667.537,10.000},
				{-26739.510,-583.155,10.000},
				{-26788.413,-489.030,10.000},
				{-26826.792,-383.791,10.000},
				{-26853.380,-265.884,10.000},
				{-26866.737,-133.572,10.000},
				{-26868.243,-15.056,10.000},
				{-26886.444,-182.007,10.000},
				{-26923.376,-369.327,10.000},
				{-26981.263,-578.872,10.000},
				{-27062.464,-812.007,10.000},
				{-27169.376,-1069.116,10.000},
				{-27304.265,-1348.889,10.000},
				{-27469.003,-1647.382,10.000},
				{-27664.695,-1956.926,10.000},
				{-27891.211,-2265.160,10.000},
				{-28146.676,-2554.648,10.000},
				{-28427.056,-2803.793,10.000},
				{-28726.012,-2989.562,10.000},
				{-29035.205,-3091.932,10.000},
				{-29345.088,-3098.828,10.000},
				{-29646.041,-3009.532,10.000},
				{-29929.530,-2834.891,10.000},
				{-30188.951,-2594.214,10.000},
				{-30419.992,-2310.409,10.000},
				{-30620.532,-2005.395,10.000},
				{-30790.247,-1697.153,10.000},
				{-30930.110,-1398.631,10.000},
				{-31041.910,-1118.001,10.000},
				{-31127.869,-859.591,10.000},
				{-31190.367,-624.977,10.000},
				{-31231.761,-413.945,10.000},
				{-31254.284,-225.227,10.000},
				{-31259.986,-57.017,10.000},
				{-31269.256,-92.701,10.000},
				{-31291.850,-225.943,10.000},
				{-31326.313,-344.623,10.000},
				{-31371.362,-450.490,10.000},
				{-31425.873,-545.114,10.000},
				{-31488.861,-629.881,10.000},
				{-31559.462,-706.003,10.000},
				{-31636.915,-774.539,10.000},
				{-31720.556,-836.407,10.000},
				{-31809.796,-892.402,10.000},
				{-31904.118,-943.215,10.000},
				{-32003.062,-989.444,10.000},
				{-32106.223,-1031.608,10.000},
				{-32213.239,-1070.158,10.000},
				{-32323.788,-1105.488,10.000},
				{-32437.582,-1137.942,10.000},
				{-32554.364,-1167.818,10.000},
				{-32673.902,-1195.380,10.000},
				{-32795.988,-1220.860,10.000},
				{-32920.434,-1244.462,10.000},
				{-33047.071,-1266.365,10.000},
				{-33175.744,-1286.729,10.000},
				{-33306.313,-1305.696,10.000},
				{-33438.652,-1323.390,10.000},
				{-33572.644,-1339.924,10.000},
				{-33708.184,-1355.398,10.000},
				{-33845.174,-1369.902,10.000},
				{-33983.526,-1383.516,10.000},
				{-34123.157,-1396.313,10.000},
				{-34263.993,-1408.358,10.000},
				{-34405.964,-1419.709,10.000},
				{-34549.006,-1430.420,10.000},
				{-34693.060,-1440.540,10.000},
				{-34838.071,-1450.111,10.000},
				{-34983.989,-1459.174,10.000},
				{-35130.765,-1467.765,10.000},
				{-35278.357,-1475.917,10.000},
				{-35426.723,-1483.660,10.000},
				{-35575.825,-1491.022,10.000},
				{-35725.628,-1498.028,10.000},
				{-35876.098,-1504.703,10.000},
				{-36027.205,-1511.066,10.000},
				{-36178.918,-1517.138,10.000},
				{-36331.212,-1522.937,10.000},
				{-36484.060,-1528.480,10.000},
				{-36637.438,-1533.782,10.000},
				{-36791.324,-1538.858,10.000},
				{-36945.696,-1543.721,10.000},
				{-37100.535,-1548.383,10.000},
				{-37255.820,-1552.855,10.000},
				{-37411.535,-1557.149,10.000},
				{-37567.662,-1561.275,10.000},
				{-37724.187,-1565.241,10.000},
				{-37881.092,-1569.056,10.000},
				{-38038.365,-1572.728,10.000},
				{-38195.991,-1576.264,10.000},
				{-38353.959,-1579.673,10.000},
				{-38512.255,-1582.960,10.000},
				{-38670.868,-1586.131,10.000},
				{-38829.787,-1589.192,10.000},
				{-38989.002,-1592.149,10.000},
				{-39148.502,-1595.007,10.000},
				{-39308.279,-1597.770,10.000},
				{-39468.324,-1600.443,10.000},
				{-39628.627,-1603.031,10.000},
				{-39789.181,-1605.537,10.000},
				{-39949.977,-1607.965,10.000},
				{-40111.009,-1610.318,10.000},
				{-40272.269,-1612.601,10.000},
				{-40433.750,-1614.815,10.000},
				{-40595.447,-1616.965,10.000},
				{-40757.352,-1619.053,10.000},
				{-40919.460,-1621.082,10.000},
				{-41081.766,-1623.054,10.000},
				{-41244.263,-1624.971,10.000},
				{-41406.947,-1626.837,10.000},
				{-41569.812,-1628.653,10.000},
				{-41732.854,-1630.421,10.000},
				{-41896.069,-1632.144,10.000},
				{-42059.451,-1633.822,10.000},
				{-42222.997,-1635.459,10.000},
				{-42386.702,-1637.055,10.000},
				{-42550.564,-1638.613,10.000},
				{-42714.577,-1640.133,10.000},
				{-42878.739,-1641.618,10.000},
				{-43043.045,-1643.068,10.000},
				{-43207.494,-1644.486,10.000},
				{-43372.081,-1645.872,10.000},
				{-43536.804,-1647.227,10.000},
				{-43701.659,-1648.554,10.000},
				{-43866.644,-1649.852,10.000},
				{-44031.757,-1651.123,10.000},
				{-44196.994,-1652.369,10.000},
				{-44362.353,-1653.589,10.000},
				{-44527.831,-1654.786,10.000},
				{-44693.427,-1655.959,10.000},
				{-44859.138,-1657.111,10.000},
				{-45024.962,-1658.241,10.000},
				{-45190.897,-1659.350,10.000},
				{-45356.941,-1660.440,10.000},
				{-45523.092,-1661.511,10.000},
				{-45689.349,-1662.564,10.000},
				{-45855.709,-1663.600,10.000},
				{-46022.171,-1664.618,10.000},
				{-46188.733,-1665.621,10.000},
				{-46355.394,-1666.608,10.000},
				{-46522.152,-1667.580,10.000},
				{-46689.006,-1668.539,10.000},
				{-46855.954,-1669.483,10.000},
				{-47022.995,-1670.414,10.000},
				{-47190.129,-1671.333,10.000},
				{-47357.353,-1672.240,10.000},
				{-47524.666,-1673.136,10.000},
				{-47692.068,-1674.020,10.000},
				{-47859.558,-1674.894,10.000},
				{-48027.133,-1675.758,10.000},
				{-48194.795,-1676.612,10.000},
				{-48362.540,-1677.458,10.000},
				{-48530.370,-1678.295,10.000},
				{-48698.282,-1679.123,10.000},
				{-48866.277,-1679.944,10.000},
				{-49034.352,-1680.758,10.000},
				{-49202.509,-1681.565,10.000},
				{-49370.745,-1682.365,10.000},
				{-49539.061,-1683.159,10.000},
				{-49707.415,-1683.537,10.000},
				{-49875.641,-1682.258,10.000},
				{-50043.490,-1678.493,10.000},
				{-50210.714,-1672.237,10.000},
				{-50377.062,-1663.485,10.000},
				{-50542.286,-1652.235,10.000},
				{-50706.134,-1638.482,10.000},
				{-50868.356,-1622.222,10.000},
				{-51028.701,-1603.452,10.000},
				{-51186.918,-1582.168,10.000},
				{-51342.755,-1558.368,10.000},
				{-51495.960,-1532.047,10.000},
				{-51646.280,-1503.203,10.000},
				{-51793.463,-1471.832,10.000},
				{-51937.256,-1437.933,10.000},
				{-52077.406,-1401.501,10.000},
				{-52213.660,-1362.536,10.000},
				{-52345.805,-1321.448,10.000},
				{-52473.753,-1279.484,10.000},
				{-52597.501,-1237.478,10.000},
				{-52717.044,-1195.431,10.000},
				{-52832.379,-1153.345,10.000},
				{-52943.501,-1111.221,10.000},
				{-53050.407,-1069.061,10.000},
				{-53153.094,-1026.866,10.000},
				{-53251.557,-984.637,10.000},
				{-53345.795,-942.375,10.000},
				{-53435.803,-900.083,10.000},
				{-53521.579,-857.761,10.000},
				{-53603.120,-815.411,10.000},
				{-53680.424,-773.033,10.000},
				{-53753.487,-730.630,10.000},
				{-53822.307,-688.202,10.000},
				{-53886.882,-645.752,10.000},
				{-53947.210,-603.279,10.000},
				{-54003.289,-560.787,10.000},
				{-54055.116,-518.275,10.000},
				{-54102.691,-475.746,10.000},
				{-54146.011,-433.201,10.000},
				{-54185.075,-390.641,10.000},
				{-54219.923,-348.484,10.000},
				{-54250.722,-307.983,10.000},
				{-54277.720,-269.980,10.000},
				{-54301.167,-234.476,10.000},
				{-54321.314,-201.473,10.000},
				{-54338.412,-170.972,10.000},
				{-54352.709,-142.974,10.000},
				{-54364.457,-117.480,10.000},
				{-54373.906,-94.492,10.000},
				{-54381.307,-74.010,10.000},
				{-54386.911,-56.035,10.000},
				{-54390.967,-40.566,10.000},
				{-54393.728,-27.605,10.000},
				{-54395.443,-17.152,10.000},
				{-54396.364,-9.206,10.000},
				{-54396.741,-3.768,10.000},
				{-54396.824,-0.838,10.000},
				{-54396.824,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.125,-2.508,10.000},
				{-0.627,-5.016,10.000},
				{-1.755,-11.285,10.000},
				{-3.762,-20.062,10.000},
				{-6.896,-31.344,10.000},
				{-11.409,-45.130,10.000},
				{-17.551,-61.418,10.000},
				{-25.571,-80.203,10.000},
				{-35.719,-101.480,10.000},
				{-48.243,-125.243,10.000},
				{-63.392,-151.484,10.000},
				{-81.411,-180.193,10.000},
				{-102.547,-211.358,10.000},
				{-127.043,-244.966,10.000},
				{-155.143,-281.000,10.000},
				{-187.088,-319.445,10.000},
				{-223.116,-360.278,10.000},
				{-263.339,-402.234,10.000},
				{-307.744,-444.051,10.000},
				{-356.316,-485.717,10.000},
				{-409.038,-527.221,10.000},
				{-465.893,-568.551,10.000},
				{-526.863,-609.700,10.000},
				{-591.929,-650.657,10.000},
				{-661.070,-691.415,10.000},
				{-734.267,-731.969,10.000},
				{-811.499,-772.314,10.000},
				{-892.743,-812.446,10.000},
				{-977.979,-852.363,10.000},
				{-1067.186,-892.066,10.000},
				{-1160.342,-931.555,10.000},
				{-1257.425,-970.835,10.000},
				{-1358.416,-1009.909,10.000},
				{-1463.294,-1048.785,10.000},
				{-1572.042,-1087.472,10.000},
				{-1684.640,-1125.981,10.000},
				{-1801.072,-1164.323,10.000},
				{-1921.323,-1202.513,10.000},
				{-2045.380,-1240.568,10.000},
				{-2173.231,-1278.505,10.000},
				{-2304.746,-1315.153,10.000},
				{-2439.682,-1349.355,10.000},
				{-2577.797,-1381.151,10.000},
				{-2718.854,-1410.578,10.000},
				{-2862.622,-1437.673,10.000},
				{-3008.869,-1462.471,10.000},
				{-3157.369,-1485.001,10.000},
				{-3307.898,-1505.294,10.000},
				{-3460.235,-1523.372,10.000},
				{-3614.161,-1539.257,10.000},
				{-3769.458,-1552.965,10.000},
				{-3925.909,-1564.510,10.000},
				{-4083.299,-1573.902,10.000},
				{-4241.413,-1581.145,10.000},
				{-4400.038,-1586.243,10.000},
				{-4558.957,-1589.193,10.000},
				{-4717.956,-1589.993,10.000},
				{-4876.937,-1589.804,10.000},
				{-5035.915,-1589.786,10.000},
				{-5194.908,-1589.930,10.000},
				{-5353.931,-1590.226,10.000},
				{-5512.997,-1590.666,10.000},
				{-5672.122,-1591.241,10.000},
				{-5831.316,-1591.943,10.000},
				{-5990.592,-1592.764,10.000},
				{-6149.962,-1593.697,10.000},
				{-6309.435,-1594.734,10.000},
				{-6469.022,-1595.869,10.000},
				{-6628.732,-1597.095,10.000},
				{-6788.572,-1598.405,10.000},
				{-6948.552,-1599.794,10.000},
				{-7108.678,-1601.257,10.000},
				{-7268.956,-1602.788,10.000},
				{-7429.395,-1604.382,10.000},
				{-7589.998,-1606.035,10.000},
				{-7750.772,-1607.742,10.000},
				{-7911.722,-1609.499,10.000},
				{-8072.852,-1611.302,10.000},
				{-8234.167,-1613.149,10.000},
				{-8395.671,-1615.035,10.000},
				{-8557.366,-1616.958,10.000},
				{-8719.258,-1618.915,10.000},
				{-8881.348,-1620.903,10.000},
				{-9043.640,-1622.920,10.000},
				{-9206.137,-1624.964,10.000},
				{-9368.840,-1627.032,10.000},
				{-9531.752,-1629.124,10.000},
				{-9694.876,-1631.237,10.000},
				{-9858.213,-1633.370,10.000},
				{-10021.765,-1635.522,10.000},
				{-10185.534,-1637.692,10.000},
				{-10349.522,-1639.878,10.000},
				{-10513.730,-1642.080,10.000},
				{-10678.160,-1644.297,10.000},
				{-10842.813,-1646.529,10.000},
				{-11007.690,-1648.775,10.000},
				{-11172.794,-1651.035,10.000},
				{-11338.124,-1653.309,10.000},
				{-11503.684,-1655.595,10.000},
				{-11669.474,-1657.896,10.000},
				{-11835.495,-1660.210,10.000},
				{-12001.748,-1662.538,10.000},
				{-12168.236,-1664.880,10.000},
				{-12334.960,-1667.237,10.000},
				{-12501.921,-1669.608,10.000},
				{-12669.121,-1671.996,10.000},
				{-12836.560,-1674.399,10.000},
				{-13004.242,-1676.820,10.000},
				{-13172.168,-1679.258,10.000},
				{-13340.340,-1681.715,10.000},
				{-13508.759,-1684.192,10.000},
				{-13677.428,-1686.690,10.000},
				{-13846.349,-1689.210,10.000},
				{-14015.524,-1691.753,10.000},
				{-14184.956,-1694.321,10.000},
				{-14354.648,-1696.916,10.000},
				{-14524.602,-1699.538,10.000},
				{-14694.821,-1702.190,10.000},
				{-14865.308,-1704.872,10.000},
				{-15036.067,-1707.589,10.000},
				{-15207.101,-1710.340,10.000},
				{-15378.414,-1713.128,10.000},
				{-15550.009,-1715.956,10.000},
				{-15721.892,-1718.826,10.000},
				{-15894.066,-1721.740,10.000},
				{-16066.536,-1724.701,10.000},
				{-16239.307,-1727.711,10.000},
				{-16412.384,-1730.775,10.000},
				{-16585.774,-1733.894,10.000},
				{-16759.481,-1737.072,10.000},
				{-16933.512,-1740.312,10.000},
				{-17107.874,-1743.619,10.000},
				{-17282.574,-1746.996,10.000},
				{-17457.618,-1750.447,10.000},
				{-17633.016,-1753.977,10.000},
				{-17808.775,-1757.589,10.000},
				{-17984.904,-1761.290,10.000},
				{-18161.412,-1765.084,10.000},
				{-18338.310,-1768.977,10.000},
				{-18515.608,-1772.975,10.000},
				{-18693.316,-1777.084,10.000},
				{-18871.447,-1781.311,10.000},
				{-19050.013,-1785.662,10.000},
				{-19229.028,-1790.146,10.000},
				{-19408.505,-1794.771,10.000},
				{-19588.460,-1799.545,10.000},
				{-19768.907,-1804.478,10.000},
				{-19949.865,-1809.580,10.000},
				{-20131.351,-1814.861,10.000},
				{-20313.385,-1820.333,10.000},
				{-20495.986,-1826.009,10.000},
				{-20679.176,-1831.901,10.000},
				{-20862.978,-1838.025,10.000},
				{-21047.418,-1844.396,10.000},
				{-21232.521,-1851.030,10.000},
				{-21418.316,-1857.947,10.000},
				{-21604.832,-1865.165,10.000},
				{-21792.103,-1872.706,10.000},
				{-21980.162,-1880.593,10.000},
				{-22169.047,-1888.853,10.000},
				{-22358.798,-1897.511,10.000},
				{-22549.458,-1906.600,10.000},
				{-22741.073,-1916.151,10.000},
				{-22933.694,-1926.200,10.000},
				{-23127.372,-1936.788,10.000},
				{-23322.168,-1947.958,10.000},
				{-23518.144,-1959.759,10.000},
				{-23715.368,-1972.242,10.000},
				{-23913.915,-1985.466,10.000},
				{-24113.865,-1999.497,10.000},
				{-24315.305,-2014.406,10.000},
				{-24518.333,-2030.273,10.000},
				{-24723.051,-2047.187,10.000},
				{-24929.576,-2065.248,10.000},
				{-25138.033,-2084.566,10.000},
				{-25348.559,-2105.266,10.000},
				{-25561.308,-2127.488,10.000},
				{-25776.447,-2151.390,10.000},
				{-25994.162,-2177.151,10.000},
				{-26214.659,-2204.971,10.000},
				{-26438.167,-2235.081,10.000},
				{-26664.941,-2267.740,10.000},
				{-26895.266,-2303.245,10.000},
				{-27129.459,-2341.935,10.000},
				{-27367.879,-2384.199,10.000},
				{-27610.927,-2430.483,10.000},
				{-27859.057,-2481.300,10.000},
				{-28112.781,-2537.240,10.000},
				{-28372.680,-2598.985,10.000},
				{-28639.412,-2667.321,10.000},
				{-28913.727,-2743.154,10.000},
				{-29196.480,-2827.528,10.000},
				{-29488.645,-2921.644,10.000},
				{-29791.332,-3026.873,10.000},
				{-30105.809,-3144.767,10.000},
				{-30433.515,-3277.063,10.000},
				{-30776.082,-3425.667,10.000},
				{-31135.341,-3592.597,10.000},
				{-31513.330,-3779.888,10.000},
				{-31912.270,-3989.396,10.000},
				{-32334.518,-4222.486,10.000},
				{-32782.472,-4479.540,10.000},
				{-33258.397,-4759.248,10.000},
				{-33764.163,-5057.664,10.000},
				{-34300.876,-5367.121,10.000},
				{-34868.402,-5675.260,10.000},
				{-35464.867,-5964.653,10.000},
				{-36086.238,-6213.710,10.000},
				{-36726.179,-6399.410,10.000},
				{-37376.353,-6501.741,10.000},
				{-38027.216,-6508.634,10.000},
				{-38669.154,-6419.373,10.000},
				{-39293.633,-6244.796,10.000},
				{-39894.054,-6004.205,10.000},
				{-40466.103,-5720.495,10.000},
				{-41007.661,-5415.575,10.000},
				{-41518.403,-5107.422,10.000},
				{-41999.301,-4808.978,10.000},
				{-42452.142,-4528.414,10.000},
				{-42879.148,-4270.060,10.000},
				{-43282.697,-4035.492,10.000},
				{-43665.147,-3824.498,10.000},
				{-44028.728,-3635.811,10.000},
				{-44375.491,-3467.625,10.000},
				{-44707.284,-3317.928,10.000},
				{-45025.754,-3184.703,10.000},
				{-45332.358,-3066.037,10.000},
				{-45628.376,-2960.180,10.000},
				{-45914.932,-2865.565,10.000},
				{-46193.013,-2780.807,10.000},
				{-46463.482,-2704.690,10.000},
				{-46727.098,-2636.160,10.000},
				{-46984.528,-2574.296,10.000},
				{-47236.358,-2518.305,10.000},
				{-47483.108,-2467.495,10.000},
				{-47725.234,-2421.269,10.000},
				{-47963.145,-2379.108,10.000},
				{-48197.201,-2340.559,10.000},
				{-48427.724,-2305.231,10.000},
				{-48655.002,-2272.779,10.000},
				{-48879.293,-2242.904,10.000},
				{-49100.827,-2215.343,10.000},
				{-49319.813,-2189.864,10.000},
				{-49536.440,-2166.263,10.000},
				{-49750.876,-2144.361,10.000},
				{-49963.275,-2123.997,10.000},
				{-50173.779,-2105.032,10.000},
				{-50382.512,-2087.338,10.000},
				{-50589.593,-2070.805,10.000},
				{-50795.126,-2055.331,10.000},
				{-50999.209,-2040.827,10.000},
				{-51201.930,-2027.213,10.000},
				{-51403.372,-2014.417,10.000},
				{-51603.609,-2002.372,10.000},
				{-51802.711,-1991.021,10.000},
				{-52000.742,-1980.310,10.000},
				{-52197.761,-1970.191,10.000},
				{-52393.823,-1960.620,10.000},
				{-52588.979,-1951.557,10.000},
				{-52783.276,-1942.967,10.000},
				{-52976.757,-1934.815,10.000},
				{-53169.464,-1927.072,10.000},
				{-53361.435,-1919.710,10.000},
				{-53552.706,-1912.703,10.000},
				{-53743.309,-1906.029,10.000},
				{-53933.275,-1899.666,10.000},
				{-54122.635,-1893.594,10.000},
				{-54311.414,-1887.795,10.000},
				{-54499.639,-1882.252,10.000},
				{-54687.334,-1876.950,10.000},
				{-54874.522,-1871.875,10.000},
				{-55061.223,-1867.012,10.000},
				{-55247.458,-1862.350,10.000},
				{-55433.246,-1857.877,10.000},
				{-55618.604,-1853.583,10.000},
				{-55803.550,-1849.458,10.000},
				{-55988.099,-1845.492,10.000},
				{-56172.267,-1841.677,10.000},
				{-56356.067,-1838.005,10.000},
				{-56539.514,-1834.469,10.000},
				{-56722.620,-1831.060,10.000},
				{-56905.398,-1827.774,10.000},
				{-57087.858,-1824.602,10.000},
				{-57270.012,-1821.541,10.000},
				{-57451.870,-1818.584,10.000},
				{-57633.443,-1815.726,10.000},
				{-57814.739,-1812.963,10.000},
				{-57995.768,-1810.290,10.000},
				{-58176.539,-1807.702,10.000},
				{-58357.058,-1805.197,10.000},
				{-58537.335,-1802.769,10.000},
				{-58717.377,-1800.415,10.000},
				{-58897.190,-1798.133,10.000},
				{-59076.782,-1795.918,10.000},
				{-59256.158,-1793.768,10.000},
				{-59435.326,-1791.680,10.000},
				{-59614.292,-1789.652,10.000},
				{-59793.060,-1787.680,10.000},
				{-59971.636,-1785.762,10.000},
				{-60150.025,-1783.896,10.000},
				{-60328.233,-1782.080,10.000},
				{-60506.265,-1780.312,10.000},
				{-60684.124,-1778.590,10.000},
				{-60861.815,-1776.911,10.000},
				{-61039.342,-1775.274,10.000},
				{-61216.710,-1773.678,10.000},
				{-61393.922,-1772.121,10.000},
				{-61570.982,-1770.600,10.000},
				{-61747.894,-1769.116,10.000},
				{-61924.660,-1767.665,10.000},
				{-62101.285,-1766.248,10.000},
				{-62277.771,-1764.862,10.000},
				{-62454.122,-1763.506,10.000},
				{-62630.340,-1762.180,10.000},
				{-62806.428,-1760.882,10.000},
				{-62982.389,-1759.610,10.000},
				{-63158.226,-1758.365,10.000},
				{-63333.940,-1757.144,10.000},
				{-63509.535,-1755.948,10.000},
				{-63685.012,-1754.774,10.000},
				{-63860.374,-1753.623,10.000},
				{-64035.624,-1752.493,10.000},
				{-64210.762,-1751.383,10.000},
				{-64385.791,-1750.293,10.000},
				{-64560.714,-1749.222,10.000},
				{-64735.531,-1748.169,10.000},
				{-64910.244,-1747.134,10.000},
				{-65084.855,-1746.115,10.000},
				{-65259.367,-1745.113,10.000},
				{-65433.779,-1744.125,10.000},
				{-65608.095,-1743.153,10.000},
				{-65782.314,-1742.195,10.000},
				{-65956.439,-1741.251,10.000},
				{-66130.471,-1740.319,10.000},
				{-66304.411,-1739.400,10.000},
				{-66478.261,-1738.494,10.000},
				{-66652.020,-1737.598,10.000},
				{-66825.692,-1736.714,10.000},
				{-66999.276,-1735.840,10.000},
				{-67172.773,-1734.976,10.000},
				{-67346.185,-1734.121,10.000},
				{-67519.513,-1733.276,10.000},
				{-67692.757,-1732.439,10.000},
				{-67865.918,-1731.610,10.000},
				{-68038.997,-1730.789,10.000},
				{-68211.994,-1729.976,10.000},
				{-68384.911,-1729.169,10.000},
				{-68557.748,-1728.369,10.000},
				{-68730.506,-1727.575,10.000},
				{-68903.142,-1726.365,10.000},
				{-69075.489,-1723.472,10.000},
				{-69247.294,-1718.050,10.000},
				{-69418.305,-1710.103,10.000},
				{-69588.268,-1699.636,10.000},
				{-69756.933,-1686.652,10.000},
				{-69924.049,-1671.154,10.000},
				{-70089.364,-1653.148,10.000},
				{-70252.627,-1632.636,10.000},
				{-70413.589,-1609.622,10.000},
				{-70572.000,-1584.109,10.000},
				{-70727.610,-1556.101,10.000},
				{-70880.170,-1525.600,10.000},
				{-71029.431,-1492.609,10.000},
				{-71175.145,-1457.132,10.000},
				{-71317.062,-1419.171,10.000},
				{-71454.934,-1378.728,10.000},
				{-71588.557,-1336.223,10.000},
				{-71717.849,-1292.919,10.000},
				{-71842.814,-1249.657,10.000},
				{-71963.458,-1206.435,10.000},
				{-72079.783,-1163.253,10.000},
				{-72191.794,-1120.109,10.000},
				{-72299.494,-1077.000,10.000},
				{-72402.887,-1033.927,10.000},
				{-72501.976,-990.888,10.000},
				{-72596.764,-947.881,10.000},
				{-72687.254,-904.905,10.000},
				{-72773.450,-861.959,10.000},
				{-72855.354,-819.041,10.000},
				{-72932.969,-776.150,10.000},
				{-73006.298,-733.285,10.000},
				{-73075.342,-690.444,10.000},
				{-73140.105,-647.627,10.000},
				{-73200.588,-604.831,10.000},
				{-73256.793,-562.055,10.000},
				{-73308.723,-519.298,10.000},
				{-73356.379,-476.559,10.000},
				{-73399.763,-433.835,10.000},
				{-73438.875,-391.127,10.000},
				{-73473.760,-348.848,10.000},
				{-73504.585,-308.251,10.000},
				{-73531.602,-270.173,10.000},
				{-73555.064,-234.612,10.000},
				{-73575.220,-201.566,10.000},
				{-73592.324,-171.033,10.000},
				{-73606.625,-143.013,10.000},
				{-73618.375,-117.505,10.000},
				{-73627.826,-94.506,10.000},
				{-73635.228,-74.018,10.000},
				{-73640.832,-56.039,10.000},
				{-73644.889,-40.568,10.000},
				{-73647.649,-27.606,10.000},
				{-73649.364,-17.152,10.000},
				{-73650.285,-9.206,10.000},
				{-73650.662,-3.768,10.000},
				{-73650.746,-0.838,10.000},
				{-73650.746,-0.000,10.000}
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