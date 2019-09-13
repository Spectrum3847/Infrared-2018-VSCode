package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class FiveFeetAndTurn extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (5.00,5.00,89.99)
	
	public FiveFeetAndTurn() {
		this(false);
	}
			
    public FiveFeetAndTurn(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.587,11.749,10.000},
				{2.937,23.499,10.000},
				{8.224,52.871,10.000},
				{17.624,93.991,10.000},
				{32.309,146.856,10.000},
				{53.455,211.461,10.000},
				{82.235,287.801,10.000},
				{119.822,375.866,10.000},
				{167.386,475.645,10.000},
				{226.099,587.124,10.000},
				{297.127,710.283,10.000},
				{381.637,845.100,10.000},
				{480.205,985.682,10.000},
				{592.819,1126.142,10.000},
				{719.465,1266.460,10.000},
				{860.128,1406.620,10.000},
				{1014.788,1546.606,10.000},
				{1183.428,1686.399,10.000},
				{1366.026,1825.983,10.000},
				{1562.560,1965.340,10.000},
				{1773.006,2104.455,10.000},
				{1997.337,2243.310,10.000},
				{2235.526,2381.888,10.000},
				{2487.543,2520.174,10.000},
				{2753.358,2658.149,10.000},
				{3032.938,2795.799,10.000},
				{3326.249,2933.107,10.000},
				{3633.254,3070.055,10.000},
				{3953.917,3206.629,10.000},
				{4288.198,3342.811,10.000},
				{4636.056,3478.584,10.000},
				{4997.450,3613.933,10.000},
				{5372.334,3748.841,10.000},
				{5760.663,3883.291,10.000},
				{6162.390,4017.265,10.000},
				{6577.464,4150.747,10.000},
				{7005.836,4283.720,10.000},
				{7447.453,4416.164,10.000},
				{7902.259,4548.062,10.000},
				{8370.198,4679.395,10.000},
				{8851.213,4810.145,10.000},
				{9345.242,4940.290,10.000},
				{9852.223,5069.811,10.000},
				{10371.522,5192.991,10.000},
				{10901.938,5304.158,10.000},
				{11442.275,5403.367,10.000},
				{11991.342,5490.676,10.000},
				{12547.957,5566.147,10.000},
				{13110.941,5629.846,10.000},
				{13679.125,5681.838,10.000},
				{14251.345,5722.195,10.000},
				{14826.444,5750.990,10.000},
				{15403.274,5768.297,10.000},
				{15980.693,5774.194,10.000},
				{16557.569,5768.758,10.000},
				{17133.333,5757.645,10.000},
				{17707.979,5746.454,10.000},
				{18281.497,5735.183,10.000},
				{18853.879,5723.825,10.000},
				{19425.117,5712.375,10.000},
				{19995.200,5700.830,10.000},
				{20564.118,5689.184,10.000},
				{21131.861,5677.432,10.000},
				{21698.418,5665.569,10.000},
				{22263.777,5653.590,10.000},
				{22827.926,5641.490,10.000},
				{23390.853,5629.265,10.000},
				{23952.544,5616.908,10.000},
				{24512.985,5604.414,10.000},
				{25072.163,5591.779,10.000},
				{25630.063,5578.996,10.000},
				{26186.669,5566.062,10.000},
				{26741.966,5552.969,10.000},
				{27295.937,5539.713,10.000},
				{27848.566,5526.288,10.000},
				{28399.835,5512.689,10.000},
				{28949.726,5498.909,10.000},
				{29498.220,5484.944,10.000},
				{30045.299,5470.786,10.000},
				{30590.942,5456.432,10.000},
				{31135.129,5441.873,10.000},
				{31677.840,5427.106,10.000},
				{32219.052,5412.123,10.000},
				{32758.744,5396.918,10.000},
				{33296.892,5381.486,10.000},
				{33833.475,5365.821,10.000},
				{34368.466,5349.916,10.000},
				{34901.843,5333.764,10.000},
				{35433.579,5317.361,10.000},
				{35963.649,5300.699,10.000},
				{36492.026,5283.773,10.000},
				{37018.683,5266.576,10.000},
				{37543.594,5249.102,10.000},
				{38066.728,5231.344,10.000},
				{38588.058,5213.298,10.000},
				{39107.553,5194.956,10.000},
				{39625.185,5176.312,10.000},
				{40140.921,5157.361,10.000},
				{40654.730,5138.098,10.000},
				{41166.582,5118.515,10.000},
				{41676.443,5098.608,10.000},
				{42184.280,5078.371,10.000},
				{42690.060,5057.800,10.000},
				{43193.749,5036.889,10.000},
				{43695.312,5015.633,10.000},
				{44194.715,4994.029,10.000},
				{44691.922,4972.072,10.000},
				{45186.898,4949.758,10.000},
				{45679.607,4927.085,10.000},
				{46170.012,4904.050,10.000},
				{46658.077,4880.650,10.000},
				{47143.765,4856.884,10.000},
				{47627.040,4832.750,10.000},
				{48107.865,4808.249,10.000},
				{48586.203,4783.380,10.000},
				{49062.017,4758.145,10.000},
				{49535.272,4732.545,10.000},
				{50005.930,4706.584,10.000},
				{50473.957,4680.266,10.000},
				{50939.316,4653.596,10.000},
				{51401.974,4626.580,10.000},
				{51861.897,4599.225,10.000},
				{52319.051,4571.540,10.000},
				{52773.404,4543.536,10.000},
				{53224.927,4515.224,10.000},
				{53673.588,4486.618,10.000},
				{54119.362,4457.732,10.000},
				{54562.220,4428.585,10.000},
				{55002.139,4399.193,10.000},
				{55439.097,4369.579,10.000},
				{55873.074,4339.765,10.000},
				{56304.052,4309.776,10.000},
				{56732.015,4279.639,10.000},
				{57156.954,4249.383,10.000},
				{57578.858,4219.041,10.000},
				{57997.722,4188.645,10.000},
				{58413.546,4158.234,10.000},
				{58826.330,4127.845,10.000},
				{59236.082,4097.521,10.000},
				{59642.813,4067.306,10.000},
				{60046.537,4037.244,10.000},
				{60447.276,4007.387,10.000},
				{60845.055,3977.784,10.000},
				{61239.903,3948.489,10.000},
				{61631.859,3919.557,10.000},
				{62020.964,3891.046,10.000},
				{62407.265,3863.016,10.000},
				{62790.818,3835.526,10.000},
				{63171.682,3808.640,10.000},
				{63549.924,3782.420,10.000},
				{63925.617,3756.932,10.000},
				{64298.841,3732.239,10.000},
				{64669.682,3708.407,10.000},
				{65038.232,3685.501,10.000},
				{65404.590,3663.585,10.000},
				{65768.862,3642.722,10.000},
				{66131.160,3622.976,10.000},
				{66491.600,3604.405,10.000},
				{66850.307,3587.068,10.000},
				{67207.409,3571.020,10.000},
				{67563.041,3556.315,10.000},
				{67917.341,3543.000,10.000},
				{68270.453,3531.121,10.000},
				{68622.525,3520.719,10.000},
				{68973.708,3511.830,10.000},
				{69324.156,3504.485,10.000},
				{69674.027,3498.711,10.000},
				{70023.480,3494.528,10.000},
				{70372.675,3491.951,10.000},
				{70721.774,3490.989,10.000},
				{71070.939,3491.647,10.000},
				{71420.331,3493.921,10.000},
				{71770.111,3497.803,10.000},
				{72120.439,3503.280,10.000},
				{72471.473,3510.332,10.000},
				{72823.366,3518.933,10.000},
				{73176.271,3529.054,10.000},
				{73530.337,3540.658,10.000},
				{73885.708,3553.706,10.000},
				{74242.523,3568.154,10.000},
				{74600.918,3583.953,10.000},
				{74961.024,3601.052,10.000},
				{75322.963,3619.396,10.000},
				{75686.856,3638.926,10.000},
				{76052.814,3659.584,10.000},
				{76420.945,3681.307,10.000},
				{76791.348,3704.032,10.000},
				{77164.118,3727.695,10.000},
				{77539.341,3752.230,10.000},
				{77917.098,3777.574,10.000},
				{78297.464,3803.662,10.000},
				{78680.507,3830.427,10.000},
				{79066.288,3857.808,10.000},
				{79454.862,3885.742,10.000},
				{79846.279,3914.167,10.000},
				{80240.581,3943.024,10.000},
				{80637.807,3972.255,10.000},
				{81037.987,4001.804,10.000},
				{81441.149,4031.618,10.000},
				{81847.313,4061.644,10.000},
				{82256.497,4091.835,10.000},
				{82668.711,4122.142,10.000},
				{83083.963,4152.521,10.000},
				{83502.256,4182.931,10.000},
				{83923.589,4213.332,10.000},
				{84347.958,4243.687,10.000},
				{84775.354,4273.961,10.000},
				{85205.766,4304.122,10.000},
				{85639.180,4334.141,10.000},
				{86075.579,4363.990,10.000},
				{86514.944,4393.643,10.000},
				{86957.251,4423.077,10.000},
				{87402.479,4452.272,10.000},
				{87850.599,4481.207,10.000},
				{88301.586,4509.867,10.000},
				{88755.409,4538.234,10.000},
				{89212.039,4566.297,10.000},
				{89671.443,4594.042,10.000},
				{90133.589,4621.459,10.000},
				{90598.443,4648.539,10.000},
				{91065.970,4675.274,10.000},
				{91536.136,4701.658,10.000},
				{92008.905,4727.686,10.000},
				{92484.240,4753.353,10.000},
				{92962.106,4778.656,10.000},
				{93442.465,4803.593,10.000},
				{93925.281,4828.162,10.000},
				{94410.518,4852.364,10.000},
				{94898.137,4876.199,10.000},
				{95388.104,4899.667,10.000},
				{95880.381,4922.769,10.000},
				{96374.932,4945.509,10.000},
				{96871.721,4967.889,10.000},
				{97370.712,4989.912,10.000},
				{97871.870,5011.581,10.000},
				{98375.160,5032.901,10.000},
				{98880.548,5053.875,10.000},
				{99387.999,5074.509,10.000},
				{99897.479,5094.807,10.000},
				{100408.957,5114.774,10.000},
				{100922.398,5134.416,10.000},
				{101437.772,5153.738,10.000},
				{101955.047,5172.745,10.000},
				{102474.191,5191.445,10.000},
				{102995.175,5209.841,10.000},
				{103517.969,5227.941,10.000},
				{104042.544,5245.751,10.000},
				{104568.872,5263.276,10.000},
				{105096.924,5280.523,10.000},
				{105626.674,5297.498,10.000},
				{106158.095,5314.207,10.000},
				{106691.161,5330.657,10.000},
				{107225.846,5346.853,10.000},
				{107762.126,5362.802,10.000},
				{108299.977,5378.510,10.000},
				{108839.376,5393.983,10.000},
				{109380.298,5409.228,10.000},
				{109922.723,5424.250,10.000},
				{110466.629,5439.055,10.000},
				{111011.994,5453.650,10.000},
				{111558.798,5468.040,10.000},
				{112107.021,5482.231,10.000},
				{112656.644,5496.229,10.000},
				{113207.648,5510.041,10.000},
				{113760.015,5523.671,10.000},
				{114313.727,5537.125,10.000},
				{114868.768,5550.409,10.000},
				{115425.121,5563.529,10.000},
				{115982.770,5576.490,10.000},
				{116541.700,5589.297,10.000},
				{117101.896,5601.956,10.000},
				{117663.343,5614.473,10.000},
				{118226.028,5626.851,10.000},
				{118789.938,5639.098,10.000},
				{119355.060,5651.217,10.000},
				{119921.381,5663.214,10.000},
				{120488.890,5675.094,10.000},
				{121057.577,5686.862,10.000},
				{121627.429,5698.524,10.000},
				{122198.437,5710.083,10.000},
				{122770.592,5721.545,10.000},
				{123343.883,5732.915,10.000},
				{123918.303,5744.198,10.000},
				{124493.843,5755.398,10.000},
				{125070.495,5766.520,10.000},
				{125647.817,5773.224,10.000},
				{126224.804,5769.869,10.000},
				{126800.316,5755.120,10.000},
				{127373.206,5728.900,10.000},
				{127942.319,5691.134,10.000},
				{128506.494,5641.748,10.000},
				{129064.562,5580.673,10.000},
				{129615.346,5507.839,10.000},
				{130157.664,5423.182,10.000},
				{130690.328,5326.639,10.000},
				{131212.143,5218.151,10.000},
				{131721.909,5097.662,10.000},
				{132218.865,4969.556,10.000},
				{132702.819,4839.540,10.000},
				{133173.710,4708.916,10.000},
				{133631.481,4577.705,10.000},
				{134076.073,4445.924,10.000},
				{134507.432,4313.594,10.000},
				{134925.506,4180.732,10.000},
				{135330.241,4047.356,10.000},
				{135721.590,3913.485,10.000},
				{136099.503,3779.135,10.000},
				{136463.936,3644.323,10.000},
				{136814.842,3509.067,10.000},
				{137152.181,3373.383,10.000},
				{137475.909,3237.287,10.000},
				{137785.989,3100.796,10.000},
				{138082.382,2963.927,10.000},
				{138365.051,2826.696,10.000},
				{138633.963,2689.119,10.000},
				{138889.084,2551.212,10.000},
				{139130.383,2412.992,10.000},
				{139357.831,2274.477,10.000},
				{139571.399,2135.681,10.000},
				{139771.061,1996.622,10.000},
				{139956.793,1857.316,10.000},
				{140128.571,1717.780,10.000},
				{140286.374,1578.032,10.000},
				{140430.183,1438.088,10.000},
				{140559.979,1297.965,10.000},
				{140675.747,1157.680,10.000},
				{140777.473,1017.251,10.000},
				{140865.142,876.695,10.000},
				{140939.200,740.581,10.000},
				{141000.680,614.801,10.000},
				{141050.750,500.696,10.000},
				{141090.579,398.287,10.000},
				{141121.338,307.590,10.000},
				{141144.199,228.615,10.000},
				{141160.336,161.372,10.000},
				{141170.923,105.869,10.000},
				{141177.134,62.110,10.000},
				{141180.144,30.098,10.000},
				{141181.128,9.835,10.000},
				{141181.260,1.320,10.000},
				{141181.260,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.587,11.749,10.000},
				{2.937,23.499,10.000},
				{8.225,52.873,10.000},
				{17.624,93.998,10.000},
				{32.312,146.878,10.000},
				{53.464,211.515,10.000},
				{82.255,287.917,10.000},
				{119.865,376.092,10.000},
				{167.470,476.051,10.000},
				{226.251,587.810,10.000},
				{297.389,711.387,10.000},
				{382.070,846.804,10.000},
				{480.890,988.206,10.000},
				{593.863,1129.731,10.000},
				{721.003,1271.397,10.000},
				{862.325,1413.220,10.000},
				{1017.847,1555.219,10.000},
				{1187.588,1697.410,10.000},
				{1371.569,1839.810,10.000},
				{1569.813,1982.436,10.000},
				{1782.343,2125.306,10.000},
				{2009.187,2268.435,10.000},
				{2250.371,2411.841,10.000},
				{2505.925,2555.540,10.000},
				{2775.880,2699.548,10.000},
				{3060.268,2843.882,10.000},
				{3359.124,2988.559,10.000},
				{3672.483,3133.594,10.000},
				{4000.384,3279.005,10.000},
				{4342.864,3424.807,10.000},
				{4699.966,3571.017,10.000},
				{5071.731,3717.652,10.000},
				{5458.204,3864.729,10.000},
				{5859.430,4012.263,10.000},
				{6275.458,4160.273,10.000},
				{6706.335,4308.775,10.000},
				{7152.114,4457.786,10.000},
				{7612.846,4607.326,10.000},
				{8088.588,4757.412,10.000},
				{8579.394,4908.063,10.000},
				{9085.324,5059.297,10.000},
				{9606.437,5211.136,10.000},
				{10142.797,5363.599,10.000},
				{10693.862,5510.654,10.000},
				{11258.485,5646.223,10.000},
				{11835.510,5770.251,10.000},
				{12423.778,5882.681,10.000},
				{13022.123,5983.449,10.000},
				{13629.372,6072.493,10.000},
				{14244.346,6149.743,10.000},
				{14865.859,6215.129,10.000},
				{15492.717,6268.580,10.000},
				{16123.719,6310.019,10.000},
				{16757.656,6339.371,10.000},
				{17393.312,6356.556,10.000},
				{18030.079,6367.669,10.000},
				{18667.965,6378.859,10.000},
				{19306.978,6390.131,10.000},
				{19947.127,6401.489,10.000},
				{20588.421,6412.938,10.000},
				{21230.869,6424.483,10.000},
				{21874.482,6436.129,10.000},
				{22519.270,6447.881,10.000},
				{23165.244,6459.744,10.000},
				{23812.417,6471.723,10.000},
				{24460.799,6483.822,10.000},
				{25110.404,6496.048,10.000},
				{25761.244,6508.405,10.000},
				{26413.334,6520.898,10.000},
				{27066.687,6533.533,10.000},
				{27721.319,6546.315,10.000},
				{28377.244,6559.250,10.000},
				{29034.478,6572.343,10.000},
				{29693.038,6585.598,10.000},
				{30352.940,6599.023,10.000},
				{31014.202,6612.622,10.000},
				{31676.842,6626.402,10.000},
				{32340.879,6640.367,10.000},
				{33006.332,6654.524,10.000},
				{33673.219,6668.879,10.000},
				{34341.563,6683.437,10.000},
				{35011.384,6698.204,10.000},
				{35682.702,6713.187,10.000},
				{36355.541,6728.391,10.000},
				{37029.924,6743.823,10.000},
				{37705.872,6759.488,10.000},
				{38383.412,6775.393,10.000},
				{39062.566,6791.544,10.000},
				{39743.361,6807.947,10.000},
				{40425.822,6824.608,10.000},
				{41109.975,6841.534,10.000},
				{41795.848,6858.731,10.000},
				{42483.469,6876.205,10.000},
				{43172.865,6893.962,10.000},
				{43864.066,6912.008,10.000},
				{44557.101,6930.350,10.000},
				{45252.000,6948.993,10.000},
				{45948.794,6967.943,10.000},
				{46647.515,6987.207,10.000},
				{47348.194,7006.789,10.000},
				{48050.863,7026.695,10.000},
				{48755.557,7046.932,10.000},
				{49462.307,7067.502,10.000},
				{50171.148,7088.413,10.000},
				{50882.115,7109.668,10.000},
				{51595.242,7131.272,10.000},
				{52310.565,7153.228,10.000},
				{53028.119,7175.541,10.000},
				{53747.940,7198.213,10.000},
				{54470.065,7221.248,10.000},
				{55194.530,7244.648,10.000},
				{55921.371,7268.413,10.000},
				{56650.626,7292.546,10.000},
				{57382.331,7317.047,10.000},
				{58116.522,7341.915,10.000},
				{58853.237,7367.149,10.000},
				{59592.512,7392.748,10.000},
				{60334.383,7418.708,10.000},
				{61078.885,7445.025,10.000},
				{61826.054,7471.694,10.000},
				{62575.925,7498.710,10.000},
				{63328.532,7526.064,10.000},
				{64083.907,7553.748,10.000},
				{64842.082,7581.751,10.000},
				{65603.088,7610.061,10.000},
				{66366.954,7638.666,10.000},
				{67133.709,7667.551,10.000},
				{67903.379,7696.697,10.000},
				{68675.988,7726.087,10.000},
				{69451.558,7755.700,10.000},
				{70230.109,7785.513,10.000},
				{71011.659,7815.501,10.000},
				{71796.223,7845.637,10.000},
				{72583.812,7875.891,10.000},
				{73374.435,7906.232,10.000},
				{74168.098,7936.626,10.000},
				{74964.801,7967.036,10.000},
				{75764.544,7997.423,10.000},
				{76567.318,8027.746,10.000},
				{77373.114,8057.960,10.000},
				{78181.916,8088.020,10.000},
				{78993.704,8117.876,10.000},
				{79808.452,8147.477,10.000},
				{80626.129,8176.771,10.000},
				{81446.699,8205.701,10.000},
				{82270.120,8234.210,10.000},
				{83096.344,8262.239,10.000},
				{83925.316,8289.728,10.000},
				{84756.978,8316.612,10.000},
				{85591.261,8342.830,10.000},
				{86428.093,8368.318,10.000},
				{87267.393,8393.009,10.000},
				{88109.077,8416.839,10.000},
				{88953.052,8439.744,10.000},
				{89799.218,8461.659,10.000},
				{90647.470,8482.520,10.000},
				{91497.696,8502.266,10.000},
				{92349.780,8520.835,10.000},
				{93203.597,8538.171,10.000},
				{94059.019,8554.218,10.000},
				{94915.911,8568.922,10.000},
				{95774.134,8582.236,10.000},
				{96633.546,8594.114,10.000},
				{97493.997,8604.516,10.000},
				{98355.338,8613.404,10.000},
				{99217.413,8620.748,10.000},
				{100080.065,8626.522,10.000},
				{100943.135,8630.705,10.000},
				{101806.464,8633.282,10.000},
				{102669.888,8634.244,10.000},
				{103533.247,8633.586,10.000},
				{104396.378,8631.312,10.000},
				{105259.121,8627.430,10.000},
				{106121.316,8621.953,10.000},
				{106982.806,8614.902,10.000},
				{107843.437,8606.302,10.000},
				{108703.055,8596.182,10.000},
				{109561.513,8584.578,10.000},
				{110418.666,8571.531,10.000},
				{111274.374,8557.084,10.000},
				{112128.503,8541.285,10.000},
				{112980.921,8524.188,10.000},
				{113831.506,8505.845,10.000},
				{114680.137,8486.316,10.000},
				{115526.703,8465.659,10.000},
				{116371.097,8443.938,10.000},
				{117213.219,8421.214,10.000},
				{118052.974,8397.553,10.000},
				{118890.276,8373.018,10.000},
				{119725.043,8347.676,10.000},
				{120557.202,8321.590,10.000},
				{121386.685,8294.826,10.000},
				{122213.430,8267.446,10.000},
				{123037.381,8239.514,10.000},
				{123858.490,8211.091,10.000},
				{124676.714,8182.235,10.000},
				{125492.014,8153.006,10.000},
				{126304.360,8123.458,10.000},
				{127113.725,8093.646,10.000},
				{127920.087,8063.621,10.000},
				{128723.430,8033.432,10.000},
				{129523.743,8003.127,10.000},
				{130321.017,7972.749,10.000},
				{131115.251,7942.340,10.000},
				{131906.445,7911.941,10.000},
				{132694.604,7881.587,10.000},
				{133479.736,7851.314,10.000},
				{134261.851,7821.154,10.000},
				{135040.965,7791.137,10.000},
				{135817.094,7761.289,10.000},
				{136590.257,7731.638,10.000},
				{137360.478,7702.204,10.000},
				{138127.779,7673.011,10.000},
				{138892.187,7644.077,10.000},
				{139653.728,7615.418,10.000},
				{140412.434,7587.052,10.000},
				{141168.333,7558.990,10.000},
				{141921.457,7531.246,10.000},
				{142671.840,7503.830,10.000},
				{143419.515,7476.751,10.000},
				{144164.517,7450.017,10.000},
				{144906.881,7423.634,10.000},
				{145646.641,7397.607,10.000},
				{146383.835,7371.941,10.000},
				{147118.499,7346.639,10.000},
				{147850.669,7321.703,10.000},
				{148580.383,7297.134,10.000},
				{149307.676,7272.932,10.000},
				{150032.586,7249.099,10.000},
				{150755.149,7225.631,10.000},
				{151475.402,7202.529,10.000},
				{152193.381,7179.790,10.000},
				{152909.122,7157.411,10.000},
				{153622.661,7135.389,10.000},
				{154334.033,7113.720,10.000},
				{155043.273,7092.401,10.000},
				{155750.416,7071.427,10.000},
				{156455.495,7050.794,10.000},
				{157158.545,7030.497,10.000},
				{157859.598,7010.530,10.000},
				{158558.687,6990.888,10.000},
				{159255.843,6971.567,10.000},
				{159951.099,6952.560,10.000},
				{160644.485,6933.861,10.000},
				{161336.032,6915.465,10.000},
				{162025.768,6897.365,10.000},
				{162713.724,6879.555,10.000},
				{163399.927,6862.031,10.000},
				{164084.405,6844.784,10.000},
				{164767.186,6827.809,10.000},
				{165448.296,6811.100,10.000},
				{166127.761,6794.651,10.000},
				{166805.607,6778.455,10.000},
				{167481.858,6762.507,10.000},
				{168156.538,6746.799,10.000},
				{168829.670,6731.326,10.000},
				{169501.278,6716.082,10.000},
				{170171.384,6701.060,10.000},
				{170840.010,6686.255,10.000},
				{171507.176,6671.661,10.000},
				{172172.903,6657.271,10.000},
				{172837.211,6643.080,10.000},
				{173500.119,6629.081,10.000},
				{174161.646,6615.270,10.000},
				{174821.810,6601.640,10.000},
				{175480.629,6588.186,10.000},
				{176138.119,6574.902,10.000},
				{176794.297,6561.782,10.000},
				{177449.179,6548.822,10.000},
				{178102.781,6536.015,10.000},
				{178755.116,6523.356,10.000},
				{179406.200,6510.840,10.000},
				{180056.047,6498.461,10.000},
				{180704.668,6486.215,10.000},
				{181352.078,6474.096,10.000},
				{181998.287,6462.099,10.000},
				{182643.309,6450.219,10.000},
				{183287.154,6438.451,10.000},
				{183929.833,6426.790,10.000},
				{184571.356,6415.230,10.000},
				{185211.733,6403.768,10.000},
				{185850.973,6392.398,10.000},
				{186489.085,6381.116,10.000},
				{187126.076,6369.916,10.000},
				{187761.956,6358.794,10.000},
				{188396.254,6342.980,10.000},
				{189027.890,6316.368,10.000},
				{189655.655,6277.650,10.000},
				{190278.346,6226.904,10.000},
				{190894.767,6164.206,10.000},
				{191503.729,6089.629,10.000},
				{192104.054,6003.243,10.000},
				{192694.565,5905.117,10.000},
				{193274.097,5795.315,10.000},
				{193841.487,5673.901,10.000},
				{194395.580,5540.933,10.000},
				{194935.227,5396.467,10.000},
				{195459.750,5245.228,10.000},
				{195969.076,5093.260,10.000},
				{196463.266,4941.900,10.000},
				{196942.379,4791.128,10.000},
				{197406.471,4640.924,10.000},
				{197855.598,4491.271,10.000},
				{198289.813,4342.149,10.000},
				{198709.167,4193.540,10.000},
				{199113.710,4045.427,10.000},
				{199503.489,3897.793,10.000},
				{199878.551,3750.621,10.000},
				{200238.940,3603.893,10.000},
				{200584.700,3457.593,10.000},
				{200915.870,3311.705,10.000},
				{201232.491,3166.212,10.000},
				{201534.601,3021.097,10.000},
				{201822.236,2876.344,10.000},
				{202095.429,2731.937,10.000},
				{202354.215,2587.860,10.000},
				{202598.625,2444.095,10.000},
				{202828.687,2300.627,10.000},
				{203044.431,2157.439,10.000},
				{203245.883,2014.514,10.000},
				{203433.066,1871.835,10.000},
				{203606.005,1729.387,10.000},
				{203764.720,1587.151,10.000},
				{203909.231,1445.111,10.000},
				{204039.556,1303.250,10.000},
				{204155.711,1161.551,10.000},
				{204257.711,1019.996,10.000},
				{204345.568,878.568,10.000},
				{204419.748,741.807,10.000},
				{204481.306,615.572,10.000},
				{204531.421,501.159,10.000},
				{204571.276,398.549,10.000},
				{204602.049,307.727,10.000},
				{204624.917,228.681,10.000},
				{204641.057,161.400,10.000},
				{204651.645,105.879,10.000},
				{204657.856,62.113,10.000},
				{204660.866,30.099,10.000},
				{204661.850,9.835,10.000},
				{204661.982,1.320,10.000},
				{204661.982,0.000,10.000}
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