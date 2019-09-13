package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class LeftScaleM3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.00,1.00,-20.00)
	
	public LeftScaleM3() {
		this(false);
	}
			
    public LeftScaleM3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.600,11.999,10.000},
				{2.999,23.993,10.000},
				{8.395,53.958,10.000},
				{17.979,95.835,10.000},
				{32.930,149.514,10.000},
				{54.411,214.810,10.000},
				{83.556,291.452,10.000},
				{121.463,379.066,10.000},
				{169.178,477.155,10.000},
				{227.687,585.093,10.000},
				{297.898,702.102,10.000},
				{380.623,827.253,10.000},
				{476.568,959.447,10.000},
				{586.309,1097.416,10.000},
				{710.281,1239.717,10.000},
				{848.218,1379.372,10.000},
				{999.200,1509.819,10.000},
				{1162.219,1630.194,10.000},
				{1336.189,1739.692,10.000},
				{1519.945,1837.568,10.000},
				{1712.259,1923.137,10.000},
				{1911.836,1995.773,10.000},
				{2117.328,2054.912,10.000},
				{2327.333,2100.052,10.000},
				{2540.409,2130.758,10.000},
				{2755.076,2146.669,10.000},
				{2969.827,2147.512,10.000},
				{3183.138,2133.114,10.000},
				{3393.481,2103.432,10.000},
				{3599.339,2058.581,10.000},
				{3799.227,1998.880,10.000},
				{3991.717,1924.895,10.000},
				{4175.468,1837.510,10.000},
				{4349.267,1737.993,10.000},
				{4512.075,1628.074,10.000},
				{4663.077,1510.027,10.000},
				{4801.752,1386.751,10.000},
				{4927.935,1261.829,10.000},
				{5041.892,1139.569,10.000},
				{5144.393,1025.004,10.000},
				{5236.776,923.833,10.000},
				{5321.005,842.289,10.000},
				{5399.698,786.936,10.000},
				{5476.137,764.386,10.000},
				{5554.232,780.947,10.000},
				{5638.456,842.247,10.000},
				{5733.742,952.859,10.000},
				{5845.341,1115.989,10.000},
				{5978.667,1333.261,10.000},
				{6139.132,1604.644,10.000},
				{6331.984,1928.524,10.000},
				{6562.177,2301.924,10.000},
				{6834.259,2720.824,10.000},
				{7152.314,3180.547,10.000},
				{7519.930,3676.165,10.000},
				{7939.913,4199.826,10.000},
				{8414.167,4742.543,10.000},
				{8943.978,5298.106,10.000},
				{9530.098,5861.207,10.000},
				{10172.857,6427.586,10.000},
				{10872.265,6994.076,10.000},
				{11628.122,7558.574,10.000},
				{12440.118,8119.964,10.000},
				{13307.919,8678.002,10.000},
				{14231.239,9233.200,10.000},
				{15209.907,9786.684,10.000},
				{16243.912,10340.053,10.000},
				{17333.435,10895.225,10.000},
				{18478.861,11454.264,10.000},
				{19680.352,12014.905,10.000},
				{20938.153,12578.015,10.000},
				{22252.995,13148.420,10.000},
				{23625.597,13726.017,10.000},
				{25056.514,14309.175,10.000},
				{26545.933,14894.187,10.000},
				{28093.401,15474.676,10.000},
				{29697.505,16041.040,10.000},
				{31355.510,16580.059,10.000},
				{33062.996,17074.854,10.000},
				{34813.535,17505.389,10.000},
				{36598.505,17849.697,10.000},
				{38407.092,18085.871,10.000},
				{40226.554,18194.626,10.000},
				{42042.755,18162.006,10.000},
				{43841.648,17988.934,10.000},
				{45610.703,17690.546,10.000},
				{47338.936,17282.331,10.000},
				{49016.920,16779.838,10.000},
				{50637.121,16202.011,10.000},
				{52194.020,15568.991,10.000},
				{53684.041,14900.213,10.000},
				{55105.343,14213.020,10.000},
				{56457.532,13521.888,10.000},
				{57741.350,12838.178,10.000},
				{58958.377,12170.270,10.000},
				{60110.769,11523.925,10.000},
				{61201.044,10902.748,10.000},
				{62231.910,10308.661,10.000},
				{63206.144,9742.335,10.000},
				{64126.499,9203.550,10.000},
				{64995.647,8691.488,10.000},
				{65816.143,8204.955,10.000},
				{66590.398,7742.549,10.000},
				{67320.675,7302.772,10.000},
				{68009.087,6884.117,10.000},
				{68657.598,6485.115,10.000},
				{69268.036,6104.376,10.000},
				{69842.096,5740.601,10.000},
				{70381.355,5392.591,10.000},
				{70887.280,5059.251,10.000},
				{71361.239,4739.583,10.000},
				{71804.506,4432.679,10.000},
				{72218.278,4137.715,10.000},
				{72603.672,3853.938,10.000},
				{72961.737,3580.655,10.000},
				{73293.460,3317.227,10.000},
				{73599.765,3063.052,10.000},
				{73881.521,2817.563,10.000},
				{74139.543,2580.211,10.000},
				{74374.589,2350.464,10.000},
				{74587.368,2127.794,10.000},
				{74778.536,1911.674,10.000},
				{74948.693,1701.569,10.000},
				{75098.386,1496.936,10.000},
				{75228.464,1300.776,10.000},
				{75340.323,1118.596,10.000},
				{75435.546,952.226,10.000},
				{75515.636,800.903,10.000},
				{75582.033,663.969,10.000},
				{75636.120,540.864,10.000},
				{75679.232,431.120,10.000},
				{75712.667,334.355,10.000},
				{75737.694,250.264,10.000},
				{75755.555,178.615,10.000},
				{75767.478,119.233,10.000},
				{75774.678,71.999,10.000},
				{75778.362,36.835,10.000},
				{75779.731,13.697,10.000},
				{75779.988,2.566,10.000},
				{75779.988,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.600,11.999,10.000},
				{3.000,24.004,10.000},
				{8.404,54.034,10.000},
				{18.019,96.151,10.000},
				{33.065,150.464,10.000},
				{54.781,217.159,10.000},
				{84.432,296.505,10.000},
				{123.320,388.879,10.000},
				{172.797,494.774,10.000},
				{234.279,614.820,10.000},
				{309.258,749.792,10.000},
				{399.320,900.622,10.000},
				{506.161,1068.406,10.000},
				{631.602,1254.413,10.000},
				{777.611,1460.087,10.000},
				{945.652,1680.406,10.000},
				{1136.645,1909.933,10.000},
				{1351.598,2149.532,10.000},
				{1591.599,2400.007,10.000},
				{1857.809,2662.105,10.000},
				{2151.460,2936.509,10.000},
				{2473.845,3223.846,10.000},
				{2826.313,3524.680,10.000},
				{3210.264,3839.512,10.000},
				{3627.142,4168.778,10.000},
				{4078.426,4512.838,10.000},
				{4565.622,4871.966,10.000},
				{5090.256,5246.333,10.000},
				{5653.854,5635.982,10.000},
				{6257.934,6040.798,10.000},
				{6903.980,6460.464,10.000},
				{7593.421,6894.410,10.000},
				{8327.596,7341.753,10.000},
				{9107.719,7801.225,10.000},
				{9934.829,8271.097,10.000},
				{10809.738,8749.091,10.000},
				{11732.969,9232.312,10.000},
				{12704.686,9717.175,10.000},
				{13724.623,10199.371,10.000},
				{14792.010,10673.869,10.000},
				{15905.507,11134.972,10.000},
				{17063.152,11576.445,10.000},
				{18262.325,11991.727,10.000},
				{19499.746,12374.209,10.000},
				{20771.504,12717.583,10.000},
				{22073.126,13016.224,10.000},
				{23399.682,13265.559,10.000},
				{24745.921,13462.386,10.000},
				{26106.429,13605.081,10.000},
				{27475.796,13693.676,10.000},
				{28848.775,13729.784,10.000},
				{30220.413,13716.382,10.000},
				{31586.162,13657.489,10.000},
				{32941.940,13557.779,10.000},
				{34284.158,13422.180,10.000},
				{35608.812,13246.544,10.000},
				{36911.598,13027.856,10.000},
				{38188.830,12772.326,10.000},
				{39437.356,12485.257,10.000},
				{40654.447,12170.909,10.000},
				{41837.691,11832.446,10.000},
				{42984.889,11471.971,10.000},
				{44093.948,11090.599,10.000},
				{45162.806,10688.573,10.000},
				{46189.344,10265.380,10.000},
				{47171.333,9819.893,10.000},
				{48106.384,9350.514,10.000},
				{48991.917,8855.321,10.000},
				{49825.142,8332.251,10.000},
				{50602.812,7776.700,10.000},
				{51321.592,7187.799,10.000},
				{51978.351,6567.590,10.000},
				{52569.968,5916.174,10.000},
				{53093.486,5235.181,10.000},
				{53546.318,4528.318,10.000},
				{53926.514,3801.965,10.000},
				{54233.087,3065.727,10.000},
				{54466.370,2332.827,10.000},
				{54628.385,1620.151,10.000},
				{54723.159,947.746,10.000},
				{54756.919,337.591,10.000},
				{54775.760,188.415,10.000},
				{54836.854,610.939,10.000},
				{54928.458,916.046,10.000},
				{55038.237,1097.784,10.000},
				{55154.167,1159.299,10.000},
				{55265.262,1110.954,10.000},
				{55362.093,968.311,10.000},
				{55437.125,750.319,10.000},
				{55484.838,477.133,10.000},
				{55501.658,168.192,10.000},
				{55517.574,159.162,10.000},
				{55566.617,490.436,10.000},
				{55648.045,814.274,10.000},
				{55760.275,1122.298,10.000},
				{55901.149,1408.745,10.000},
				{56068.150,1670.013,10.000},
				{56258.568,1904.179,10.000},
				{56469.626,2110.575,10.000},
				{56698.568,2289.422,10.000},
				{56942.722,2441.540,10.000},
				{57199.534,2568.122,10.000},
				{57466.592,2670.573,10.000},
				{57741.631,2750.391,10.000},
				{58022.539,2809.085,10.000},
				{58307.351,2848.122,10.000},
				{58594.241,2868.895,10.000},
				{58881.511,2872.702,10.000},
				{59167.585,2860.743,10.000},
				{59450.997,2834.112,10.000},
				{59730.377,2793.809,10.000},
				{60004.452,2740.741,10.000},
				{60272.025,2675.733,10.000},
				{60531.978,2599.537,10.000},
				{60783.263,2512.847,10.000},
				{61024.893,2416.302,10.000},
				{61255.944,2310.503,10.000},
				{61475.546,2196.019,10.000},
				{61682.885,2073.397,10.000},
				{61877.202,1943.170,10.000},
				{62057.789,1805.866,10.000},
				{62223.990,1662.013,10.000},
				{62375.205,1512.144,10.000},
				{62510.885,1356.803,10.000},
				{62630.871,1199.857,10.000},
				{62735.650,1047.798,10.000},
				{62826.043,903.928,10.000},
				{62902.944,769.008,10.000},
				{62967.314,643.698,10.000},
				{63020.170,528.558,10.000},
				{63062.575,424.054,10.000},
				{63095.632,330.570,10.000},
				{63120.473,248.409,10.000},
				{63138.254,177.806,10.000},
				{63150.147,118.934,10.000},
				{63157.338,71.911,10.000},
				{63161.020,36.817,10.000},
				{63162.389,13.695,10.000},
				{63162.646,2.566,10.000},
				{63162.646,0.000,10.000}
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