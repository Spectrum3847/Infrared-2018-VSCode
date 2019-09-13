package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class RightScaleSneaky extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (20.00,-1.00,0.00)
	// (24.50,0.00,45.00)
	
	public RightScaleSneaky() {
		this(false);
	}
			
    public RightScaleSneaky(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.601,12.029,10.000},
				{3.007,24.058,10.000},
				{8.420,54.131,10.000},
				{18.044,96.233,10.000},
				{33.080,150.365,10.000},
				{54.733,216.527,10.000},
				{84.205,294.720,10.000},
				{122.699,384.945,10.000},
				{171.420,487.204,10.000},
				{231.570,601.499,10.000},
				{304.353,727.831,10.000},
				{390.973,866.205,10.000},
				{492.635,1016.622,10.000},
				{610.544,1179.089,10.000},
				{745.905,1353.608,10.000},
				{899.322,1534.170,10.000},
				{1070.798,1714.762,10.000},
				{1260.337,1895.387,10.000},
				{1467.942,2076.049,10.000},
				{1693.617,2256.751,10.000},
				{1937.366,2437.496,10.000},
				{2199.195,2618.287,10.000},
				{2479.108,2799.129,10.000},
				{2777.110,2980.023,10.000},
				{3093.208,3160.972,10.000},
				{3427.406,3341.981,10.000},
				{3779.711,3523.050,10.000},
				{4150.129,3704.184,10.000},
				{4538.667,3885.384,10.000},
				{4945.333,4066.654,10.000},
				{5370.132,4247.996,10.000},
				{5813.074,4429.411,10.000},
				{6274.164,4610.903,10.000},
				{6753.411,4792.474,10.000},
				{7250.824,4974.125,10.000},
				{7766.410,5155.859,10.000},
				{8300.177,5337.677,10.000},
				{8852.135,5519.580,10.000},
				{9422.293,5701.572,10.000},
				{10010.658,5883.652,10.000},
				{10617.240,6065.822,10.000},
				{11242.048,6248.084,10.000},
				{11885.092,6430.437,10.000},
				{12546.381,6612.884,10.000},
				{13225.923,6795.425,10.000},
				{13923.729,6978.060,10.000},
				{14639.808,7160.790,10.000},
				{15374.170,7343.615,10.000},
				{16126.823,7526.535,10.000},
				{16897.778,7709.550,10.000},
				{17687.044,7892.660,10.000},
				{18494.630,8075.864,10.000},
				{19320.547,8259.162,10.000},
				{20164.802,8442.553,10.000},
				{21027.406,8626.037,10.000},
				{21908.367,8809.611,10.000},
				{22807.694,8993.276,10.000},
				{23725.397,9177.028,10.000},
				{24661.484,9360.868,10.000},
				{25615.963,9544.793,10.000},
				{26588.843,9728.801,10.000},
				{27580.132,9912.890,10.000},
				{28589.838,10097.057,10.000},
				{29617.968,10281.301,10.000},
				{30664.530,10465.618,10.000},
				{31729.530,10650.005,10.000},
				{32812.976,10834.461,10.000},
				{33914.874,11018.980,10.000},
				{35035.231,11203.561,10.000},
				{36174.050,11388.198,10.000},
				{37331.339,11572.890,10.000},
				{38507.102,11757.630,10.000},
				{39701.344,11942.417,10.000},
				{40914.068,12127.244,10.000},
				{42145.279,12312.108,10.000},
				{43394.980,12497.004,10.000},
				{44663.172,12681.927,10.000},
				{45949.860,12866.872,10.000},
				{47255.043,13051.834,10.000},
				{48578.724,13236.807,10.000},
				{49920.902,13421.787,10.000},
				{51281.579,13606.766,10.000},
				{52660.753,13791.740,10.000},
				{54058.423,13976.702,10.000},
				{55473.979,14155.555,10.000},
				{56906.198,14322.196,10.000},
				{58353.860,14476.613,10.000},
				{59815.739,14618.791,10.000},
				{61290.611,14748.721,10.000},
				{62777.250,14866.390,10.000},
				{64274.429,14971.788,10.000},
				{65780.919,15064.906,10.000},
				{67295.493,15145.736,10.000},
				{68816.920,15214.269,10.000},
				{70343.970,15270.500,10.000},
				{71875.412,15314.422,10.000},
				{73410.015,15346.031,10.000},
				{74946.547,15365.324,10.000},
				{76483.777,15372.298,10.000},
				{78021.082,15373.051,10.000},
				{79558.451,15373.684,10.000},
				{81095.871,15374.200,10.000},
				{82633.330,15374.599,10.000},
				{84170.819,15374.883,10.000},
				{85708.324,15375.053,10.000},
				{87245.835,15375.110,10.000},
				{88783.341,15375.056,10.000},
				{90320.830,15374.893,10.000},
				{91858.292,15374.622,10.000},
				{93395.716,15374.243,10.000},
				{94933.092,15373.760,10.000},
				{96470.410,15373.173,10.000},
				{98007.658,15372.483,10.000},
				{99544.827,15371.692,10.000},
				{101081.907,15370.802,10.000},
				{102618.889,15369.813,10.000},
				{104155.761,15368.728,10.000},
				{105692.516,15367.548,10.000},
				{107229.143,15366.274,10.000},
				{108765.634,15364.907,10.000},
				{110301.979,15363.450,10.000},
				{111838.170,15361.904,10.000},
				{113374.197,15360.269,10.000},
				{114910.051,15358.549,10.000},
				{116445.726,15356.743,10.000},
				{117981.211,15354.854,10.000},
				{119516.499,15352.883,10.000},
				{121051.583,15350.832,10.000},
				{122586.453,15348.701,10.000},
				{124121.102,15346.493,10.000},
				{125655.523,15344.209,10.000},
				{127189.708,15341.851,10.000},
				{128723.650,15339.419,10.000},
				{130257.341,15336.916,10.000},
				{131790.776,15334.343,10.000},
				{133323.946,15331.701,10.000},
				{134856.845,15328.992,10.000},
				{136389.467,15326.217,10.000},
				{137921.804,15323.378,10.000},
				{139453.852,15320.476,10.000},
				{140985.603,15317.513,10.000},
				{142517.052,15314.491,10.000},
				{144048.193,15311.410,10.000},
				{145579.021,15308.272,10.000},
				{147109.529,15305.079,10.000},
				{148639.712,15301.832,10.000},
				{150169.565,15298.533,10.000},
				{151699.083,15295.182,10.000},
				{153228.261,15291.782,10.000},
				{154757.095,15288.334,10.000},
				{156285.579,15284.840,10.000},
				{157813.709,15281.300,10.000},
				{159341.481,15277.716,10.000},
				{160868.890,15274.091,10.000},
				{162395.932,15270.424,10.000},
				{163922.604,15266.718,10.000},
				{165448.901,15262.974,10.000},
				{166974.821,15259.194,10.000},
				{168500.358,15255.378,10.000},
				{170025.511,15251.529,10.000},
				{171550.276,15247.647,10.000},
				{173074.650,15243.735,10.000},
				{174598.629,15239.793,10.000},
				{176122.211,15235.824,10.000},
				{177645.394,15231.827,10.000},
				{179168.175,15227.806,10.000},
				{180690.551,15223.761,10.000},
				{182212.520,15219.693,10.000},
				{183734.080,15215.605,10.000},
				{185255.230,15211.497,10.000},
				{186775.967,15207.370,10.000},
				{188296.290,15203.227,10.000},
				{189816.197,15199.069,10.000},
				{191335.686,15194.897,10.000},
				{192854.758,15190.712,10.000},
				{194373.409,15186.515,10.000},
				{195891.640,15182.310,10.000},
				{197409.450,15178.095,10.000},
				{198926.837,15173.874,10.000},
				{200443.802,15169.647,10.000},
				{201960.343,15165.416,10.000},
				{203476.461,15161.182,10.000},
				{204992.156,15156.946,10.000},
				{206507.427,15152.710,10.000},
				{208022.275,15148.476,10.000},
				{209536.699,15144.244,10.000},
				{211050.701,15140.016,10.000},
				{212564.280,15135.794,10.000},
				{214077.438,15131.579,10.000},
				{215590.175,15127.371,10.000},
				{217102.492,15123.174,10.000},
				{218614.391,15118.987,10.000},
				{220125.873,15114.813,10.000},
				{221636.938,15110.653,10.000},
				{223147.588,15106.507,10.000},
				{224657.826,15102.378,10.000},
				{226167.653,15098.268,10.000},
				{227677.071,15094.176,10.000},
				{229186.081,15090.106,10.000},
				{230694.687,15086.057,10.000},
				{232202.890,15082.032,10.000},
				{233710.693,15078.032,10.000},
				{235218.099,15074.058,10.000},
				{236725.111,15070.113,10.000},
				{238231.730,15066.196,10.000},
				{239737.961,15062.310,10.000},
				{241243.807,15058.456,10.000},
				{242749.270,15054.636,10.000},
				{244254.355,15050.850,10.000},
				{245759.065,15047.101,10.000},
				{247263.404,15043.389,10.000},
				{248767.376,15039.717,10.000},
				{250270.985,15036.085,10.000},
				{251774.234,15032.496,10.000},
				{253277.129,15028.950,10.000},
				{254779.674,15025.448,10.000},
				{256281.873,15021.994,10.000},
				{257783.732,15018.587,10.000},
				{259285.255,15015.229,10.000},
				{260786.447,15011.922,10.000},
				{262287.314,15008.668,10.000},
				{263787.861,15005.467,10.000},
				{265288.093,15002.321,10.000},
				{266788.016,14999.232,10.000},
				{268287.636,14996.201,10.000},
				{269786.959,14993.229,10.000},
				{271285.991,14990.319,10.000},
				{272784.738,14987.471,10.000},
				{274283.206,14984.687,10.000},
				{275781.403,14981.968,10.000},
				{277279.335,14979.317,10.000},
				{278777.008,14976.733,10.000},
				{280274.430,14974.220,10.000},
				{281771.608,14971.778,10.000},
				{283268.549,14969.409,10.000},
				{284765.260,14967.114,10.000},
				{286261.750,14964.895,10.000},
				{287758.025,14962.754,10.000},
				{289254.094,14960.691,10.000},
				{290749.965,14958.708,10.000},
				{292245.646,14956.807,10.000},
				{293741.145,14954.990,10.000},
				{295236.471,14953.257,10.000},
				{296731.632,14951.610,10.000},
				{298226.637,14950.051,10.000},
				{299721.495,14948.581,10.000},
				{301216.215,14947.202,10.000},
				{302710.806,14945.914,10.000},
				{304205.278,14944.721,10.000},
				{305699.641,14943.622,10.000},
				{307193.903,14942.619,10.000},
				{308688.074,14941.715,10.000},
				{310182.165,14940.910,10.000},
				{311676.186,14940.205,10.000},
				{313170.146,14939.603,10.000},
				{314664.056,14939.105,10.000},
				{316157.927,14938.711,10.000},
				{317651.770,14938.425,10.000},
				{319145.595,14938.246,10.000},
				{320639.412,14938.177,10.000},
				{322133.234,14938.218,10.000},
				{323627.071,14938.372,10.000},
				{325120.935,14938.639,10.000},
				{326614.837,14939.022,10.000},
				{328108.789,14939.520,10.000},
				{329602.803,14940.137,10.000},
				{331096.890,14940.873,10.000},
				{332591.063,14941.730,10.000},
				{334085.334,14942.708,10.000},
				{335579.715,14943.810,10.000},
				{337074.219,14945.037,10.000},
				{338568.858,14946.390,10.000},
				{340063.645,14947.870,10.000},
				{341558.593,14949.480,10.000},
				{343053.715,14951.219,10.000},
				{344549.024,14953.090,10.000},
				{346044.533,14955.094,10.000},
				{347540.256,14957.232,10.000},
				{349036.207,14959.506,10.000},
				{350532.399,14961.916,10.000},
				{352028.845,14964.465,10.000},
				{353525.561,14967.154,10.000},
				{355022.559,14969.983,10.000},
				{356519.854,14972.955,10.000},
				{358017.461,14976.070,10.000},
				{359515.394,14979.330,10.000},
				{361013.668,14982.737,10.000},
				{362512.297,14986.291,10.000},
				{364011.297,14989.994,10.000},
				{365510.681,14993.847,10.000},
				{367010.466,14997.852,10.000},
				{368510.667,15002.010,10.000},
				{370011.300,15006.322,10.000},
				{371512.379,15010.789,10.000},
				{373013.920,15015.414,10.000},
				{374515.940,15020.196,10.000},
				{376018.453,15025.139,10.000},
				{377521.478,15030.242,10.000},
				{379025.029,15035.508,10.000},
				{380529.122,15040.938,10.000},
				{382033.776,15046.533,10.000},
				{383539.005,15052.294,10.000},
				{385044.827,15058.224,10.000},
				{386551.260,15064.323,10.000},
				{388058.319,15070.592,10.000},
				{389566.022,15077.034,10.000},
				{391074.387,15083.650,10.000},
				{392583.431,15090.440,10.000},
				{394093.172,15097.408,10.000},
				{395603.627,15104.553,10.000},
				{397114.815,15111.878,10.000},
				{398626.754,15119.385,10.000},
				{400139.461,15127.073,10.000},
				{401652.956,15134.947,10.000},
				{403167.256,15143.005,10.000},
				{404682.381,15151.251,10.000},
				{406210.499,15281.174,10.000},
				{407769.374,15588.752,10.000},
				{409354.527,15851.534,10.000},
				{410961.270,16067.422,10.000},
				{412585.093,16238.235,10.000},
				{414221.702,16366.087,10.000},
				{415867.033,16453.311,10.000},
				{417517.272,16502.391,10.000},
				{419168.862,16515.899,10.000},
				{420818.505,16496.435,10.000},
				{422463.162,16446.570,10.000},
				{424100.042,16368.795,10.000},
				{425726.589,16265.476,10.000},
				{427340.471,16138.818,10.000},
				{428939.555,15990.836,10.000},
				{430521.741,15821.863,10.000},
				{432084.480,15627.390,10.000},
				{433624.934,15404.544,10.000},
				{435140.458,15155.234,10.000},
				{436628.585,14881.268,10.000},
				{438087.021,14584.362,10.000},
				{439513.637,14266.164,10.000},
				{440906.465,13928.277,10.000},
				{442263.694,13572.295,10.000},
				{443583.678,13199.840,10.000},
				{444864.938,12812.603,10.000},
				{446106.177,12412.382,10.000},
				{447306.289,12001.120,10.000},
				{448464.382,11580.929,10.000},
				{449579.793,11154.116,10.000},
				{450652.220,10724.267,10.000},
				{451682.064,10298.444,10.000},
				{452670.285,9882.210,10.000},
				{453618.039,9477.535,10.000},
				{454526.688,9086.496,10.000},
				{455397.810,8711.220,10.000},
				{456233.193,8353.828,10.000},
				{457034.828,8016.351,10.000},
				{457804.893,7700.651,10.000},
				{458545.726,7408.331,10.000},
				{459259.792,7140.654,10.000},
				{459949.639,6898.473,10.000},
				{460617.857,6682.181,10.000},
				{461267.025,6491.676,10.000},
				{461899.661,6326.364,10.000},
				{462518.179,6185.182,10.000},
				{463124.844,6066.645,10.000},
				{463721.735,5968.916,10.000},
				{464310.724,5889.883,10.000},
				{464893.449,5827.256,10.000},
				{465471.314,5778.644,10.000},
				{466045.478,5741.644,10.000},
				{466616.869,5713.913,10.000},
				{467186.192,5693.221,10.000},
				{467753.941,5677.498,10.000},
				{468320.428,5664.865,10.000},
				{468885.793,5653.650,10.000},
				{469450.032,5642.394,10.000},
				{470013.017,5629.845,10.000},
				{470574.512,5614.954,10.000},
				{471134.198,5596.858,10.000},
				{471691.684,5574.860,10.000},
				{472246.525,5548.414,10.000},
				{472798.236,5517.106,10.000},
				{473346.299,5480.630,10.000},
				{473890.177,5438.779,10.000},
				{474429.319,5391.424,10.000},
				{474963.169,5338.500,10.000},
				{475491.169,5279.993,10.000},
				{476012.762,5215.934,10.000},
				{476527.400,5146.384,10.000},
				{477034.543,5071.428,10.000},
				{477533.660,4991.170,10.000},
				{478024.233,4905.727,10.000},
				{478505.755,4815.225,10.000},
				{478977.735,4719.794,10.000},
				{479439.692,4619.570,10.000},
				{479891.160,4514.685,10.000},
				{480331.688,4405.276,10.000},
				{480760.835,4291.476,10.000},
				{481178.177,4173.417,10.000},
				{481583.300,4051.228,10.000},
				{481975.804,3925.038,10.000},
				{482355.301,3794.974,10.000},
				{482721.417,3661.162,10.000},
				{483073.790,3523.727,10.000},
				{483412.069,3382.793,10.000},
				{483735.918,3238.488,10.000},
				{484045.012,3090.938,10.000},
				{484339.040,2940.274,10.000},
				{484617.702,2786.627,10.000},
				{484880.716,2630.133,10.000},
				{485127.809,2470.932,10.000},
				{485358.725,2309.167,10.000},
				{485573.224,2144.988,10.000},
				{485771.079,1978.548,10.000},
				{485952.080,1810.006,10.000},
				{486116.032,1639.526,10.000},
				{486262.760,1467.279,10.000},
				{486392.244,1294.837,10.000},
				{486505.079,1128.350,10.000},
				{486602.341,972.622,10.000},
				{486685.132,827.904,10.000},
				{486754.573,694.412,10.000},
				{486811.806,572.330,10.000},
				{486857.987,461.812,10.000},
				{486894.286,362.987,10.000},
				{486921.881,275.954,10.000},
				{486941.960,200.793,10.000},
				{486955.717,137.564,10.000},
				{486964.347,86.307,10.000},
				{486969.052,47.051,10.000},
				{486971.034,19.812,10.000},
				{486971.494,4.599,10.000},
				{486971.494,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.601,12.029,10.000},
				{3.007,24.058,10.000},
				{8.420,54.131,10.000},
				{18.044,96.232,10.000},
				{33.080,150.362,10.000},
				{54.732,216.520,10.000},
				{84.202,294.705,10.000},
				{122.694,384.916,10.000},
				{171.409,487.151,10.000},
				{231.550,601.410,10.000},
				{304.319,727.688,10.000},
				{390.917,865.983,10.000},
				{492.546,1016.293,10.000},
				{610.407,1178.612,10.000},
				{745.701,1352.935,10.000},
				{899.026,1533.246,10.000},
				{1070.378,1713.527,10.000},
				{1259.756,1893.774,10.000},
				{1467.154,2073.985,10.000},
				{1692.570,2254.155,10.000},
				{1935.998,2434.283,10.000},
				{2197.434,2614.363,10.000},
				{2476.874,2794.394,10.000},
				{2774.311,2974.373,10.000},
				{3089.741,3154.296,10.000},
				{3423.157,3334.160,10.000},
				{3774.553,3513.963,10.000},
				{4143.923,3693.702,10.000},
				{4531.260,3873.374,10.000},
				{4936.558,4052.976,10.000},
				{5359.809,4232.507,10.000},
				{5801.005,4411.964,10.000},
				{6260.140,4591.344,10.000},
				{6737.204,4770.646,10.000},
				{7232.191,4949.868,10.000},
				{7745.092,5129.007,10.000},
				{8275.898,5308.061,10.000},
				{8824.601,5487.030,10.000},
				{9391.192,5665.911,10.000},
				{9975.662,5844.703,10.000},
				{10578.003,6023.406,10.000},
				{11198.204,6202.016,10.000},
				{11836.258,6380.535,10.000},
				{12492.154,6558.961,10.000},
				{13165.883,6737.292,10.000},
				{13857.436,6915.530,10.000},
				{14566.803,7093.672,10.000},
				{15293.975,7271.720,10.000},
				{16038.943,7449.672,10.000},
				{16801.696,7627.530,10.000},
				{17582.225,7805.292,10.000},
				{18380.521,7982.961,10.000},
				{19196.574,8160.535,10.000},
				{20030.376,8338.016,10.000},
				{20881.917,8515.405,10.000},
				{21751.187,8692.703,10.000},
				{22638.178,8869.911,10.000},
				{23542.881,9047.031,10.000},
				{24465.288,9224.064,10.000},
				{25405.389,9401.011,10.000},
				{26363.176,9577.876,10.000},
				{27338.642,9754.660,10.000},
				{28331.779,9931.365,10.000},
				{29342.578,10107.994,10.000},
				{30371.033,10284.549,10.000},
				{31417.136,10461.034,10.000},
				{32480.881,10637.451,10.000},
				{33562.262,10813.804,10.000},
				{34661.271,10990.096,10.000},
				{35777.904,11166.330,10.000},
				{36912.156,11342.512,10.000},
				{38064.020,11518.643,10.000},
				{39233.493,11694.729,10.000},
				{40420.570,11870.774,10.000},
				{41625.249,12046.783,10.000},
				{42847.524,12222.759,10.000},
				{44087.395,12398.709,10.000},
				{45344.859,12574.636,10.000},
				{46619.914,12750.547,10.000},
				{47912.558,12926.446,10.000},
				{49222.792,13102.339,10.000},
				{50550.615,13278.232,10.000},
				{51896.028,13454.130,10.000},
				{53259.032,13630.041,10.000},
				{54639.036,13800.031,10.000},
				{56034.853,13958.175,10.000},
				{57445.302,14104.486,10.000},
				{58869.199,14238.976,10.000},
				{60305.365,14361.657,10.000},
				{61752.619,14472.541,10.000},
				{63209.783,14571.637,10.000},
				{64675.678,14658.955,10.000},
				{66149.128,14734.503,10.000},
				{67628.957,14798.290,10.000},
				{69113.989,14850.321,10.000},
				{70603.050,14890.602,10.000},
				{72094.963,14919.138,10.000},
				{73588.557,14935.932,10.000},
				{75082.655,14940.988,10.000},
				{76576.679,14940.235,10.000},
				{78070.639,14939.601,10.000},
				{79564.548,14939.086,10.000},
				{81058.416,14938.687,10.000},
				{82552.257,14938.403,10.000},
				{84046.080,14938.233,10.000},
				{85539.898,14938.176,10.000},
				{87033.720,14938.229,10.000},
				{88527.560,14938.393,10.000},
				{90021.426,14938.664,10.000},
				{91515.330,14939.042,10.000},
				{93009.283,14939.526,10.000},
				{94503.294,14940.113,10.000},
				{95997.374,14940.803,10.000},
				{97491.534,14941.594,10.000},
				{98985.782,14942.484,10.000},
				{100480.130,14943.473,10.000},
				{101974.585,14944.558,10.000},
				{103469.159,14945.738,10.000},
				{104963.860,14947.012,10.000},
				{106458.698,14948.379,10.000},
				{107953.682,14949.836,10.000},
				{109448.820,14951.382,10.000},
				{110944.122,14953.017,10.000},
				{112439.595,14954.737,10.000},
				{113935.250,14956.543,10.000},
				{115431.093,14958.432,10.000},
				{116927.133,14960.403,10.000},
				{118423.379,14962.454,10.000},
				{119919.837,14964.585,10.000},
				{121416.516,14966.793,10.000},
				{122913.424,14969.077,10.000},
				{124410.568,14971.435,10.000},
				{125907.954,14973.867,10.000},
				{127405.591,14976.370,10.000},
				{128903.486,14978.944,10.000},
				{130401.644,14981.585,10.000},
				{131900.074,14984.295,10.000},
				{133398.781,14987.069,10.000},
				{134897.771,14989.908,10.000},
				{136397.052,14992.810,10.000},
				{137896.630,14995.773,10.000},
				{139396.509,14998.795,10.000},
				{140896.697,15001.876,10.000},
				{142397.198,15005.014,10.000},
				{143898.019,15008.207,10.000},
				{145399.164,15011.454,10.000},
				{146900.640,15014.754,10.000},
				{148402.450,15018.104,10.000},
				{149904.601,15021.504,10.000},
				{151407.096,15024.952,10.000},
				{152909.941,15028.447,10.000},
				{154413.139,15031.987,10.000},
				{155916.696,15035.570,10.000},
				{157420.616,15039.196,10.000},
				{158924.902,15042.863,10.000},
				{160429.559,15046.569,10.000},
				{161934.590,15050.313,10.000},
				{163440.000,15054.093,10.000},
				{164945.790,15057.909,10.000},
				{166451.966,15061.758,10.000},
				{167958.530,15065.639,10.000},
				{169465.485,15069.552,10.000},
				{170972.835,15073.493,10.000},
				{172480.581,15077.463,10.000},
				{173988.727,15081.459,10.000},
				{175497.275,15085.481,10.000},
				{177006.228,15089.526,10.000},
				{178515.587,15093.594,10.000},
				{180025.355,15097.682,10.000},
				{181535.534,15101.790,10.000},
				{183046.126,15105.917,10.000},
				{184557.132,15110.060,10.000},
				{186068.554,15114.218,10.000},
				{187580.393,15118.390,10.000},
				{189092.650,15122.575,10.000},
				{190605.327,15126.772,10.000},
				{192118.425,15130.977,10.000},
				{193631.944,15135.192,10.000},
				{195145.886,15139.413,10.000},
				{196660.250,15143.640,10.000},
				{198175.037,15147.871,10.000},
				{199690.247,15152.106,10.000},
				{201205.882,15156.341,10.000},
				{202721.939,15160.577,10.000},
				{204238.420,15164.811,10.000},
				{205755.325,15169.043,10.000},
				{207272.652,15173.271,10.000},
				{208790.401,15177.493,10.000},
				{210308.572,15181.708,10.000},
				{211827.163,15185.916,10.000},
				{213346.175,15190.113,10.000},
				{214865.605,15194.300,10.000},
				{216385.452,15198.474,10.000},
				{217905.716,15202.634,10.000},
				{219426.394,15206.780,10.000},
				{220947.484,15210.909,10.000},
				{222468.986,15215.019,10.000},
				{223990.897,15219.111,10.000},
				{225513.216,15223.181,10.000},
				{227035.939,15227.230,10.000},
				{228559.064,15231.255,10.000},
				{230082.589,15235.255,10.000},
				{231606.512,15239.228,10.000},
				{233130.830,15243.174,10.000},
				{234655.539,15247.091,10.000},
				{236180.636,15250.977,10.000},
				{237706.120,15254.831,10.000},
				{239231.985,15258.651,10.000},
				{240758.228,15262.437,10.000},
				{242284.847,15266.186,10.000},
				{243811.837,15269.897,10.000},
				{245339.194,15273.570,10.000},
				{246866.914,15277.201,10.000},
				{248394.993,15280.791,10.000},
				{249923.427,15284.337,10.000},
				{251452.210,15287.838,10.000},
				{252981.340,15291.293,10.000},
				{254510.810,15294.700,10.000},
				{256040.615,15298.057,10.000},
				{257570.752,15301.364,10.000},
				{259101.214,15304.619,10.000},
				{260631.996,15307.820,10.000},
				{262163.092,15310.965,10.000},
				{263694.498,15314.055,10.000},
				{265226.206,15317.086,10.000},
				{266758.212,15320.057,10.000},
				{268290.509,15322.968,10.000},
				{269823.090,15325.815,10.000},
				{271355.950,15328.599,10.000},
				{272889.082,15331.318,10.000},
				{274422.479,15333.970,10.000},
				{275956.134,15336.553,10.000},
				{277490.041,15339.066,10.000},
				{279024.192,15341.508,10.000},
				{280558.579,15343.877,10.000},
				{282093.196,15346.172,10.000},
				{283628.035,15348.391,10.000},
				{285163.089,15350.532,10.000},
				{286698.348,15352.595,10.000},
				{288233.806,15354.578,10.000},
				{289769.454,15356.478,10.000},
				{291305.283,15358.296,10.000},
				{292841.286,15360.029,10.000},
				{294377.454,15361.676,10.000},
				{295913.777,15363.235,10.000},
				{297450.248,15364.705,10.000},
				{298986.856,15366.084,10.000},
				{300523.593,15367.371,10.000},
				{302060.450,15368.565,10.000},
				{303597.416,15369.664,10.000},
				{305134.483,15370.666,10.000},
				{306671.640,15371.571,10.000},
				{308208.878,15372.376,10.000},
				{309746.186,15373.080,10.000},
				{311283.554,15373.682,10.000},
				{312820.972,15374.181,10.000},
				{314358.429,15374.574,10.000},
				{315895.915,15374.861,10.000},
				{317433.419,15375.040,10.000},
				{318970.930,15375.109,10.000},
				{320508.437,15375.068,10.000},
				{322045.928,15374.914,10.000},
				{323583.393,15374.646,10.000},
				{325120.820,15374.264,10.000},
				{326658.196,15373.765,10.000},
				{328195.511,15373.148,10.000},
				{329732.752,15372.412,10.000},
				{331269.908,15371.556,10.000},
				{332806.965,15370.577,10.000},
				{334343.913,15369.475,10.000},
				{335880.738,15368.249,10.000},
				{337417.427,15366.896,10.000},
				{338953.969,15365.415,10.000},
				{340490.350,15363.806,10.000},
				{342026.556,15362.067,10.000},
				{343562.576,15360.196,10.000},
				{345098.395,15358.192,10.000},
				{346634.000,15356.054,10.000},
				{348169.378,15353.780,10.000},
				{349704.515,15351.369,10.000},
				{351239.397,15348.821,10.000},
				{352774.011,15346.132,10.000},
				{354308.341,15343.303,10.000},
				{355842.374,15340.331,10.000},
				{357376.096,15337.216,10.000},
				{358909.491,15333.956,10.000},
				{360442.546,15330.549,10.000},
				{361975.246,15326.995,10.000},
				{363507.575,15323.292,10.000},
				{365039.519,15319.439,10.000},
				{366571.062,15315.434,10.000},
				{368102.190,15311.277,10.000},
				{369632.886,15306.965,10.000},
				{371163.136,15302.497,10.000},
				{372692.923,15297.873,10.000},
				{374222.232,15293.090,10.000},
				{375751.047,15288.148,10.000},
				{377279.352,15283.044,10.000},
				{378807.129,15277.778,10.000},
				{380334.364,15272.349,10.000},
				{381861.040,15266.754,10.000},
				{383387.139,15260.992,10.000},
				{384912.645,15255.063,10.000},
				{386437.542,15248.964,10.000},
				{387961.811,15242.695,10.000},
				{389485.436,15236.253,10.000},
				{391008.400,15229.637,10.000},
				{392530.685,15222.847,10.000},
				{394052.273,15215.879,10.000},
				{395573.146,15208.734,10.000},
				{397093.287,15201.409,10.000},
				{398612.677,15193.902,10.000},
				{400131.298,15186.214,10.000},
				{401649.132,15178.341,10.000},
				{403166.161,15170.282,10.000},
				{404682.364,15162.036,10.000},
				{406185.575,15032.113,10.000},
				{407658.028,14724.529,10.000},
				{409104.202,14461.738,10.000},
				{410528.786,14245.840,10.000},
				{411936.288,14075.016,10.000},
				{413331.003,13947.155,10.000},
				{414716.996,13859.924,10.000},
				{416098.080,13810.840,10.000},
				{417477.813,13797.331,10.000},
				{418859.492,13816.797,10.000},
				{420246.159,13866.666,10.000},
				{421640.604,13944.447,10.000},
				{423045.381,14047.773,10.000},
				{424462.825,14174.439,10.000},
				{425895.068,14322.430,10.000},
				{427343.926,14488.580,10.000},
				{428810.463,14665.371,10.000},
				{430295.110,14846.474,10.000},
				{431798.108,15029.980,10.000},
				{433319.517,15214.083,10.000},
				{434859.223,15397.062,10.000},
				{436416.950,15577.272,10.000},
				{437992.261,15753.109,10.000},
				{439584.559,15922.978,10.000},
				{441193.085,16085.258,10.000},
				{442816.910,16238.257,10.000},
				{444454.928,16380.178,10.000},
				{446105.836,16509.080,10.000},
				{447768.121,16622.847,10.000},
				{449440.039,16719.178,10.000},
				{451119.770,16797.315,10.000},
				{452805.993,16862.226,10.000},
				{454497.748,16917.548,10.000},
				{456193.879,16961.311,10.000},
				{457893.023,16991.440,10.000},
				{459593.603,17005.807,10.000},
				{461293.833,17002.295,10.000},
				{462991.720,16978.870,10.000},
				{464685.087,16933.675,10.000},
				{466371.598,16865.104,10.000},
				{468048.787,16771.897,10.000},
				{469714.107,16653.199,10.000},
				{471364.969,16508.619,10.000},
				{472998.795,16338.259,10.000},
				{474613.066,16142.710,10.000},
				{476205.370,15923.037,10.000},
				{477773.442,15680.723,10.000},
				{479315.203,15417.606,10.000},
				{480828.782,15135.795,10.000},
				{482312.540,14837.580,10.000},
				{483765.076,14525.352,10.000},
				{485185.227,14201.511,10.000},
				{486572.067,13868.401,10.000},
				{487924.892,13528.252,10.000},
				{489243.205,13183.133,10.000},
				{490526.697,12834.921,10.000},
				{491775.227,12485.291,10.000},
				{492988.797,12135.700,10.000},
				{494167.536,11787.399,10.000},
				{495311.680,11441.437,10.000},
				{496421.548,11098.680,10.000},
				{497497.530,10759.822,10.000},
				{498540.071,10425.411,10.000},
				{499549.657,10095.861,10.000},
				{500526.805,9771.476,10.000},
				{501472.051,9452.464,10.000},
				{502385.947,9138.956,10.000},
				{503269.049,8831.016,10.000},
				{504121.914,8528.657,10.000},
				{504945.099,8231.849,10.000},
				{505739.153,7940.533,10.000},
				{506504.615,7654.621,10.000},
				{507242.016,7374.010,10.000},
				{507951.874,7098.583,10.000},
				{508634.696,6828.216,10.000},
				{509290.973,6562.776,10.000},
				{509921.186,6302.130,10.000},
				{510525.800,6046.143,10.000},
				{511105.269,5794.681,10.000},
				{511660.030,5547.610,10.000},
				{512190.509,5304.798,10.000},
				{512697.121,5066.115,10.000},
				{513180.264,4831.433,10.000},
				{513640.327,4600.624,10.000},
				{514077.683,4373.565,10.000},
				{514492.696,4150.128,10.000},
				{514885.715,3930.189,10.000},
				{515257.077,3713.622,10.000},
				{515607.107,3500.299,10.000},
				{515936.116,3290.091,10.000},
				{516244.403,3082.866,10.000},
				{516532.251,2878.487,10.000},
				{516799.933,2676.816,10.000},
				{517047.704,2477.708,10.000},
				{517275.805,2281.015,10.000},
				{517484.464,2086.583,10.000},
				{517673.889,1894.252,10.000},
				{517844.275,1703.859,10.000},
				{517995.798,1515.234,10.000},
				{518128.762,1329.634,10.000},
				{518244.055,1152.938,10.000},
				{518343.009,989.540,10.000},
				{518426.929,839.192,10.000},
				{518497.096,701.675,10.000},
				{518554.777,576.807,10.000},
				{518601.220,464.432,10.000},
				{518637.662,364.423,10.000},
				{518665.330,276.680,10.000},
				{518685.443,201.123,10.000},
				{518699.212,137.693,10.000},
				{518707.847,86.348,10.000},
				{518712.553,47.060,10.000},
				{518714.534,19.814,10.000},
				{518714.994,4.600,10.000},
				{518714.994,0.000,10.000}
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