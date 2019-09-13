package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class RightScale extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (19.00,0.00,0.00)
	// (22.50,0.50,45.00)
	
	public RightScale() {
		this(false);
	}
			
    public RightScale(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.587,11.749,10.000},
				{2.937,23.499,10.000},
				{8.225,52.872,10.000},
				{17.624,93.995,10.000},
				{32.311,146.867,10.000},
				{53.459,211.488,10.000},
				{82.245,287.859,10.000},
				{119.843,375.979,10.000},
				{167.428,475.848,10.000},
				{226.175,587.467,10.000},
				{297.258,710.835,10.000},
				{381.853,845.952,10.000},
				{480.548,986.944,10.000},
				{593.341,1127.936,10.000},
				{720.234,1268.928,10.000},
				{861.226,1409.920,10.000},
				{1016.318,1550.912,10.000},
				{1185.508,1691.904,10.000},
				{1368.798,1832.896,10.000},
				{1566.186,1973.888,10.000},
				{1777.675,2114.880,10.000},
				{2003.262,2255.873,10.000},
				{2242.948,2396.865,10.000},
				{2496.734,2537.857,10.000},
				{2764.619,2678.849,10.000},
				{3046.603,2819.841,10.000},
				{3342.686,2960.833,10.000},
				{3652.869,3101.825,10.000},
				{3977.150,3242.817,10.000},
				{4315.531,3383.809,10.000},
				{4668.011,3524.801,10.000},
				{5034.591,3665.793,10.000},
				{5415.269,3806.785,10.000},
				{5810.047,3947.777,10.000},
				{6218.924,4088.769,10.000},
				{6641.900,4229.761,10.000},
				{7078.975,4370.753,10.000},
				{7530.149,4511.745,10.000},
				{7995.423,4652.737,10.000},
				{8474.796,4793.729,10.000},
				{8968.268,4934.721,10.000},
				{9475.840,5075.713,10.000},
				{9997.510,5216.705,10.000},
				{10533.280,5357.697,10.000},
				{11083.149,5498.689,10.000},
				{11647.117,5639.681,10.000},
				{12225.184,5780.673,10.000},
				{12817.351,5921.665,10.000},
				{13423.616,6062.657,10.000},
				{14043.981,6203.649,10.000},
				{14678.446,6344.641,10.000},
				{15327.009,6485.634,10.000},
				{15989.671,6626.626,10.000},
				{16666.433,6767.618,10.000},
				{17357.294,6908.610,10.000},
				{18062.254,7049.602,10.000},
				{18781.314,7190.594,10.000},
				{19514.472,7331.586,10.000},
				{20261.730,7472.578,10.000},
				{21023.087,7613.570,10.000},
				{21798.543,7754.562,10.000},
				{22588.099,7895.554,10.000},
				{23391.753,8036.546,10.000},
				{24209.507,8177.538,10.000},
				{25041.360,8318.530,10.000},
				{25887.312,8459.522,10.000},
				{26747.364,8600.514,10.000},
				{27621.514,8741.506,10.000},
				{28509.764,8882.498,10.000},
				{29412.113,9023.490,10.000},
				{30328.561,9164.482,10.000},
				{31259.109,9305.474,10.000},
				{32203.755,9446.466,10.000},
				{33162.501,9587.458,10.000},
				{34135.346,9728.450,10.000},
				{35122.290,9869.442,10.000},
				{36123.334,10010.434,10.000},
				{37138.476,10151.426,10.000},
				{38167.718,10292.418,10.000},
				{39211.059,10433.410,10.000},
				{40268.500,10574.402,10.000},
				{41340.039,10715.395,10.000},
				{42425.678,10856.387,10.000},
				{43525.416,10997.379,10.000},
				{44639.253,11138.371,10.000},
				{45767.189,11279.363,10.000},
				{46908.637,11414.480,10.000},
				{48062.422,11537.848,10.000},
				{49227.368,11649.467,10.000},
				{50402.302,11749.336,10.000},
				{51586.048,11837.456,10.000},
				{52777.430,11913.827,10.000},
				{53975.275,11978.448,10.000},
				{55178.407,12031.320,10.000},
				{56385.651,12072.443,10.000},
				{57595.833,12101.816,10.000},
				{58807.777,12119.440,10.000},
				{60020.308,12125.315,10.000},
				{61232.840,12125.315,10.000},
				{62445.371,12125.315,10.000},
				{63657.903,12125.315,10.000},
				{64870.434,12125.315,10.000},
				{66082.966,12125.315,10.000},
				{67295.497,12125.315,10.000},
				{68508.029,12125.315,10.000},
				{69720.560,12125.315,10.000},
				{70933.092,12125.315,10.000},
				{72145.623,12125.315,10.000},
				{73358.155,12125.315,10.000},
				{74570.686,12125.315,10.000},
				{75783.218,12125.315,10.000},
				{76995.749,12125.315,10.000},
				{78208.281,12125.315,10.000},
				{79420.812,12125.315,10.000},
				{80633.344,12125.315,10.000},
				{81845.875,12125.315,10.000},
				{83058.407,12125.315,10.000},
				{84270.938,12125.315,10.000},
				{85483.470,12125.315,10.000},
				{86696.001,12125.315,10.000},
				{87908.533,12125.315,10.000},
				{89121.064,12125.315,10.000},
				{90333.596,12125.315,10.000},
				{91546.127,12125.315,10.000},
				{92758.658,12125.315,10.000},
				{93971.190,12125.315,10.000},
				{95183.721,12125.315,10.000},
				{96396.253,12125.315,10.000},
				{97608.784,12125.315,10.000},
				{98821.316,12125.315,10.000},
				{100033.847,12125.315,10.000},
				{101246.379,12125.315,10.000},
				{102458.910,12125.315,10.000},
				{103671.442,12125.315,10.000},
				{104883.973,12125.315,10.000},
				{106096.505,12125.315,10.000},
				{107309.036,12125.315,10.000},
				{108521.568,12125.315,10.000},
				{109734.099,12125.315,10.000},
				{110946.631,12125.315,10.000},
				{112159.162,12125.315,10.000},
				{113371.694,12125.315,10.000},
				{114584.225,12125.315,10.000},
				{115796.757,12125.315,10.000},
				{117009.288,12125.315,10.000},
				{118221.820,12125.315,10.000},
				{119434.351,12125.315,10.000},
				{120646.883,12125.315,10.000},
				{121859.414,12125.315,10.000},
				{123071.946,12125.315,10.000},
				{124284.477,12125.315,10.000},
				{125497.009,12125.315,10.000},
				{126709.540,12125.315,10.000},
				{127922.071,12125.315,10.000},
				{129134.603,12125.315,10.000},
				{130347.134,12125.315,10.000},
				{131559.666,12125.315,10.000},
				{132772.197,12125.315,10.000},
				{133984.729,12125.315,10.000},
				{135197.260,12125.315,10.000},
				{136409.792,12125.315,10.000},
				{137622.323,12125.315,10.000},
				{138834.855,12125.315,10.000},
				{140047.386,12125.315,10.000},
				{141259.918,12125.315,10.000},
				{142472.449,12125.315,10.000},
				{143684.981,12125.315,10.000},
				{144897.512,12125.315,10.000},
				{146110.044,12125.315,10.000},
				{147322.575,12125.315,10.000},
				{148535.107,12125.315,10.000},
				{149747.638,12125.315,10.000},
				{150960.170,12125.315,10.000},
				{152172.701,12125.315,10.000},
				{153385.233,12125.315,10.000},
				{154597.764,12125.315,10.000},
				{155810.296,12125.315,10.000},
				{157022.827,12125.315,10.000},
				{158235.359,12125.315,10.000},
				{159447.890,12125.315,10.000},
				{160660.422,12125.315,10.000},
				{161872.953,12125.315,10.000},
				{163085.484,12125.315,10.000},
				{164298.016,12125.315,10.000},
				{165510.547,12125.315,10.000},
				{166723.079,12125.315,10.000},
				{167935.610,12125.315,10.000},
				{169148.142,12125.315,10.000},
				{170360.673,12125.315,10.000},
				{171573.205,12125.315,10.000},
				{172785.736,12125.315,10.000},
				{173998.268,12125.315,10.000},
				{175210.799,12125.315,10.000},
				{176423.331,12125.315,10.000},
				{177635.862,12125.315,10.000},
				{178848.394,12125.315,10.000},
				{180060.925,12125.315,10.000},
				{181273.457,12125.315,10.000},
				{182485.988,12125.315,10.000},
				{183698.520,12125.315,10.000},
				{184911.051,12125.315,10.000},
				{186123.583,12125.315,10.000},
				{187336.114,12125.315,10.000},
				{188548.646,12125.315,10.000},
				{189761.177,12125.315,10.000},
				{190973.709,12125.315,10.000},
				{192186.240,12125.315,10.000},
				{193398.772,12125.315,10.000},
				{194611.303,12125.315,10.000},
				{195823.835,12125.315,10.000},
				{197036.366,12125.315,10.000},
				{198248.898,12125.315,10.000},
				{199461.429,12125.315,10.000},
				{200673.960,12125.315,10.000},
				{201886.492,12125.315,10.000},
				{203099.023,12125.315,10.000},
				{204311.555,12125.315,10.000},
				{205524.086,12125.315,10.000},
				{206736.618,12125.315,10.000},
				{207949.149,12125.315,10.000},
				{209161.681,12125.315,10.000},
				{210374.212,12125.315,10.000},
				{211586.744,12125.315,10.000},
				{212799.275,12125.315,10.000},
				{214011.807,12125.315,10.000},
				{215224.338,12125.315,10.000},
				{216436.870,12125.315,10.000},
				{217649.401,12125.315,10.000},
				{218861.933,12125.315,10.000},
				{220074.464,12125.315,10.000},
				{221286.996,12125.315,10.000},
				{222499.527,12125.315,10.000},
				{223712.059,12125.315,10.000},
				{224924.590,12125.315,10.000},
				{226137.122,12125.315,10.000},
				{227349.653,12125.315,10.000},
				{228562.185,12125.315,10.000},
				{229774.716,12125.315,10.000},
				{230987.248,12125.315,10.000},
				{232199.779,12125.315,10.000},
				{233412.311,12125.315,10.000},
				{234624.842,12125.315,10.000},
				{235837.373,12125.315,10.000},
				{237049.905,12125.315,10.000},
				{238262.436,12125.315,10.000},
				{239474.968,12125.315,10.000},
				{240687.499,12125.315,10.000},
				{241900.031,12125.315,10.000},
				{243112.562,12125.315,10.000},
				{244325.094,12125.315,10.000},
				{245537.625,12125.315,10.000},
				{246750.157,12125.315,10.000},
				{247962.688,12125.315,10.000},
				{249175.220,12125.315,10.000},
				{250387.751,12125.315,10.000},
				{251600.283,12125.315,10.000},
				{252812.814,12125.315,10.000},
				{254025.346,12125.315,10.000},
				{255237.877,12125.315,10.000},
				{256450.409,12125.315,10.000},
				{257662.940,12125.315,10.000},
				{258875.472,12125.315,10.000},
				{260088.003,12125.315,10.000},
				{261300.535,12125.315,10.000},
				{262513.066,12125.315,10.000},
				{263725.598,12125.315,10.000},
				{264938.129,12125.315,10.000},
				{266150.661,12125.315,10.000},
				{267363.192,12125.315,10.000},
				{268575.724,12125.315,10.000},
				{269788.255,12125.315,10.000},
				{271000.787,12125.315,10.000},
				{272213.318,12125.315,10.000},
				{273425.849,12125.315,10.000},
				{274638.381,12125.315,10.000},
				{275850.912,12125.315,10.000},
				{277063.444,12125.315,10.000},
				{278275.975,12125.315,10.000},
				{279488.507,12125.315,10.000},
				{280701.038,12125.315,10.000},
				{281913.570,12125.315,10.000},
				{283126.101,12125.315,10.000},
				{284338.633,12125.315,10.000},
				{285551.164,12125.315,10.000},
				{286763.696,12125.315,10.000},
				{287976.227,12125.315,10.000},
				{289188.759,12125.315,10.000},
				{290401.290,12125.315,10.000},
				{291613.822,12125.315,10.000},
				{292826.353,12125.315,10.000},
				{294038.885,12125.315,10.000},
				{295251.416,12125.315,10.000},
				{296463.948,12125.315,10.000},
				{297676.479,12125.315,10.000},
				{298889.011,12125.315,10.000},
				{300101.542,12125.315,10.000},
				{301314.074,12125.315,10.000},
				{302526.605,12125.315,10.000},
				{303739.137,12125.315,10.000},
				{304951.668,12125.315,10.000},
				{306164.200,12125.315,10.000},
				{307376.731,12125.315,10.000},
				{308589.262,12125.315,10.000},
				{309801.794,12125.315,10.000},
				{311014.325,12125.315,10.000},
				{312226.857,12125.315,10.000},
				{313439.388,12125.315,10.000},
				{314651.920,12125.315,10.000},
				{315864.451,12125.315,10.000},
				{317076.983,12125.315,10.000},
				{318289.514,12125.315,10.000},
				{319502.046,12125.315,10.000},
				{320714.577,12125.315,10.000},
				{321927.109,12125.315,10.000},
				{323139.640,12125.315,10.000},
				{324352.172,12125.315,10.000},
				{325564.703,12125.315,10.000},
				{326777.235,12125.315,10.000},
				{327989.766,12125.315,10.000},
				{329202.298,12125.315,10.000},
				{330414.829,12125.315,10.000},
				{331627.361,12125.315,10.000},
				{332839.892,12125.315,10.000},
				{334052.424,12125.315,10.000},
				{335264.955,12125.315,10.000},
				{336477.487,12125.315,10.000},
				{337690.018,12125.315,10.000},
				{338902.550,12125.315,10.000},
				{340115.081,12125.315,10.000},
				{341327.613,12125.315,10.000},
				{342540.144,12125.315,10.000},
				{343752.675,12125.315,10.000},
				{344965.207,12125.315,10.000},
				{346177.738,12125.315,10.000},
				{347390.270,12125.315,10.000},
				{348602.801,12125.315,10.000},
				{349815.333,12125.315,10.000},
				{351027.864,12125.315,10.000},
				{352240.396,12125.315,10.000},
				{353452.927,12125.315,10.000},
				{354665.459,12125.315,10.000},
				{355877.990,12125.315,10.000},
				{357090.522,12125.315,10.000},
				{358303.053,12125.315,10.000},
				{359515.585,12125.315,10.000},
				{360728.116,12125.315,10.000},
				{361940.648,12125.315,10.000},
				{363153.179,12125.315,10.000},
				{364365.711,12125.315,10.000},
				{365578.242,12125.315,10.000},
				{366790.774,12125.315,10.000},
				{368003.305,12125.315,10.000},
				{369215.837,12125.315,10.000},
				{370428.368,12125.315,10.000},
				{371640.900,12125.315,10.000},
				{372853.431,12125.315,10.000},
				{374065.963,12125.315,10.000},
				{375278.494,12125.315,10.000},
				{376491.026,12125.315,10.000},
				{377703.557,12125.315,10.000},
				{378916.089,12125.315,10.000},
				{380128.620,12125.315,10.000},
				{381341.151,12125.315,10.000},
				{382553.683,12125.315,10.000},
				{383766.214,12125.315,10.000},
				{385002.807,12365.926,10.000},
				{386302.562,12997.553,10.000},
				{387657.338,13547.751,10.000},
				{389058.179,14008.419,10.000},
				{390496.414,14382.343,10.000},
				{391963.718,14673.045,10.000},
				{393452.192,14884.741,10.000},
				{394954.420,15022.279,10.000},
				{396463.526,15091.057,10.000},
				{397973.214,15096.884,10.000},
				{399477.795,15045.812,10.000},
				{400972.190,14943.944,10.000},
				{402451.914,14797.238,10.000},
				{403913.046,14611.327,10.000},
				{405351.736,14386.899,10.000},
				{406763.944,14122.076,10.000},
				{408145.883,13819.393,10.000},
				{409494.224,13483.408,10.000},
				{410806.038,13118.140,10.000},
				{412078.745,12727.068,10.000},
				{413310.062,12313.175,10.000},
				{414497.963,11879.013,10.000},
				{415640.642,11426.789,10.000},
				{416736.489,10958.472,10.000},
				{417784.079,10475.895,10.000},
				{418782.165,9980.865,10.000},
				{419730.008,9478.425,10.000},
				{420627.486,8974.776,10.000},
				{421474.728,8472.422,10.000},
				{422271.955,7972.270,10.000},
				{423019.512,7475.571,10.000},
				{423717.910,6983.982,10.000},
				{424367.872,6499.621,10.000},
				{424970.381,6025.086,10.000},
				{425526.726,5563.455,10.000},
				{426038.550,5118.242,10.000},
				{426507.882,4693.314,10.000},
				{426937.157,4292.756,10.000},
				{427329.226,3920.690,10.000},
				{427687.333,3581.062,10.000},
				{428015.073,3277.401,10.000},
				{428316.330,3012.577,10.000},
				{428595.189,2788.588,10.000},
				{428855.829,2606.395,10.000},
				{429102.412,2465.829,10.000},
				{429338.970,2365.589,10.000},
				{429569.302,2303.316,10.000},
				{429796.877,2275.748,10.000},
				{430024.770,2278.934,10.000},
				{430255.617,2308.465,10.000},
				{430491.588,2359.716,10.000},
				{430734.395,2428.068,10.000},
				{430985.305,2509.094,10.000},
				{431245.174,2598.695,10.000},
				{431514.494,2693.200,10.000},
				{431793.435,2789.413,10.000},
				{432081.899,2884.632,10.000},
				{432379.562,2976.633,10.000},
				{432685.926,3063.643,10.000},
				{433000.355,3144.290,10.000},
				{433322.111,3217.555,10.000},
				{433650.383,3282.719,10.000},
				{433984.314,3339.315,10.000},
				{434323.022,3387.080,10.000},
				{434665.613,3425.910,10.000},
				{435011.196,3455.832,10.000},
				{435358.893,3476.967,10.000},
				{435707.844,3489.507,10.000},
				{436057.213,3493.694,10.000},
				{436406.194,3489.803,10.000},
				{436754.006,3478.129,10.000},
				{437099.904,3458.978,10.000},
				{437443.170,3432.657,10.000},
				{437783.117,3399.470,10.000},
				{438119.088,3359.712,10.000},
				{438450.455,3313.668,10.000},
				{438776.616,3261.613,10.000},
				{439096.997,3203.805,10.000},
				{439411.046,3140.492,10.000},
				{439718.237,3071.907,10.000},
				{440018.064,2998.270,10.000},
				{440310.043,2919.792,10.000},
				{440593.710,2836.671,10.000},
				{440868.620,2749.097,10.000},
				{441134.345,2657.253,10.000},
				{441390.477,2561.315,10.000},
				{441636.622,2461.453,10.000},
				{441872.406,2357.836,10.000},
				{442097.468,2250.628,10.000},
				{442311.468,2139.996,10.000},
				{442514.078,2026.104,10.000},
				{442704.990,1909.119,10.000},
				{442883.911,1789.211,10.000},
				{443050.566,1666.552,10.000},
				{443204.699,1541.321,10.000},
				{443346.068,1413.698,10.000},
				{443474.455,1283.870,10.000},
				{443589.658,1152.030,10.000},
				{443691.496,1018.375,10.000},
				{443779.807,883.108,10.000},
				{443854.827,750.202,10.000},
				{443917.401,625.738,10.000},
				{443968.606,512.055,10.000},
				{444009.547,409.405,10.000},
				{444041.345,317.989,10.000},
				{444065.142,237.969,10.000},
				{444082.089,169.469,10.000},
				{444093.347,112.579,10.000},
				{444100.084,67.363,10.000},
				{444103.470,33.861,10.000},
				{444104.679,12.094,10.000},
				{444104.886,2.073,10.000},
				{444104.886,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.587,11.749,10.000},
				{2.937,23.499,10.000},
				{8.225,52.872,10.000},
				{17.624,93.995,10.000},
				{32.311,146.867,10.000},
				{53.459,211.488,10.000},
				{82.245,287.859,10.000},
				{119.843,375.979,10.000},
				{167.428,475.848,10.000},
				{226.175,587.467,10.000},
				{297.258,710.835,10.000},
				{381.853,845.952,10.000},
				{480.548,986.944,10.000},
				{593.341,1127.936,10.000},
				{720.234,1268.928,10.000},
				{861.226,1409.920,10.000},
				{1016.318,1550.912,10.000},
				{1185.508,1691.904,10.000},
				{1368.798,1832.896,10.000},
				{1566.186,1973.888,10.000},
				{1777.675,2114.880,10.000},
				{2003.262,2255.873,10.000},
				{2242.948,2396.865,10.000},
				{2496.734,2537.857,10.000},
				{2764.619,2678.849,10.000},
				{3046.603,2819.841,10.000},
				{3342.686,2960.833,10.000},
				{3652.869,3101.825,10.000},
				{3977.150,3242.817,10.000},
				{4315.531,3383.809,10.000},
				{4668.011,3524.801,10.000},
				{5034.591,3665.793,10.000},
				{5415.269,3806.785,10.000},
				{5810.047,3947.777,10.000},
				{6218.924,4088.769,10.000},
				{6641.900,4229.761,10.000},
				{7078.975,4370.753,10.000},
				{7530.149,4511.745,10.000},
				{7995.423,4652.737,10.000},
				{8474.796,4793.729,10.000},
				{8968.268,4934.721,10.000},
				{9475.840,5075.713,10.000},
				{9997.510,5216.705,10.000},
				{10533.280,5357.697,10.000},
				{11083.149,5498.689,10.000},
				{11647.117,5639.681,10.000},
				{12225.184,5780.673,10.000},
				{12817.351,5921.665,10.000},
				{13423.616,6062.657,10.000},
				{14043.981,6203.649,10.000},
				{14678.446,6344.641,10.000},
				{15327.009,6485.634,10.000},
				{15989.671,6626.626,10.000},
				{16666.433,6767.618,10.000},
				{17357.294,6908.610,10.000},
				{18062.254,7049.602,10.000},
				{18781.314,7190.594,10.000},
				{19514.472,7331.586,10.000},
				{20261.730,7472.578,10.000},
				{21023.087,7613.570,10.000},
				{21798.543,7754.562,10.000},
				{22588.099,7895.554,10.000},
				{23391.753,8036.546,10.000},
				{24209.507,8177.538,10.000},
				{25041.360,8318.530,10.000},
				{25887.312,8459.522,10.000},
				{26747.364,8600.514,10.000},
				{27621.514,8741.506,10.000},
				{28509.764,8882.498,10.000},
				{29412.113,9023.490,10.000},
				{30328.561,9164.482,10.000},
				{31259.109,9305.474,10.000},
				{32203.755,9446.466,10.000},
				{33162.501,9587.458,10.000},
				{34135.346,9728.450,10.000},
				{35122.290,9869.442,10.000},
				{36123.334,10010.434,10.000},
				{37138.476,10151.426,10.000},
				{38167.718,10292.418,10.000},
				{39211.059,10433.410,10.000},
				{40268.500,10574.402,10.000},
				{41340.039,10715.395,10.000},
				{42425.678,10856.387,10.000},
				{43525.416,10997.379,10.000},
				{44639.253,11138.371,10.000},
				{45767.189,11279.363,10.000},
				{46908.637,11414.480,10.000},
				{48062.422,11537.848,10.000},
				{49227.368,11649.467,10.000},
				{50402.302,11749.336,10.000},
				{51586.048,11837.456,10.000},
				{52777.430,11913.827,10.000},
				{53975.275,11978.448,10.000},
				{55178.407,12031.320,10.000},
				{56385.651,12072.443,10.000},
				{57595.833,12101.816,10.000},
				{58807.777,12119.440,10.000},
				{60020.308,12125.315,10.000},
				{61232.840,12125.315,10.000},
				{62445.371,12125.315,10.000},
				{63657.903,12125.315,10.000},
				{64870.434,12125.315,10.000},
				{66082.966,12125.315,10.000},
				{67295.497,12125.315,10.000},
				{68508.029,12125.315,10.000},
				{69720.560,12125.315,10.000},
				{70933.092,12125.315,10.000},
				{72145.623,12125.315,10.000},
				{73358.155,12125.315,10.000},
				{74570.686,12125.315,10.000},
				{75783.218,12125.315,10.000},
				{76995.749,12125.315,10.000},
				{78208.281,12125.315,10.000},
				{79420.812,12125.315,10.000},
				{80633.344,12125.315,10.000},
				{81845.875,12125.315,10.000},
				{83058.407,12125.315,10.000},
				{84270.938,12125.315,10.000},
				{85483.470,12125.315,10.000},
				{86696.001,12125.315,10.000},
				{87908.533,12125.315,10.000},
				{89121.064,12125.315,10.000},
				{90333.596,12125.315,10.000},
				{91546.127,12125.315,10.000},
				{92758.658,12125.315,10.000},
				{93971.190,12125.315,10.000},
				{95183.721,12125.315,10.000},
				{96396.253,12125.315,10.000},
				{97608.784,12125.315,10.000},
				{98821.316,12125.315,10.000},
				{100033.847,12125.315,10.000},
				{101246.379,12125.315,10.000},
				{102458.910,12125.315,10.000},
				{103671.442,12125.315,10.000},
				{104883.973,12125.315,10.000},
				{106096.505,12125.315,10.000},
				{107309.036,12125.315,10.000},
				{108521.568,12125.315,10.000},
				{109734.099,12125.315,10.000},
				{110946.631,12125.315,10.000},
				{112159.162,12125.315,10.000},
				{113371.694,12125.315,10.000},
				{114584.225,12125.315,10.000},
				{115796.757,12125.315,10.000},
				{117009.288,12125.315,10.000},
				{118221.820,12125.315,10.000},
				{119434.351,12125.315,10.000},
				{120646.883,12125.315,10.000},
				{121859.414,12125.315,10.000},
				{123071.946,12125.315,10.000},
				{124284.477,12125.315,10.000},
				{125497.009,12125.315,10.000},
				{126709.540,12125.315,10.000},
				{127922.071,12125.315,10.000},
				{129134.603,12125.315,10.000},
				{130347.134,12125.315,10.000},
				{131559.666,12125.315,10.000},
				{132772.197,12125.315,10.000},
				{133984.729,12125.315,10.000},
				{135197.260,12125.315,10.000},
				{136409.792,12125.315,10.000},
				{137622.323,12125.315,10.000},
				{138834.855,12125.315,10.000},
				{140047.386,12125.315,10.000},
				{141259.918,12125.315,10.000},
				{142472.449,12125.315,10.000},
				{143684.981,12125.315,10.000},
				{144897.512,12125.315,10.000},
				{146110.044,12125.315,10.000},
				{147322.575,12125.315,10.000},
				{148535.107,12125.315,10.000},
				{149747.638,12125.315,10.000},
				{150960.170,12125.315,10.000},
				{152172.701,12125.315,10.000},
				{153385.233,12125.315,10.000},
				{154597.764,12125.315,10.000},
				{155810.296,12125.315,10.000},
				{157022.827,12125.315,10.000},
				{158235.359,12125.315,10.000},
				{159447.890,12125.315,10.000},
				{160660.422,12125.315,10.000},
				{161872.953,12125.315,10.000},
				{163085.484,12125.315,10.000},
				{164298.016,12125.315,10.000},
				{165510.547,12125.315,10.000},
				{166723.079,12125.315,10.000},
				{167935.610,12125.315,10.000},
				{169148.142,12125.315,10.000},
				{170360.673,12125.315,10.000},
				{171573.205,12125.315,10.000},
				{172785.736,12125.315,10.000},
				{173998.268,12125.315,10.000},
				{175210.799,12125.315,10.000},
				{176423.331,12125.315,10.000},
				{177635.862,12125.315,10.000},
				{178848.394,12125.315,10.000},
				{180060.925,12125.315,10.000},
				{181273.457,12125.315,10.000},
				{182485.988,12125.315,10.000},
				{183698.520,12125.315,10.000},
				{184911.051,12125.315,10.000},
				{186123.583,12125.315,10.000},
				{187336.114,12125.315,10.000},
				{188548.646,12125.315,10.000},
				{189761.177,12125.315,10.000},
				{190973.709,12125.315,10.000},
				{192186.240,12125.315,10.000},
				{193398.772,12125.315,10.000},
				{194611.303,12125.315,10.000},
				{195823.835,12125.315,10.000},
				{197036.366,12125.315,10.000},
				{198248.898,12125.315,10.000},
				{199461.429,12125.315,10.000},
				{200673.960,12125.315,10.000},
				{201886.492,12125.315,10.000},
				{203099.023,12125.315,10.000},
				{204311.555,12125.315,10.000},
				{205524.086,12125.315,10.000},
				{206736.618,12125.315,10.000},
				{207949.149,12125.315,10.000},
				{209161.681,12125.315,10.000},
				{210374.212,12125.315,10.000},
				{211586.744,12125.315,10.000},
				{212799.275,12125.315,10.000},
				{214011.807,12125.315,10.000},
				{215224.338,12125.315,10.000},
				{216436.870,12125.315,10.000},
				{217649.401,12125.315,10.000},
				{218861.933,12125.315,10.000},
				{220074.464,12125.315,10.000},
				{221286.996,12125.315,10.000},
				{222499.527,12125.315,10.000},
				{223712.059,12125.315,10.000},
				{224924.590,12125.315,10.000},
				{226137.122,12125.315,10.000},
				{227349.653,12125.315,10.000},
				{228562.185,12125.315,10.000},
				{229774.716,12125.315,10.000},
				{230987.248,12125.315,10.000},
				{232199.779,12125.315,10.000},
				{233412.311,12125.315,10.000},
				{234624.842,12125.315,10.000},
				{235837.373,12125.315,10.000},
				{237049.905,12125.315,10.000},
				{238262.436,12125.315,10.000},
				{239474.968,12125.315,10.000},
				{240687.499,12125.315,10.000},
				{241900.031,12125.315,10.000},
				{243112.562,12125.315,10.000},
				{244325.094,12125.315,10.000},
				{245537.625,12125.315,10.000},
				{246750.157,12125.315,10.000},
				{247962.688,12125.315,10.000},
				{249175.220,12125.315,10.000},
				{250387.751,12125.315,10.000},
				{251600.283,12125.315,10.000},
				{252812.814,12125.315,10.000},
				{254025.346,12125.315,10.000},
				{255237.877,12125.315,10.000},
				{256450.409,12125.315,10.000},
				{257662.940,12125.315,10.000},
				{258875.472,12125.315,10.000},
				{260088.003,12125.315,10.000},
				{261300.535,12125.315,10.000},
				{262513.066,12125.315,10.000},
				{263725.598,12125.315,10.000},
				{264938.129,12125.315,10.000},
				{266150.661,12125.315,10.000},
				{267363.192,12125.315,10.000},
				{268575.724,12125.315,10.000},
				{269788.255,12125.315,10.000},
				{271000.787,12125.315,10.000},
				{272213.318,12125.315,10.000},
				{273425.849,12125.315,10.000},
				{274638.381,12125.315,10.000},
				{275850.912,12125.315,10.000},
				{277063.444,12125.315,10.000},
				{278275.975,12125.315,10.000},
				{279488.507,12125.315,10.000},
				{280701.038,12125.315,10.000},
				{281913.570,12125.315,10.000},
				{283126.101,12125.315,10.000},
				{284338.633,12125.315,10.000},
				{285551.164,12125.315,10.000},
				{286763.696,12125.315,10.000},
				{287976.227,12125.315,10.000},
				{289188.759,12125.315,10.000},
				{290401.290,12125.315,10.000},
				{291613.822,12125.315,10.000},
				{292826.353,12125.315,10.000},
				{294038.885,12125.315,10.000},
				{295251.416,12125.315,10.000},
				{296463.948,12125.315,10.000},
				{297676.479,12125.315,10.000},
				{298889.011,12125.315,10.000},
				{300101.542,12125.315,10.000},
				{301314.074,12125.315,10.000},
				{302526.605,12125.315,10.000},
				{303739.137,12125.315,10.000},
				{304951.668,12125.315,10.000},
				{306164.200,12125.315,10.000},
				{307376.731,12125.315,10.000},
				{308589.262,12125.315,10.000},
				{309801.794,12125.315,10.000},
				{311014.325,12125.315,10.000},
				{312226.857,12125.315,10.000},
				{313439.388,12125.315,10.000},
				{314651.920,12125.315,10.000},
				{315864.451,12125.315,10.000},
				{317076.983,12125.315,10.000},
				{318289.514,12125.315,10.000},
				{319502.046,12125.315,10.000},
				{320714.577,12125.315,10.000},
				{321927.109,12125.315,10.000},
				{323139.640,12125.315,10.000},
				{324352.172,12125.315,10.000},
				{325564.703,12125.315,10.000},
				{326777.235,12125.315,10.000},
				{327989.766,12125.315,10.000},
				{329202.298,12125.315,10.000},
				{330414.829,12125.315,10.000},
				{331627.361,12125.315,10.000},
				{332839.892,12125.315,10.000},
				{334052.424,12125.315,10.000},
				{335264.955,12125.315,10.000},
				{336477.487,12125.315,10.000},
				{337690.018,12125.315,10.000},
				{338902.550,12125.315,10.000},
				{340115.081,12125.315,10.000},
				{341327.613,12125.315,10.000},
				{342540.144,12125.315,10.000},
				{343752.675,12125.315,10.000},
				{344965.207,12125.315,10.000},
				{346177.738,12125.315,10.000},
				{347390.270,12125.315,10.000},
				{348602.801,12125.315,10.000},
				{349815.333,12125.315,10.000},
				{351027.864,12125.315,10.000},
				{352240.396,12125.315,10.000},
				{353452.927,12125.315,10.000},
				{354665.459,12125.315,10.000},
				{355877.990,12125.315,10.000},
				{357090.522,12125.315,10.000},
				{358303.053,12125.315,10.000},
				{359515.585,12125.315,10.000},
				{360728.116,12125.315,10.000},
				{361940.648,12125.315,10.000},
				{363153.179,12125.315,10.000},
				{364365.711,12125.315,10.000},
				{365578.242,12125.315,10.000},
				{366790.774,12125.315,10.000},
				{368003.305,12125.315,10.000},
				{369215.837,12125.315,10.000},
				{370428.368,12125.315,10.000},
				{371640.900,12125.315,10.000},
				{372853.431,12125.315,10.000},
				{374065.963,12125.315,10.000},
				{375278.494,12125.315,10.000},
				{376491.026,12125.315,10.000},
				{377703.557,12125.315,10.000},
				{378916.089,12125.315,10.000},
				{380128.620,12125.315,10.000},
				{381341.151,12125.315,10.000},
				{382553.683,12125.315,10.000},
				{383766.214,12125.315,10.000},
				{384954.685,11884.702,10.000},
				{386079.990,11253.057,10.000},
				{387150.273,10702.828,10.000},
				{388174.485,10242.122,10.000},
				{389161.302,9868.161,10.000},
				{390119.044,9577.424,10.000},
				{391055.614,9365.701,10.000},
				{391978.428,9228.143,10.000},
				{392894.364,9159.355,10.000},
				{393809.717,9153.527,10.000},
				{394730.177,9204.607,10.000},
				{395660.826,9306.489,10.000},
				{396606.148,9453.215,10.000},
				{397570.063,9639.150,10.000},
				{398555.663,9856.001,10.000},
				{399565.052,10093.896,10.000},
				{400599.667,10346.150,10.000},
				{401660.488,10608.206,10.000},
				{402748.092,10876.043,10.000},
				{403862.710,11146.180,10.000},
				{405004.274,11415.635,10.000},
				{406172.459,11681.855,10.000},
				{407366.722,11942.631,10.000},
				{408586.322,12195.996,10.000},
				{409830.333,12440.116,10.000},
				{411097.652,12673.185,10.000},
				{412387.428,12897.763,10.000},
				{413699.368,13119.397,10.000},
				{415033.341,13339.732,10.000},
				{416389.127,13557.860,10.000},
				{417766.380,13772.532,10.000},
				{419164.589,13982.089,10.000},
				{420583.031,14184.417,10.000},
				{422020.723,14376.917,10.000},
				{423476.374,14556.512,10.000},
				{424948.343,14719.689,10.000},
				{426434.601,14862.583,10.000},
				{427932.712,14981.112,10.000},
				{429439.828,15071.153,10.000},
				{430952.704,15128.763,10.000},
				{432467.745,15150.414,10.000},
				{433981.069,15133.236,10.000},
				{435488.592,15075.233,10.000},
				{436986.137,14975.444,10.000},
				{438469.540,14834.036,10.000},
				{439934.772,14652.312,10.000},
				{441378.034,14432.629,10.000},
				{442795.859,14178.246,10.000},
				{444185.170,13893.114,10.000},
				{445543.334,13581.640,10.000},
				{446868.179,13248.449,10.000},
				{448157.995,12898.155,10.000},
				{449411.514,12535.189,10.000},
				{450627.878,12163.644,10.000},
				{451806.598,11787.195,10.000},
				{452947.501,11409.034,10.000},
				{454050.688,11031.865,10.000},
				{455116.478,10657.910,10.000},
				{456145.373,10288.943,10.000},
				{457138.006,9926.336,10.000},
				{458095.117,9571.109,10.000},
				{459017.515,9223.980,10.000},
				{459906.057,8885.416,10.000},
				{460761.625,8555.683,10.000},
				{461585.113,8234.881,10.000},
				{462377.412,7922.986,10.000},
				{463139.399,7619.876,10.000},
				{463871.935,7325.360,10.000},
				{464575.855,7039.196,10.000},
				{465251.966,6761.108,10.000},
				{465901.046,6490.803,10.000},
				{466523.843,6227.974,10.000},
				{467121.075,5972.314,10.000},
				{467693.427,5723.521,10.000},
				{468241.557,5481.297,10.000},
				{468766.093,5245.358,10.000},
				{469267.636,5015.431,10.000},
				{469746.761,4791.256,10.000},
				{470204.020,4572.587,10.000},
				{470639.939,4359.189,10.000},
				{471055.023,4150.842,10.000},
				{471449.757,3947.337,10.000},
				{471824.604,3748.474,10.000},
				{472180.010,3554.064,10.000},
				{472516.403,3363.924,10.000},
				{472834.191,3177.879,10.000},
				{473133.766,2995.757,10.000},
				{473415.505,2817.390,10.000},
				{473679.767,2642.614,10.000},
				{473926.893,2471.262,10.000},
				{474157.210,2303.170,10.000},
				{474371.027,2138.171,10.000},
				{474568.637,1976.095,10.000},
				{474750.314,1816.769,10.000},
				{474916.315,1660.017,10.000},
				{475066.881,1505.656,10.000},
				{475202.231,1353.499,10.000},
				{475322.566,1203.355,10.000},
				{475428.069,1055.026,10.000},
				{475518.900,908.309,10.000},
				{475595.583,766.834,10.000},
				{475659.210,636.270,10.000},
				{475711.052,518.422,10.000},
				{475752.357,413.041,10.000},
				{475784.349,319.924,10.000},
				{475808.240,238.910,10.000},
				{475825.227,169.874,10.000},
				{475836.500,112.727,10.000},
				{475843.241,67.405,10.000},
				{475846.628,33.869,10.000},
				{475847.837,12.095,10.000},
				{475848.044,2.073,10.000},
				{475848.044,0.000,10.000}
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