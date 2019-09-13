package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class RightSwitchCenter9 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (6.00,-5.50,0.00)
	
	public RightSwitchCenter9() {
		this(false);
	}
			
    public RightSwitchCenter9(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.598,11.951,10.000},
				{2.988,23.903,10.000},
				{8.366,53.785,10.000},
				{17.929,95.627,10.000},
				{32.873,149.439,10.000},
				{54.397,215.240,10.000},
				{83.703,293.056,10.000},
				{121.995,382.923,10.000},
				{170.484,484.891,10.000},
				{230.386,599.021,10.000},
				{302.925,725.391,10.000},
				{389.335,864.095,10.000},
				{490.859,1015.246,10.000},
				{608.757,1178.975,10.000},
				{744.300,1355.435,10.000},
				{898.176,1538.761,10.000},
				{1070.482,1723.052,10.000},
				{1261.323,1908.415,10.000},
				{1470.819,2094.955,10.000},
				{1699.096,2282.777,10.000},
				{1946.295,2471.984,10.000},
				{2212.562,2662.677,10.000},
				{2498.058,2854.958,10.000},
				{2802.951,3048.926,10.000},
				{3127.419,3244.682,10.000},
				{3471.651,3442.324,10.000},
				{3835.847,3641.955,10.000},
				{4220.215,3843.677,10.000},
				{4624.974,4047.594,10.000},
				{5050.355,4253.812,10.000},
				{5496.600,4462.443,10.000},
				{5963.960,4673.602,10.000},
				{6452.701,4887.409,10.000},
				{6963.100,5103.992,10.000},
				{7495.449,5323.487,10.000},
				{8050.052,5546.037,10.000},
				{8627.232,5771.796,10.000},
				{9227.325,6000.932,10.000},
				{9850.687,6233.623,10.000},
				{10497.694,6470.064,10.000},
				{11168.740,6710.467,10.000},
				{11864.247,6955.061,10.000},
				{12584.656,7204.096,10.000},
				{13330.441,7457.844,10.000},
				{14102.101,7716.603,10.000},
				{14900.171,7980.696,10.000},
				{15725.218,8250.476,10.000},
				{16577.851,8526.326,10.000},
				{17458.717,8808.663,10.000},
				{18368.511,9097.937,10.000},
				{19307.974,9394.635,10.000},
				{20277.903,9699.282,10.000},
				{21279.146,10012.439,10.000},
				{22312.617,10334.704,10.000},
				{23379.287,10666.706,10.000},
				{24480.198,11009.107,10.000},
				{25616.457,11362.586,10.000},
				{26789.240,11727.834,10.000},
				{27999.794,12105.535,10.000},
				{29249.428,12496.345,10.000},
				{30539.514,12900.860,10.000},
				{31871.472,13319.576,10.000},
				{33245.924,13744.523,10.000},
				{34662.615,14166.914,10.000},
				{36121.173,14585.571,10.000},
				{37621.060,14998.869,10.000},
				{39161.527,15404.671,10.000},
				{40741.553,15800.266,10.000},
				{42359.786,16182.333,10.000},
				{44014.480,16546.931,10.000},
				{45703.433,16889.531,10.000},
				{47423.943,17205.101,10.000},
				{49172.769,17488.262,10.000},
				{50946.119,17733.499,10.000},
				{52739.663,17935.438,10.000},
				{54548.579,18089.164,10.000},
				{56367.634,18190.547,10.000},
				{58192.271,18246.365,10.000},
				{60018.743,18264.723,10.000},
				{61843.252,18245.095,10.000},
				{63662.058,18188.061,10.000},
				{65471.585,18095.269,10.000},
				{67268.516,17969.312,10.000},
				{69049.872,17813.551,10.000},
				{70813.062,17631.899,10.000},
				{72555.920,17428.588,10.000},
				{74276.715,17207.947,10.000},
				{75974.136,16974.211,10.000},
				{77647.272,16731.362,10.000},
				{79295.574,16483.017,10.000},
				{80918.811,16232.365,10.000},
				{82517.023,15982.125,10.000},
				{84090.479,15734.555,10.000},
				{85639.625,15491.466,10.000},
				{87165.051,15254.261,10.000},
				{88667.449,15023.982,10.000},
				{90147.585,14801.357,10.000},
				{91606.270,14586.848,10.000},
				{93044.340,14380.699,10.000},
				{94462.637,14182.976,10.000},
				{95861.998,13993.606,10.000},
				{97243.239,13812.407,10.000},
				{98607.150,13639.113,10.000},
				{99954.490,13473.402,10.000},
				{101285.981,13314.907,10.000},
				{102602.305,13163.235,10.000},
				{103904.102,13017.977,10.000},
				{105191.974,12878.716,10.000},
				{106466.477,12745.033,10.000},
				{107728.129,12616.514,10.000},
				{108977.404,12492.753,10.000},
				{110214.739,12373.352,10.000},
				{111440.531,12257.924,10.000},
				{112655.141,12146.096,10.000},
				{113858.892,12037.505,10.000},
				{115052.072,11931.801,10.000},
				{116234.936,11828.642,10.000},
				{117407.706,11727.702,10.000},
				{118570.572,11628.658,10.000},
				{119723.692,11531.202,10.000},
				{120867.195,11435.027,10.000},
				{122001.178,11339.836,10.000},
				{123125.712,11245.336,10.000},
				{124240.835,11151.235,10.000},
				{125346.560,11057.245,10.000},
				{126442.868,10963.079,10.000},
				{127529.713,10868.447,10.000},
				{128607.018,10773.058,10.000},
				{129674.680,10676.618,10.000},
				{130732.563,10578.827,10.000},
				{131780.501,10479.380,10.000},
				{132818.297,10377.963,10.000},
				{133845.723,10274.254,10.000},
				{134862.515,10167.922,10.000},
				{135868.377,10058.625,10.000},
				{136862.978,9946.010,10.000},
				{137845.949,9829.710,10.000},
				{138816.884,9709.350,10.000},
				{139775.338,9584.539,10.000},
				{140720.826,9454.879,10.000},
				{141652.822,9319.960,10.000},
				{142570.759,9179.367,10.000},
				{143474.027,9032.681,10.000},
				{144361.976,8879.487,10.000},
				{145233.913,8719.377,10.000},
				{146089.110,8551.962,10.000},
				{146926.798,8376.886,10.000},
				{147746.182,8193.836,10.000},
				{148546.438,8002.563,10.000},
				{149326.729,7802.907,10.000},
				{150086.211,7594.824,10.000},
				{150824.053,7378.415,10.000},
				{151539.450,7153.970,10.000},
				{152231.650,6922.008,10.000},
				{152899.983,6683.322,10.000},
				{153543.886,6439.032,10.000},
				{154162.949,6190.630,10.000},
				{154756.951,5940.026,10.000},
				{155325.909,5689.580,10.000},
				{155870.121,5442.121,10.000},
				{156390.215,5200.939,10.000},
				{156887.189,4969.741,10.000},
				{157362.448,4752.582,10.000},
				{157817.821,4553.733,10.000},
				{158255.573,4377.521,10.000},
				{158678.386,4228.129,10.000},
				{159089.323,4109.365,10.000},
				{159491.766,4024.438,10.000},
				{159889.341,3975.742,10.000},
				{160285.810,3964.690,10.000},
				{160684.971,3991.615,10.000},
				{161090.495,4055.243,10.000},
				{161505.638,4151.429,10.000},
				{161933.159,4275.210,10.000},
				{162375.384,4422.251,10.000},
				{162834.135,4587.502,10.000},
				{163310.687,4765.529,10.000},
				{163805.770,4950.827,10.000},
				{164319.578,5138.076,10.000},
				{164851.813,5322.349,10.000},
				{165401.737,5499.241,10.000},
				{165968.232,5664.951,10.000},
				{166549.862,5816.298,10.000},
				{167144.932,5950.705,10.000},
				{167751.548,6066.156,10.000},
				{168367.661,6161.133,10.000},
				{168991.204,6235.428,10.000},
				{169620.444,6292.400,10.000},
				{170253.970,6335.266,10.000},
				{170890.425,6364.551,10.000},
				{171528.512,6380.867,10.000},
				{172167.000,6384.880,10.000},
				{172804.728,6377.276,10.000},
				{173440.602,6358.746,10.000},
				{174073.599,6329.967,10.000},
				{174702.758,6291.593,10.000},
				{175327.183,6244.248,10.000},
				{175946.035,6188.521,10.000},
				{176558.532,6124.965,10.000},
				{177163.941,6054.097,10.000},
				{177761.581,5976.395,10.000},
				{178350.811,5892.303,10.000},
				{178931.034,5802.229,10.000},
				{179501.689,5706.550,10.000},
				{180062.250,5605.612,10.000},
				{180612.224,5499.732,10.000},
				{181151.144,5389.201,10.000},
				{181678.573,5274.288,10.000},
				{182194.096,5155.236,10.000},
				{182697.323,5032.272,10.000},
				{183187.884,4905.603,10.000},
				{183665.426,4775.420,10.000},
				{184129.616,4641.899,10.000},
				{184580.136,4505.204,10.000},
				{185016.685,4365.487,10.000},
				{185438.974,4222.891,10.000},
				{185846.728,4077.547,10.000},
				{186239.687,3929.583,10.000},
				{186617.598,3779.117,10.000},
				{186980.225,3626.264,10.000},
				{187327.338,3471.134,10.000},
				{187658.721,3313.832,10.000},
				{187974.168,3154.464,10.000},
				{188273.481,2993.129,10.000},
				{188556.474,2829.931,10.000},
				{188822.971,2664.967,10.000},
				{189072.804,2498.339,10.000},
				{189305.819,2330.146,10.000},
				{189521.868,2160.490,10.000},
				{189720.815,1989.472,10.000},
				{189902.535,1817.195,10.000},
				{190066.911,1643.765,10.000},
				{190213.840,1469.287,10.000},
				{190343.361,1295.212,10.000},
				{190456.121,1127.598,10.000},
				{190553.240,971.191,10.000},
				{190635.854,826.139,10.000},
				{190705.111,692.571,10.000},
				{190762.170,570.593,10.000},
				{190808.200,460.297,10.000},
				{190844.375,361.756,10.000},
				{190871.878,275.029,10.000},
				{190891.895,200.163,10.000},
				{190905.614,137.192,10.000},
				{190914.228,86.139,10.000},
				{190918.930,47.021,10.000},
				{190920.915,19.848,10.000},
				{190921.377,4.624,10.000},
				{190921.377,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.598,11.951,10.000},
				{2.988,23.902,10.000},
				{8.366,53.778,10.000},
				{17.925,95.597,10.000},
				{32.860,149.347,10.000},
				{54.361,215.013,10.000},
				{83.618,292.566,10.000},
				{121.815,381.971,10.000},
				{170.133,483.179,10.000},
				{229.746,596.127,10.000},
				{301.819,720.738,10.000},
				{387.511,856.917,10.000},
				{487.966,1004.554,10.000},
				{604.318,1163.515,10.000},
				{737.683,1333.647,10.000},
				{888.569,1508.865,10.000},
				{1056.881,1683.118,10.000},
				{1242.511,1856.300,10.000},
				{1445.341,2028.304,10.000},
				{1665.244,2199.026,10.000},
				{1902.080,2368.364,10.000},
				{2155.702,2536.214,10.000},
				{2425.950,2702.478,10.000},
				{2712.655,2867.054,10.000},
				{3015.639,3029.843,10.000},
				{3334.714,3190.744,10.000},
				{3669.679,3349.657,10.000},
				{4020.327,3506.480,10.000},
				{4386.438,3661.108,10.000},
				{4767.781,3813.433,10.000},
				{5164.116,3963.347,10.000},
				{5575.189,4110.732,10.000},
				{6000.736,4255.469,10.000},
				{6440.479,4397.429,10.000},
				{6894.127,4536.479,10.000},
				{7361.374,4672.473,10.000},
				{7841.900,4805.257,10.000},
				{8335.366,4934.665,10.000},
				{8841.418,5060.517,10.000},
				{9359.680,5182.619,10.000},
				{9889.756,5300.759,10.000},
				{10431.227,5414.708,10.000},
				{10983.648,5524.216,10.000},
				{11546.549,5629.010,10.000},
				{12119.429,5728.793,10.000},
				{12701.753,5823.241,10.000},
				{13292.953,5912.002,10.000},
				{13892.422,5994.692,10.000},
				{14499.512,6070.895,10.000},
				{15113.528,6140.160,10.000},
				{15733.728,6201.999,10.000},
				{16359.317,6255.889,10.000},
				{16989.443,6301.267,10.000},
				{17623.197,6337.536,10.000},
				{18259.603,6364.065,10.000},
				{18897.623,6380.195,10.000},
				{19536.147,6385.243,10.000},
				{20173.999,6378.519,10.000},
				{20809.933,6359.338,10.000},
				{21442.637,6327.045,10.000},
				{22070.742,6281.043,10.000},
				{22692.825,6220.835,10.000},
				{23307.069,6142.439,10.000},
				{23911.338,6042.690,10.000},
				{24503.615,5922.768,10.000},
				{25082.044,5784.296,10.000},
				{25644.986,5629.413,10.000},
				{26191.069,5460.829,10.000},
				{26719.255,5281.866,10.000},
				{27228.902,5096.466,10.000},
				{27719.818,4909.162,10.000},
				{28192.316,4724.984,10.000},
				{28647.248,4549.317,10.000},
				{29086.016,4387.676,10.000},
				{29510.560,4245.439,10.000},
				{29923.312,4127.523,10.000},
				{30327.118,4038.060,10.000},
				{30725.340,3982.225,10.000},
				{31121.727,3963.861,10.000},
				{31520.076,3983.496,10.000},
				{31924.131,4040.548,10.000},
				{32337.468,4133.369,10.000},
				{32763.404,4259.366,10.000},
				{33204.922,4415.175,10.000},
				{33664.610,4596.881,10.000},
				{34144.635,4800.251,10.000},
				{34646.731,5020.954,10.000},
				{35172.206,5254.754,10.000},
				{35721.973,5497.667,10.000},
				{36296.580,5746.073,10.000},
				{36896.258,5996.785,10.000},
				{37520.967,6247.081,10.000},
				{38170.437,6494.705,10.000},
				{38844.221,6737.844,10.000},
				{39541.731,6975.094,10.000},
				{40262.272,7205.415,10.000},
				{41005.080,7428.079,10.000},
				{41769.342,7642.622,10.000},
				{42554.223,7848.803,10.000},
				{43358.878,8046.554,10.000},
				{44182.473,8235.950,10.000},
				{45024.190,8417.172,10.000},
				{45883.239,8590.486,10.000},
				{46758.861,8756.216,10.000},
				{47650.333,8914.727,10.000},
				{48556.975,9066.413,10.000},
				{49478.143,9211.684,10.000},
				{50413.239,9350.957,10.000},
				{51361.704,9484.651,10.000},
				{52323.022,9613.179,10.000},
				{53296.716,9736.948,10.000},
				{54282.352,9856.356,10.000},
				{55279.531,9971.790,10.000},
				{56287.893,10083.623,10.000},
				{57307.115,10192.219,10.000},
				{58336.908,10297.928,10.000},
				{59377.017,10401.090,10.000},
				{60427.221,10502.034,10.000},
				{61487.329,10601.079,10.000},
				{62557.182,10698.538,10.000},
				{63636.654,10794.714,10.000},
				{64725.644,10889.906,10.000},
				{65824.085,10984.408,10.000},
				{66931.936,11078.509,10.000},
				{68049.186,11172.498,10.000},
				{69175.852,11266.664,10.000},
				{70311.982,11361.296,10.000},
				{71457.650,11456.683,10.000},
				{72612.962,11553.121,10.000},
				{73778.053,11650.910,10.000},
				{74953.089,11750.355,10.000},
				{76138.266,11851.769,10.000},
				{77333.813,11955.474,10.000},
				{78539.993,12061.801,10.000},
				{79757.103,12171.093,10.000},
				{80985.473,12283.703,10.000},
				{82225.473,12399.996,10.000},
				{83477.507,12520.349,10.000},
				{84742.023,12645.152,10.000},
				{86019.503,12774.802,10.000},
				{87310.474,12909.711,10.000},
				{88615.503,13050.292,10.000},
				{89935.200,13196.964,10.000},
				{91270.214,13350.144,10.000},
				{92621.238,13510.237,10.000},
				{93989.001,13677.632,10.000},
				{95374.270,13852.688,10.000},
				{96777.841,14035.715,10.000},
				{98200.537,14226.961,10.000},
				{99643.196,14426.588,10.000},
				{101106.660,14634.639,10.000},
				{102591.761,14851.012,10.000},
				{104099.303,15075.418,10.000},
				{105630.037,15307.337,10.000},
				{107184.634,15545.976,10.000},
				{108763.656,15790.216,10.000},
				{110367.512,16038.564,10.000},
				{111996.423,16289.111,10.000},
				{113650.373,16539.496,10.000},
				{115329.062,16786.893,10.000},
				{117031.864,17028.012,10.000},
				{118757.778,17259.146,10.000},
				{120505.403,17476.244,10.000},
				{122272.906,17675.035,10.000},
				{124058.025,17851.193,10.000},
				{125858.079,18000.539,10.000},
				{127670.006,18119.265,10.000},
				{129490.422,18204.165,10.000},
				{131315.707,18252.846,10.000},
				{133142.096,18263.894,10.000},
				{134965.794,18236.978,10.000},
				{136782.861,18170.668,10.000},
				{138588.577,18057.158,10.000},
				{140377.793,17892.163,10.000},
				{142145.795,17680.016,10.000},
				{143888.371,17425.765,10.000},
				{145601.855,17134.838,10.000},
				{147283.129,16812.741,10.000},
				{148929.608,16464.791,10.000},
				{150539.199,16095.913,10.000},
				{152110.250,15710.509,10.000},
				{153641.488,15312.381,10.000},
				{155131.959,14904.708,10.000},
				{156580.966,14490.067,10.000},
				{157988.013,14070.474,10.000},
				{159352.758,13647.447,10.000},
				{160675.148,13223.896,10.000},
				{161955.989,12808.416,10.000},
				{163196.693,12407.036,10.000},
				{164398.616,12019.234,10.000},
				{165563.056,11644.395,10.000},
				{166691.242,11281.858,10.000},
				{167784.335,10930.934,10.000},
				{168843.428,10590.933,10.000},
				{169869.546,10261.180,10.000},
				{170863.648,9941.020,10.000},
				{171826.631,9629.830,10.000},
				{172759.333,9327.021,10.000},
				{173662.537,9032.038,10.000},
				{174536.974,8744.367,10.000},
				{175383.327,8463.529,10.000},
				{176202.235,8189.081,10.000},
				{176994.296,7920.614,10.000},
				{177760.072,7657.751,10.000},
				{178500.086,7400.148,10.000},
				{179214.835,7147.485,10.000},
				{179904.782,6899.473,10.000},
				{180570.367,6655.844,10.000},
				{181212.002,6416.353,10.000},
				{181830.079,6180.773,10.000},
				{182424.969,5948.899,10.000},
				{182997.023,5720.538,10.000},
				{183546.574,5495.515,10.000},
				{184073.941,5273.666,10.000},
				{184579.425,5054.839,10.000},
				{185063.314,4838.892,10.000},
				{185525.883,4625.691,10.000},
				{185967.395,4415.112,10.000},
				{186388.098,4207.033,10.000},
				{186788.232,4001.342,10.000},
				{187168.025,3797.928,10.000},
				{187527.693,3596.686,10.000},
				{187867.445,3397.510,10.000},
				{188187.475,3200.300,10.000},
				{188487.970,3004.955,10.000},
				{188769.107,2811.374,10.000},
				{189031.053,2619.458,10.000},
				{189273.964,2429.106,10.000},
				{189497.986,2240.219,10.000},
				{189703.255,2052.692,10.000},
				{189889.897,1866.424,10.000},
				{190058.028,1681.310,10.000},
				{190207.753,1497.244,10.000},
				{190339.301,1315.478,10.000},
				{190453.491,1141.906,10.000},
				{190551.594,981.030,10.000},
				{190634.864,832.700,10.000},
				{190704.543,696.791,10.000},
				{190761.863,573.194,10.000},
				{190808.045,461.819,10.000},
				{190844.304,362.591,10.000},
				{190871.849,275.452,10.000},
				{190891.884,200.355,10.000},
				{190905.611,137.267,10.000},
				{190914.227,86.163,10.000},
				{190918.930,47.026,10.000},
				{190920.915,19.849,10.000},
				{190921.377,4.624,10.000},
				{190921.377,0.000,10.000}
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