package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class TestSTurnAuto extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (8.38,5.50,0.00)
	
	public TestSTurnAuto() {
		this(false);
	}
			
    public TestSTurnAuto(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.587,11.749,10.000},
				{2.937,23.498,10.000},
				{8.224,52.869,10.000},
				{17.623,93.983,10.000},
				{32.306,146.832,10.000},
				{53.446,211.402,10.000},
				{82.213,287.674,10.000},
				{119.775,375.619,10.000},
				{167.295,475.201,10.000},
				{225.933,586.373,10.000},
				{296.840,709.077,10.000},
				{381.164,843.240,10.000},
				{479.457,982.931,10.000},
				{591.681,1122.232,10.000},
				{717.790,1261.089,10.000},
				{857.735,1399.451,10.000},
				{1011.461,1537.263,10.000},
				{1178.908,1674.475,10.000},
				{1360.012,1811.035,10.000},
				{1554.701,1946.894,10.000},
				{1762.901,2082.002,10.000},
				{1984.533,2216.311,10.000},
				{2219.510,2349.774,10.000},
				{2467.744,2482.343,10.000},
				{2729.142,2613.973,10.000},
				{3003.603,2744.618,10.000},
				{3291.027,2874.234,10.000},
				{3591.305,3002.777,10.000},
				{3904.325,3130.202,10.000},
				{4229.971,3256.466,10.000},
				{4568.124,3381.527,10.000},
				{4918.658,3505.342,10.000},
				{5281.445,3627.866,10.000},
				{5656.351,3749.058,10.000},
				{6043.238,3868.874,10.000},
				{6441.965,3987.269,10.000},
				{6852.385,4104.199,10.000},
				{7274.347,4219.618,10.000},
				{7707.695,4333.481,10.000},
				{8152.269,4445.739,10.000},
				{8607.903,4556.343,10.000},
				{9074.427,4665.243,10.000},
				{9551.666,4772.387,10.000},
				{10038.904,4872.386,10.000},
				{10534.903,4959.982,10.000},
				{11038.437,5035.341,10.000},
				{11548.301,5098.639,10.000},
				{12063.306,5150.058,10.000},
				{12582.285,5189.790,10.000},
				{13104.089,5218.035,10.000},
				{13627.589,5235.000,10.000},
				{14151.678,5240.896,10.000},
				{14675.273,5235.943,10.000},
				{15197.309,5220.365,10.000},
				{15716.748,5194.390,10.000},
				{16233.072,5163.239,10.000},
				{16746.270,5131.984,10.000},
				{17256.333,5100.621,10.000},
				{17763.247,5069.145,10.000},
				{18267.003,5037.555,10.000},
				{18767.588,5005.850,10.000},
				{19264.991,4974.031,10.000},
				{19759.201,4942.099,10.000},
				{20250.206,4910.059,10.000},
				{20737.998,4877.916,10.000},
				{21222.566,4845.678,10.000},
				{21703.901,4813.353,10.000},
				{22181.996,4780.952,10.000},
				{22656.845,4748.488,10.000},
				{23128.443,4715.975,10.000},
				{23596.786,4683.432,10.000},
				{24061.873,4650.875,10.000},
				{24523.706,4618.327,10.000},
				{24982.287,4585.811,10.000},
				{25437.622,4553.352,10.000},
				{25889.720,4520.978,10.000},
				{26338.592,4488.719,10.000},
				{26784.253,4456.607,10.000},
				{27226.720,4424.678,10.000},
				{27666.017,4392.969,10.000},
				{28102.169,4361.518,10.000},
				{28535.206,4330.368,10.000},
				{28965.162,4299.562,10.000},
				{29392.077,4269.147,10.000},
				{29815.994,4239.169,10.000},
				{30236.962,4209.680,10.000},
				{30655.035,4180.729,10.000},
				{31070.272,4152.372,10.000},
				{31482.738,4124.661,10.000},
				{31892.503,4097.653,10.000},
				{32299.644,4071.404,10.000},
				{32704.241,4045.971,10.000},
				{33106.382,4021.411,10.000},
				{33506.160,3997.781,10.000},
				{33903.674,3975.140,10.000},
				{34299.028,3953.543,10.000},
				{34692.333,3933.046,10.000},
				{35083.703,3913.702,10.000},
				{35473.259,3895.564,10.000},
				{35861.128,3878.682,10.000},
				{36247.438,3863.105,10.000},
				{36632.325,3848.875,10.000},
				{37015.929,3836.036,10.000},
				{37398.391,3824.624,10.000},
				{37779.859,3814.675,10.000},
				{38160.481,3806.217,10.000},
				{38540.408,3799.276,10.000},
				{38919.796,3793.874,10.000},
				{39298.798,3790.025,10.000},
				{39677.572,3787.741,10.000},
				{40056.275,3787.027,10.000},
				{40435.063,3787.885,10.000},
				{40814.094,3790.308,10.000},
				{41193.523,3794.289,10.000},
				{41573.504,3799.811,10.000},
				{41954.190,3806.856,10.000},
				{42335.730,3815.398,10.000},
				{42718.270,3825.408,10.000},
				{43101.956,3836.853,10.000},
				{43486.925,3849.695,10.000},
				{43873.315,3863.894,10.000},
				{44261.255,3879.403,10.000},
				{44650.872,3896.176,10.000},
				{45042.289,3914.162,10.000},
				{45435.619,3933.307,10.000},
				{45830.975,3953.558,10.000},
				{46228.461,3974.857,10.000},
				{46628.175,3997.146,10.000},
				{47030.212,4020.367,10.000},
				{47434.658,4044.461,10.000},
				{47841.595,4069.368,10.000},
				{48251.098,4095.029,10.000},
				{48663.237,4121.386,10.000},
				{49078.075,4148.379,10.000},
				{49495.670,4175.953,10.000},
				{49916.075,4204.050,10.000},
				{50339.337,4232.616,10.000},
				{50765.496,4261.599,10.000},
				{51194.591,4290.947,10.000},
				{51626.652,4320.610,10.000},
				{52061.706,4350.541,10.000},
				{52499.776,4380.695,10.000},
				{52940.879,4411.029,10.000},
				{53385.029,4441.500,10.000},
				{53832.236,4472.071,10.000},
				{54282.506,4502.706,10.000},
				{54735.843,4533.368,10.000},
				{55192.246,4564.027,10.000},
				{55651.711,4594.652,10.000},
				{56114.233,4625.215,10.000},
				{56579.802,4655.691,10.000},
				{57048.407,4686.056,10.000},
				{57520.036,4716.289,10.000},
				{57994.673,4746.368,10.000},
				{58472.301,4776.277,10.000},
				{58952.901,4806.000,10.000},
				{59436.453,4835.521,10.000},
				{59922.936,4864.828,10.000},
				{60412.326,4893.909,10.000},
				{60904.602,4922.755,10.000},
				{61399.738,4951.358,10.000},
				{61897.709,4979.709,10.000},
				{62398.489,5007.804,10.000},
				{62902.053,5035.636,10.000},
				{63408.373,5063.204,10.000},
				{63917.423,5090.503,10.000},
				{64429.177,5117.532,10.000},
				{64943.606,5144.291,10.000},
				{65460.684,5170.779,10.000},
				{65980.383,5196.997,10.000},
				{66502.678,5222.946,10.000},
				{67027.541,5248.629,10.000},
				{67554.946,5274.048,10.000},
				{68084.866,5299.207,10.000},
				{68617.277,5324.108,10.000},
				{69152.153,5348.757,10.000},
				{69689.469,5373.158,10.000},
				{70229.200,5397.316,10.000},
				{70771.324,5421.236,10.000},
				{71315.816,5444.924,10.000},
				{71862.655,5468.387,10.000},
				{72411.818,5491.629,10.000},
				{72963.284,5514.659,10.000},
				{73517.032,5537.482,10.000},
				{74073.043,5560.106,10.000},
				{74631.296,5582.537,10.000},
				{75191.775,5604.784,10.000},
				{75754.460,5626.852,10.000},
				{76319.335,5648.750,10.000},
				{76886.384,5670.486,10.000},
				{77455.590,5692.067,10.000},
				{78026.940,5713.501,10.000},
				{78600.420,5734.795,10.000},
				{79176.016,5755.958,10.000},
				{79753.715,5776.998,10.000},
				{80333.508,5797.923,10.000},
				{80915.382,5818.741,10.000},
				{81499.328,5839.460,10.000},
				{82085.337,5860.088,10.000},
				{82673.400,5880.633,10.000},
				{83263.510,5901.104,10.000},
				{83855.661,5921.509,10.000},
				{84449.847,5941.856,10.000},
				{85046.062,5962.154,10.000},
				{85644.303,5982.410,10.000},
				{86244.567,6002.633,10.000},
				{86846.850,6022.832,10.000},
				{87451.151,6043.014,10.000},
				{88057.470,6063.188,10.000},
				{88665.806,6083.363,10.000},
				{89276.161,6103.545,10.000},
				{89888.535,6123.745,10.000},
				{90502.932,6143.970,10.000},
				{91119.355,6164.228,10.000},
				{91737.808,6184.528,10.000},
				{92358.296,6204.878,10.000},
				{92980.824,6225.286,10.000},
				{93605.400,6245.761,10.000},
				{94232.031,6266.310,10.000},
				{94860.726,6286.943,10.000},
				{95491.492,6307.666,10.000},
				{96124.341,6328.489,10.000},
				{96759.283,6349.420,10.000},
				{97396.330,6370.466,10.000},
				{98035.493,6391.636,10.000},
				{98676.787,6412.937,10.000},
				{99320.225,6434.378,10.000},
				{99965.822,6455.967,10.000},
				{100613.593,6477.711,10.000},
				{101263.554,6499.617,10.000},
				{101915.724,6521.695,10.000},
				{102570.119,6543.950,10.000},
				{103226.758,6566.391,10.000},
				{103885.661,6589.025,10.000},
				{104546.846,6611.859,10.000},
				{105210.336,6634.899,10.000},
				{105876.152,6658.153,10.000},
				{106544.314,6681.627,10.000},
				{107214.847,6705.327,10.000},
				{107887.773,6729.259,10.000},
				{108563.116,6753.429,10.000},
				{109240.900,6777.843,10.000},
				{109921.151,6802.504,10.000},
				{110603.892,6827.419,10.000},
				{111289.151,6852.590,10.000},
				{111976.954,6878.022,10.000},
				{112667.325,6903.719,10.000},
				{113360.294,6929.681,10.000},
				{114055.885,6955.913,10.000},
				{114754.126,6982.415,10.000},
				{115455.045,7009.187,10.000},
				{116158.668,7036.230,10.000},
				{116865.022,7063.543,10.000},
				{117574.135,7091.124,10.000},
				{118286.032,7118.970,10.000},
				{119000.739,7147.077,10.000},
				{119718.283,7175.441,10.000},
				{120438.689,7204.056,10.000},
				{121161.980,7232.914,10.000},
				{121888.181,7262.006,10.000},
				{122617.313,7291.324,10.000},
				{123349.399,7320.855,10.000},
				{124084.458,7350.587,10.000},
				{124822.508,7380.504,10.000},
				{125563.567,7410.591,10.000},
				{126307.650,7440.830,10.000},
				{127054.770,7471.200,10.000},
				{127804.938,7501.680,10.000},
				{128558.163,7532.247,10.000},
				{129314.450,7562.873,10.000},
				{130073.803,7593.532,10.000},
				{130836.223,7624.192,10.000},
				{131601.705,7654.823,10.000},
				{132370.244,7685.388,10.000},
				{133141.829,7715.853,10.000},
				{133916.447,7746.176,10.000},
				{134694.078,7776.318,10.000},
				{135474.702,7806.235,10.000},
				{136258.290,7835.882,10.000},
				{137044.811,7865.210,10.000},
				{137834.228,7894.171,10.000},
				{138626.499,7922.713,10.000},
				{139421.578,7950.783,10.000},
				{140219.410,7978.326,10.000},
				{141019.939,8005.286,10.000},
				{141823.099,8031.606,10.000},
				{142628.822,8057.227,10.000},
				{143437.031,8082.092,10.000},
				{144247.645,8106.140,10.000},
				{145060.577,8129.313,10.000},
				{145875.732,8151.550,10.000},
				{146693.011,8172.794,10.000},
				{147512.310,8192.987,10.000},
				{148333.517,8212.072,10.000},
				{149156.516,8229.994,10.000},
				{149981.186,8246.701,10.000},
				{150807.401,8262.142,10.000},
				{151635.028,8276.269,10.000},
				{152463.931,8289.038,10.000},
				{153293.972,8300.408,10.000},
				{154125.006,8310.341,10.000},
				{154956.887,8318.804,10.000},
				{155789.464,8325.769,10.000},
				{156622.585,8331.210,10.000},
				{157456.095,8335.109,10.000},
				{158289.841,8337.450,10.000},
				{159123.663,8338.225,10.000},
				{159957.406,8337.429,10.000},
				{160790.912,8335.063,10.000},
				{161624.025,8331.132,10.000},
				{162456.590,8325.648,10.000},
				{163288.453,8318.628,10.000},
				{164119.462,8310.091,10.000},
				{164949.469,8300.064,10.000},
				{165778.326,8288.577,10.000},
				{166605.893,8275.665,10.000},
				{167432.029,8261.364,10.000},
				{168256.601,8245.717,10.000},
				{169079.478,8228.769,10.000},
				{169900.535,8210.568,10.000},
				{170719.651,8191.163,10.000},
				{171536.712,8170.607,10.000},
				{172351.607,8148.955,10.000},
				{173164.233,8126.261,10.000},
				{173974.491,8102.583,10.000},
				{174782.289,8077.977,10.000},
				{175587.539,8052.500,10.000},
				{176390.160,8026.211,10.000},
				{177190.077,7999.166,10.000},
				{177987.219,7971.421,10.000},
				{178781.522,7943.032,10.000},
				{179572.928,7914.054,10.000},
				{180361.381,7884.539,10.000},
				{181146.835,7854.538,10.000},
				{181929.246,7824.102,10.000},
				{182708.573,7793.279,10.000},
				{183484.785,7762.113,10.000},
				{184257.850,7730.649,10.000},
				{185027.742,7698.928,10.000},
				{185794.441,7666.990,10.000},
				{186557.929,7634.871,10.000},
				{187318.189,7602.607,10.000},
				{188075.212,7570.229,10.000},
				{188828.989,7537.767,10.000},
				{189579.514,7505.250,10.000},
				{190326.784,7472.702,10.000},
				{191070.799,7440.147,10.000},
				{191811.559,7407.605,10.000},
				{192549.069,7375.096,10.000},
				{193283.332,7342.636,10.000},
				{194014.356,7310.240,10.000},
				{194742.148,7277.920,10.000},
				{195466.717,7245.687,10.000},
				{196188.072,7213.551,10.000},
				{196906.224,7181.517,10.000},
				{197621.183,7149.592,10.000},
				{198332.961,7117.780,10.000},
				{199041.569,7086.081,10.000},
				{199747.019,7054.498,10.000},
				{200449.322,7023.029,10.000},
				{201148.489,6991.673,10.000},
				{201844.531,6960.424,10.000},
				{202537.424,6928.926,10.000},
				{203226.475,6890.511,10.000},
				{203910.376,6839.005,10.000},
				{204587.839,6774.638,10.000},
				{205257.603,6697.633,10.000},
				{205918.423,6608.208,10.000},
				{206569.081,6506.577,10.000},
				{207208.376,6392.945,10.000},
				{207835.127,6267.511,10.000},
				{208448.173,6130.466,10.000},
				{209046.373,5981.994,10.000},
				{209628.600,5822.269,10.000},
				{210193.779,5651.790,10.000},
				{210741.483,5477.044,10.000},
				{211271.888,5304.051,10.000},
				{211785.164,5132.760,10.000},
				{212281.476,4963.119,10.000},
				{212760.984,4795.080,10.000},
				{213223.844,4628.596,10.000},
				{213670.206,4463.620,10.000},
				{214100.216,4300.107,10.000},
				{214514.017,4138.011,10.000},
				{214911.746,3977.290,10.000},
				{215293.536,3817.899,10.000},
				{215659.516,3659.796,10.000},
				{216009.810,3502.937,10.000},
				{216344.537,3347.279,10.000},
				{216663.815,3192.780,10.000},
				{216967.755,3039.395,10.000},
				{217256.463,2887.082,10.000},
				{217530.043,2735.796,10.000},
				{217788.592,2585.492,10.000},
				{218032.204,2436.125,10.000},
				{218260.969,2287.649,10.000},
				{218474.971,2140.016,10.000},
				{218674.289,1993.181,10.000},
				{218858.998,1847.093,10.000},
				{219029.169,1701.705,10.000},
				{219184.865,1556.965,10.000},
				{219326.148,1412.823,10.000},
				{219453.070,1269.227,10.000},
				{219565.683,1126.125,10.000},
				{219664.029,983.463,10.000},
				{219748.179,841.498,10.000},
				{219818.785,706.062,10.000},
				{219877.051,582.660,10.000},
				{219924.173,471.222,10.000},
				{219961.342,371.690,10.000},
				{219989.744,284.018,10.000},
				{220010.561,208.170,10.000},
				{220024.973,144.117,10.000},
				{220034.157,91.841,10.000},
				{220039.290,51.329,10.000},
				{220041.547,22.572,10.000},
				{220042.104,5.566,10.000},
				{220042.104,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.587,11.749,10.000},
				{2.937,23.499,10.000},
				{8.225,52.875,10.000},
				{17.625,94.006,10.000},
				{32.316,146.901,10.000},
				{53.473,211.574,10.000},
				{82.277,288.044,10.000},
				{119.911,376.338,10.000},
				{167.561,476.495,10.000},
				{226.417,588.560,10.000},
				{297.676,712.593,10.000},
				{382.542,848.664,10.000},
				{481.638,990.958,10.000},
				{595.002,1133.641,10.000},
				{722.679,1276.767,10.000},
				{864.718,1420.390,10.000},
				{1021.174,1564.562,10.000},
				{1192.108,1709.334,10.000},
				{1377.583,1854.758,10.000},
				{1577.672,2000.883,10.000},
				{1792.448,2147.759,10.000},
				{2021.991,2295.434,10.000},
				{2266.387,2443.955,10.000},
				{2525.724,2593.370,10.000},
				{2800.096,2743.724,10.000},
				{3089.602,2895.063,10.000},
				{3394.345,3047.431,10.000},
				{3714.433,3200.873,10.000},
				{4049.976,3355.432,10.000},
				{4401.091,3511.151,10.000},
				{4767.898,3668.074,10.000},
				{5150.523,3826.244,10.000},
				{5549.093,3985.703,10.000},
				{5963.743,4146.495,10.000},
				{6394.609,4308.664,10.000},
				{6841.834,4472.253,10.000},
				{7305.565,4637.307,10.000},
				{7785.952,4803.871,10.000},
				{8283.151,4971.993,10.000},
				{8797.323,5141.719,10.000},
				{9328.633,5313.098,10.000},
				{9877.251,5486.182,10.000},
				{10443.353,5661.021,10.000},
				{11026.479,5831.257,10.000},
				{11625.519,5990.396,10.000},
				{12239.346,6138.274,10.000},
				{12866.817,6274.715,10.000},
				{13506.771,6399.535,10.000},
				{14158.025,6512.544,10.000},
				{14819.379,6613.540,10.000},
				{15489.611,6702.319,10.000},
				{16167.478,6778.668,10.000},
				{16851.715,6842.366,10.000},
				{17541.034,6893.192,10.000},
				{18234.125,6930.916,10.000},
				{18930.332,6962.066,10.000},
				{19629.664,6993.320,10.000},
				{20332.132,7024.683,10.000},
				{21037.748,7056.158,10.000},
				{21746.523,7087.747,10.000},
				{22458.468,7119.451,10.000},
				{23173.595,7151.270,10.000},
				{23891.915,7183.200,10.000},
				{24613.439,7215.239,10.000},
				{25338.177,7247.381,10.000},
				{26066.139,7279.619,10.000},
				{26797.333,7311.943,10.000},
				{27531.767,7344.343,10.000},
				{28269.448,7376.806,10.000},
				{29010.379,7409.317,10.000},
				{29754.565,7441.860,10.000},
				{30502.007,7474.415,10.000},
				{31252.703,7506.962,10.000},
				{32006.651,7539.477,10.000},
				{32763.844,7571.935,10.000},
				{33524.275,7604.308,10.000},
				{34287.932,7636.566,10.000},
				{35054.799,7668.676,10.000},
				{35824.860,7700.603,10.000},
				{36598.091,7732.312,10.000},
				{37374.467,7763.761,10.000},
				{38153.958,7794.910,10.000},
				{38936.529,7825.714,10.000},
				{39722.142,7856.129,10.000},
				{40510.753,7886.105,10.000},
				{41302.312,7915.593,10.000},
				{42096.766,7944.542,10.000},
				{42894.056,7972.898,10.000},
				{43694.117,8000.607,10.000},
				{44496.878,8027.614,10.000},
				{45302.264,8053.862,10.000},
				{46110.194,8079.294,10.000},
				{46920.579,8103.853,10.000},
				{47733.327,8127.481,10.000},
				{48548.339,8150.121,10.000},
				{49365.511,8171.717,10.000},
				{50184.732,8192.213,10.000},
				{51005.888,8211.556,10.000},
				{51828.857,8229.693,10.000},
				{52653.514,8246.573,10.000},
				{53479.729,8262.150,10.000},
				{54307.367,8276.379,10.000},
				{55136.289,8289.218,10.000},
				{55966.352,8300.629,10.000},
				{56797.410,8310.578,10.000},
				{57629.313,8319.035,10.000},
				{58461.911,8325.975,10.000},
				{59295.048,8331.378,10.000},
				{60128.571,8335.226,10.000},
				{60962.322,8337.510,10.000},
				{61796.144,8338.224,10.000},
				{62629.881,8337.366,10.000},
				{63463.375,8334.943,10.000},
				{64296.471,8330.962,10.000},
				{65129.015,8325.440,10.000},
				{65960.855,8318.396,10.000},
				{66791.841,8309.855,10.000},
				{67621.825,8299.845,10.000},
				{68450.665,8288.401,10.000},
				{69278.221,8275.559,10.000},
				{70104.357,8261.361,10.000},
				{70928.942,8245.853,10.000},
				{71751.850,8229.081,10.000},
				{72572.960,8211.096,10.000},
				{73392.155,8191.951,10.000},
				{74209.325,8171.702,10.000},
				{75024.366,8150.404,10.000},
				{75837.177,8128.116,10.000},
				{76647.667,8104.896,10.000},
				{77455.747,8080.803,10.000},
				{78261.337,8055.897,10.000},
				{79064.361,8030.237,10.000},
				{79864.749,8003.882,10.000},
				{80662.438,7976.890,10.000},
				{81457.370,7949.318,10.000},
				{82249.492,7921.222,10.000},
				{83038.758,7892.657,10.000},
				{83825.125,7863.675,10.000},
				{84608.558,7834.329,10.000},
				{85389.025,7804.667,10.000},
				{86166.499,7774.737,10.000},
				{86940.957,7744.585,10.000},
				{87712.382,7714.252,10.000},
				{88480.761,7683.782,10.000},
				{89246.082,7653.212,10.000},
				{90008.340,7622.579,10.000},
				{90767.531,7591.918,10.000},
				{91523.657,7561.260,10.000},
				{92276.721,7530.636,10.000},
				{93026.728,7500.074,10.000},
				{93773.688,7469.599,10.000},
				{94517.612,7439.235,10.000},
				{95258.512,7409.004,10.000},
				{95996.405,7378.925,10.000},
				{96731.306,7349.017,10.000},
				{97463.236,7319.296,10.000},
				{98192.214,7289.776,10.000},
				{98918.261,7260.470,10.000},
				{99641.399,7231.389,10.000},
				{100361.654,7202.543,10.000},
				{101079.048,7173.942,10.000},
				{101793.607,7145.591,10.000},
				{102505.357,7117.497,10.000},
				{103214.323,7089.665,10.000},
				{103920.533,7062.099,10.000},
				{104624.013,7034.800,10.000},
				{105324.790,7007.771,10.000},
				{106022.892,6981.013,10.000},
				{106718.344,6954.526,10.000},
				{107411.175,6928.308,10.000},
				{108101.411,6902.360,10.000},
				{108789.079,6876.677,10.000},
				{109474.205,6851.259,10.000},
				{110156.815,6826.101,10.000},
				{110836.935,6801.200,10.000},
				{111514.590,6776.552,10.000},
				{112189.805,6752.151,10.000},
				{112862.604,6727.994,10.000},
				{113533.012,6704.074,10.000},
				{114201.050,6680.386,10.000},
				{114866.743,6656.924,10.000},
				{115530.111,6633.681,10.000},
				{116191.176,6610.652,10.000},
				{116849.959,6587.829,10.000},
				{117506.480,6565.206,10.000},
				{118160.757,6542.774,10.000},
				{118812.810,6520.529,10.000},
				{119462.656,6498.460,10.000},
				{120110.312,6476.562,10.000},
				{120755.795,6454.827,10.000},
				{121399.120,6433.246,10.000},
				{122040.301,6411.813,10.000},
				{122679.353,6390.519,10.000},
				{123316.288,6369.355,10.000},
				{123951.120,6348.316,10.000},
				{124583.859,6327.391,10.000},
				{125214.516,6306.573,10.000},
				{125843.102,6285.855,10.000},
				{126469.624,6265.227,10.000},
				{127094.092,6244.681,10.000},
				{127716.514,6224.210,10.000},
				{128336.894,6203.806,10.000},
				{128955.240,6183.458,10.000},
				{129571.556,6163.161,10.000},
				{130185.846,6142.905,10.000},
				{130798.115,6122.681,10.000},
				{131408.363,6102.483,10.000},
				{132016.593,6082.301,10.000},
				{132622.806,6062.127,10.000},
				{133227.001,6041.952,10.000},
				{133829.178,6021.769,10.000},
				{134429.335,6001.570,10.000},
				{135027.469,5981.345,10.000},
				{135623.578,5961.087,10.000},
				{136217.657,5940.787,10.000},
				{136809.700,5920.437,10.000},
				{137399.703,5900.028,10.000},
				{137987.658,5879.554,10.000},
				{138573.559,5859.004,10.000},
				{139157.396,5838.371,10.000},
				{139739.161,5817.648,10.000},
				{140318.843,5796.825,10.000},
				{140896.433,5775.894,10.000},
				{141471.917,5754.848,10.000},
				{142045.285,5733.678,10.000},
				{142616.523,5712.376,10.000},
				{143185.616,5690.935,10.000},
				{143752.551,5669.346,10.000},
				{144317.311,5647.602,10.000},
				{144879.881,5625.695,10.000},
				{145440.242,5603.617,10.000},
				{145998.379,5581.362,10.000},
				{146554.271,5558.920,10.000},
				{147107.899,5536.286,10.000},
				{147659.244,5513.452,10.000},
				{148208.286,5490.412,10.000},
				{148755.001,5467.157,10.000},
				{149299.370,5443.683,10.000},
				{149841.368,5419.983,10.000},
				{150380.973,5396.050,10.000},
				{150918.161,5371.880,10.000},
				{151452.907,5347.466,10.000},
				{151985.188,5322.804,10.000},
				{152514.977,5297.889,10.000},
				{153042.249,5272.717,10.000},
				{153566.977,5247.284,10.000},
				{154089.136,5221.587,10.000},
				{154608.698,5195.624,10.000},
				{155125.637,5169.392,10.000},
				{155639.926,5142.890,10.000},
				{156151.538,5116.117,10.000},
				{156660.445,5089.073,10.000},
				{157166.621,5061.760,10.000},
				{157670.039,5034.178,10.000},
				{158170.672,5006.332,10.000},
				{158668.495,4978.223,10.000},
				{159163.480,4949.859,10.000},
				{159655.605,4921.243,10.000},
				{160144.843,4892.384,10.000},
				{160631.172,4863.291,10.000},
				{161114.569,4833.972,10.000},
				{161595.013,4804.440,10.000},
				{162072.484,4774.708,10.000},
				{162546.963,4744.789,10.000},
				{163018.433,4714.701,10.000},
				{163486.879,4684.461,10.000},
				{163952.288,4654.090,10.000},
				{164414.649,4623.609,10.000},
				{164873.953,4593.041,10.000},
				{165330.195,4562.414,10.000},
				{165783.370,4531.754,10.000},
				{166233.479,4501.092,10.000},
				{166680.526,4470.461,10.000},
				{167124.515,4439.894,10.000},
				{167565.458,4409.428,10.000},
				{168003.368,4379.103,10.000},
				{168438.264,4348.960,10.000},
				{168870.168,4319.042,10.000},
				{169299.108,4289.394,10.000},
				{169725.114,4260.064,10.000},
				{170148.224,4231.102,10.000},
				{170568.480,4202.559,10.000},
				{170985.929,4174.488,10.000},
				{171400.624,4146.944,10.000},
				{171812.622,4119.982,10.000},
				{172221.988,4093.661,10.000},
				{172628.792,4068.038,10.000},
				{173033.109,4043.172,10.000},
				{173435.021,4019.123,10.000},
				{173834.616,3995.949,10.000},
				{174231.987,3973.711,10.000},
				{174627.234,3952.465,10.000},
				{175020.461,3932.272,10.000},
				{175411.780,3913.186,10.000},
				{175801.306,3895.263,10.000},
				{176189.161,3878.555,10.000},
				{176575.473,3863.113,10.000},
				{176960.371,3848.985,10.000},
				{177343.993,3836.216,10.000},
				{177726.477,3824.845,10.000},
				{178107.968,3814.911,10.000},
				{178488.613,3806.447,10.000},
				{178868.561,3799.483,10.000},
				{179247.965,3794.041,10.000},
				{179626.980,3790.142,10.000},
				{180005.760,3787.800,10.000},
				{180384.462,3787.026,10.000},
				{180763.244,3787.822,10.000},
				{181142.263,3790.188,10.000},
				{181521.675,3794.119,10.000},
				{181901.636,3799.603,10.000},
				{182282.298,3806.624,10.000},
				{182663.814,3815.161,10.000},
				{183046.333,3825.188,10.000},
				{183430.001,3836.676,10.000},
				{183814.959,3849.590,10.000},
				{184201.349,3863.891,10.000},
				{184589.302,3879.539,10.000},
				{184978.951,3896.488,10.000},
				{185370.420,3914.690,10.000},
				{185763.830,3934.096,10.000},
				{186159.295,3954.653,10.000},
				{186556.926,3976.306,10.000},
				{186956.826,3999.001,10.000},
				{187359.094,4022.680,10.000},
				{187763.823,4047.288,10.000},
				{188171.099,4072.765,10.000},
				{188581.005,4099.056,10.000},
				{188993.615,4126.103,10.000},
				{189409.000,4153.849,10.000},
				{189827.224,4182.239,10.000},
				{190248.346,4211.219,10.000},
				{190672.419,4240.735,10.000},
				{191099.493,4270.737,10.000},
				{191529.610,4301.174,10.000},
				{191962.810,4331.999,10.000},
				{192399.127,4363.166,10.000},
				{192838.590,4394.631,10.000},
				{193281.225,4426.353,10.000},
				{193727.055,4458.293,10.000},
				{194176.096,4490.413,10.000},
				{194628.364,4522.679,10.000},
				{195083.869,4555.058,10.000},
				{195542.622,4587.521,10.000},
				{196004.626,4620.039,10.000},
				{196469.884,4652.588,10.000},
				{196938.399,4685.145,10.000},
				{197410.168,4717.687,10.000},
				{197885.187,4750.198,10.000},
				{198363.453,4782.659,10.000},
				{198844.959,4815.056,10.000},
				{199329.696,4847.377,10.000},
				{199817.657,4879.610,10.000},
				{200308.832,4911.748,10.000},
				{200803.211,4943.782,10.000},
				{201300.781,4975.708,10.000},
				{201801.533,5007.522,10.000},
				{202305.456,5039.221,10.000},
				{202812.536,5070.804,10.000},
				{203322.763,5102.274,10.000},
				{203836.127,5133.632,10.000},
				{204352.615,5164.881,10.000},
				{204872.191,5195.761,10.000},
				{205394.310,5221.191,10.000},
				{205917.931,5236.213,10.000},
				{206441.991,5240.598,10.000},
				{206965.403,5234.121,10.000},
				{207487.060,5216.566,10.000},
				{208005.831,5187.718,10.000},
				{208520.569,5147.373,10.000},
				{209030.102,5095.331,10.000},
				{209533.242,5031.401,10.000},
				{210028.782,4955.399,10.000},
				{210515.497,4867.152,10.000},
				{210992.175,4766.778,10.000},
				{211458.129,4659.540,10.000},
				{211913.184,4550.550,10.000},
				{212357.169,4439.857,10.000},
				{212789.921,4327.514,10.000},
				{213211.278,4213.569,10.000},
				{213621.085,4098.069,10.000},
				{214019.191,3981.061,10.000},
				{214405.450,3862.591,10.000},
				{214779.720,3742.702,10.000},
				{215141.864,3621.440,10.000},
				{215491.749,3498.846,10.000},
				{215829.245,3374.966,10.000},
				{216154.229,3249.841,10.000},
				{216466.581,3123.514,10.000},
				{216766.184,2996.030,10.000},
				{217052.927,2867.430,10.000},
				{217326.703,2737.759,10.000},
				{217587.409,2607.061,10.000},
				{217834.947,2475.381,10.000},
				{218069.223,2342.764,10.000},
				{218290.149,2209.256,10.000},
				{218497.639,2074.904,10.000},
				{218691.615,1939.756,10.000},
				{218872.001,1803.859,10.000},
				{219038.727,1667.264,10.000},
				{219191.729,1530.020,10.000},
				{219330.947,1392.178,10.000},
				{219456.326,1253.789,10.000},
				{219567.817,1114.908,10.000},
				{219665.375,975.585,10.000},
				{219748.994,836.184,10.000},
				{219819.256,702.623,10.000},
				{219877.309,580.525,10.000},
				{219924.305,469.962,10.000},
				{219961.404,370.992,10.000},
				{219989.770,283.661,10.000},
				{220010.571,208.004,10.000},
				{220024.976,144.051,10.000},
				{220034.158,91.820,10.000},
				{220039.290,51.324,10.000},
				{220041.547,22.571,10.000},
				{220042.104,5.565,10.000},
				{220042.104,0.000,10.000}
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