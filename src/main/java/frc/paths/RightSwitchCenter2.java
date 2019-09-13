package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class RightSwitchCenter2 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (4.50,-6.25,-5.00)
	
	public RightSwitchCenter2() {
		this(false);
	}
			
    public RightSwitchCenter2(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.598,-11.951,10.000},
				{-2.988,-23.903,10.000},
				{-8.366,-53.779,10.000},
				{-17.926,-95.602,10.000},
				{-32.862,-149.365,10.000},
				{-54.368,-215.056,10.000},
				{-83.634,-292.658,10.000},
				{-121.849,-382.150,10.000},
				{-170.199,-483.500,10.000},
				{-229.866,-596.670,10.000},
				{-302.027,-721.611,10.000},
				{-387.853,-858.265,10.000},
				{-488.509,-1006.560,10.000},
				{-605.151,-1166.414,10.000},
				{-738.924,-1337.732,10.000},
				{-890.371,-1514.466,10.000},
				{-1059.430,-1690.596,10.000},
				{-1246.035,-1866.052,10.000},
				{-1450.112,-2040.767,10.000},
				{-1671.579,-2214.674,10.000},
				{-1910.350,-2387.707,10.000},
				{-2166.330,-2559.799,10.000},
				{-2439.419,-2730.887,10.000},
				{-2729.509,-2900.903,10.000},
				{-3036.487,-3069.783,10.000},
				{-3360.233,-3237.459,10.000},
				{-3700.620,-3403.866,10.000},
				{-4057.513,-3568.933,10.000},
				{-4430.772,-3732.590,10.000},
				{-4820.249,-3894.766,10.000},
				{-5225.787,-4055.383,10.000},
				{-5647.223,-4214.363,10.000},
				{-6084.385,-4371.622,10.000},
				{-6537.092,-4527.070,10.000},
				{-7005.154,-4680.612,10.000},
				{-7488.368,-4832.147,10.000},
				{-7986.525,-4981.564,10.000},
				{-8499.399,-5128.741,10.000},
				{-9026.754,-5273.549,10.000},
				{-9568.338,-5415.844,10.000},
				{-10123.885,-5555.468,10.000},
				{-10693.110,-5692.248,10.000},
				{-11275.709,-5825.990,10.000},
				{-11871.357,-5956.483,10.000},
				{-12479.706,-6083.491,10.000},
				{-13100.381,-6206.749,10.000},
				{-13732.978,-6325.964,10.000},
				{-14377.059,-6440.810,10.000},
				{-15032.151,-6550.920,10.000},
				{-15697.739,-6655.883,10.000},
				{-16373.263,-6755.238,10.000},
				{-17058.109,-6848.467,10.000},
				{-17751.608,-6934.988,10.000},
				{-18453.023,-7014.144,10.000},
				{-19161.542,-7085.193,10.000},
				{-19876.272,-7147.298,10.000},
				{-20596.223,-7199.512,10.000},
				{-21320.299,-7240.763,10.000},
				{-22047.283,-7269.837,10.000},
				{-22775.819,-7285.360,10.000},
				{-23504.396,-7285.776,10.000},
				{-24231.329,-7269.323,10.000},
				{-24954.301,-7229.721,10.000},
				{-25670.402,-7161.015,10.000},
				{-26376.578,-7061.756,10.000},
				{-27069.622,-6930.444,10.000},
				{-27746.179,-6765.569,10.000},
				{-28402.746,-6565.670,10.000},
				{-29035.689,-6329.430,10.000},
				{-29641.268,-6055.794,10.000},
				{-30215.683,-5744.146,10.000},
				{-30755.136,-5394.531,10.000},
				{-31255.930,-5007.943,10.000},
				{-31714.597,-4586.667,10.000},
				{-32128.065,-4134.676,10.000},
				{-32493.869,-3658.044,10.000},
				{-32810.401,-3165.318,10.000},
				{-33077.308,-2669.068,10.000},
				{-33295.637,-2183.298,10.000},
				{-33467.891,-1722.533,10.000},
				{-33598.231,-1303.398,10.000},
				{-33692.592,-943.619,10.000},
				{-33758.645,-660.525,10.000},
				{-33805.567,-469.218,10.000},
				{-33843.637,-380.703,10.000},
				{-33883.675,-400.376,10.000},
				{-33936.398,-527.236,10.000},
				{-34011.801,-754.031,10.000},
				{-34118.631,-1068.294,10.000},
				{-34264.031,-1454.007,10.000},
				{-34453.382,-1893.503,10.000},
				{-34690.304,-2369.220,10.000},
				{-34976.809,-2865.056,10.000},
				{-35313.532,-3367.229,10.000},
				{-35699.997,-3864.643,10.000},
				{-36134.886,-4348.899,10.000},
				{-36616.291,-4814.049,10.000},
				{-37141.914,-5256.225,10.000},
				{-37709.237,-5673.236,10.000},
				{-38315.655,-6064.171,10.000},
				{-38958.561,-6429.064,10.000},
				{-39635.421,-6768.604,10.000},
				{-40343.813,-7083.915,10.000},
				{-41081.452,-7376.387,10.000},
				{-41846.206,-7647.550,10.000},
				{-42636.105,-7898.985,10.000},
				{-43449.331,-8132.264,10.000},
				{-44284.223,-8348.911,10.000},
				{-45139.260,-8550.373,10.000},
				{-46013.061,-8738.009,10.000},
				{-46904.369,-8913.083,10.000},
				{-47812.046,-9076.765,10.000},
				{-48735.058,-9230.127,10.000},
				{-49672.474,-9374.156,10.000},
				{-50623.449,-9509.753,10.000},
				{-51587.223,-9637.743,10.000},
				{-52563.111,-9758.880,10.000},
				{-53550.497,-9873.853,10.000},
				{-54548.826,-9983.296,10.000},
				{-55557.605,-10087.788,10.000},
				{-56576.392,-10187.864,10.000},
				{-57604.793,-10284.017,10.000},
				{-58642.464,-10376.705,10.000},
				{-59689.099,-10466.354,10.000},
				{-60744.435,-10553.362,10.000},
				{-61808.246,-10638.104,10.000},
				{-62880.339,-10720.933,10.000},
				{-63960.558,-10802.188,10.000},
				{-65048.777,-10882.191,10.000},
				{-66144.903,-10961.255,10.000},
				{-67248.871,-11039.683,10.000},
				{-68360.648,-11117.773,10.000},
				{-69480.230,-11195.821,10.000},
				{-70607.642,-11274.121,10.000},
				{-71742.939,-11352.968,10.000},
				{-72886.205,-11432.662,10.000},
				{-74037.557,-11513.512,10.000},
				{-75197.140,-11595.832,10.000},
				{-76365.135,-11679.951,10.000},
				{-77541.756,-11766.214,10.000},
				{-78727.254,-11854.981,10.000},
				{-79921.918,-11946.634,10.000},
				{-81126.076,-12041.582,10.000},
				{-82340.102,-12140.260,10.000},
				{-83564.415,-12243.134,10.000},
				{-84799.486,-12350.710,10.000},
				{-86045.840,-12463.533,10.000},
				{-87304.059,-12582.192,10.000},
				{-88574.792,-12707.331,10.000},
				{-89858.756,-12839.645,10.000},
				{-91156.746,-12979.893,10.000},
				{-92469.636,-13128.900,10.000},
				{-93798.392,-13287.562,10.000},
				{-95144.077,-13456.850,10.000},
				{-96507.858,-13637.811,10.000},
				{-97891.015,-13831.571,10.000},
				{-99294.948,-14039.329,10.000},
				{-100721.183,-14262.354,10.000},
				{-102171.380,-14501.963,10.000},
				{-103647.330,-14759.502,10.000},
				{-105150.960,-15036.304,10.000},
				{-106684.324,-15333.637,10.000},
				{-108249.586,-15652.621,10.000},
				{-109848.998,-15994.123,10.000},
				{-111484.860,-16358.611,10.000},
				{-113159.456,-16745.967,10.000},
				{-114874.982,-17155.257,10.000},
				{-116633.427,-17584.452,10.000},
				{-118436.439,-18030.119,10.000},
				{-120285.149,-18487.101,10.000},
				{-122179.971,-18948.222,10.000},
				{-124120.382,-19404.105,10.000},
				{-126104.697,-19843.154,10.000},
				{-128129.881,-20251.834,10.000},
				{-130191.409,-20615.286,10.000},
				{-132283.244,-20918.347,10.000},
				{-134397.932,-21146.883,10.000},
				{-136526.861,-21289.291,10.000},
				{-138660.650,-21337.891,10.000},
				{-140789.644,-21289.933,10.000},
				{-142903.867,-21142.237,10.000},
				{-144993.010,-20891.425,10.000},
				{-147047.484,-20544.739,10.000},
				{-149059.306,-20118.220,10.000},
				{-151022.228,-19629.219,10.000},
				{-152931.703,-19094.754,10.000},
				{-154784.731,-18530.279,10.000},
				{-156579.624,-17948.929,10.000},
				{-158315.746,-17361.224,10.000},
				{-159993.256,-16775.099,10.000},
				{-161612.872,-16196.160,10.000},
				{-163175.677,-15628.047,10.000},
				{-164682.959,-15072.827,10.000},
				{-166136.096,-14531.364,10.000},
				{-167536.460,-14003.643,10.000},
				{-168885.782,-13493.216,10.000},
				{-170186.469,-13006.871,10.000},
				{-171441.119,-12546.503,10.000},
				{-172652.104,-12109.847,10.000},
				{-173821.580,-11694.757,10.000},
				{-174951.503,-11299.237,10.000},
				{-176043.649,-10921.456,10.000},
				{-177099.623,-10559.745,10.000},
				{-178120.883,-10212.593,10.000},
				{-179108.747,-9878.641,10.000},
				{-180064.414,-9556.669,10.000},
				{-180988.972,-9245.585,10.000},
				{-181883.413,-8944.410,10.000},
				{-182748.641,-8652.273,10.000},
				{-183585.480,-8368.393,10.000},
				{-184394.687,-8092.076,10.000},
				{-185176.957,-7822.699,10.000},
				{-185932.928,-7559.707,10.000},
				{-186663.188,-7302.604,10.000},
				{-187368.283,-7050.947,10.000},
				{-188048.717,-6804.336,10.000},
				{-188704.958,-6562.415,10.000},
				{-189337.444,-6324.863,10.000},
				{-189946.584,-6091.391,10.000},
				{-190532.757,-5861.739,10.000},
				{-191096.325,-5635.671,10.000},
				{-191637.622,-5412.974,10.000},
				{-192156.967,-5193.452,10.000},
				{-192654.660,-4976.928,10.000},
				{-193130.984,-4763.238,10.000},
				{-193586.207,-4552.232,10.000},
				{-194020.584,-4343.770,10.000},
				{-194434.356,-4137.721,10.000},
				{-194827.752,-3933.963,10.000},
				{-195200.990,-3732.378,10.000},
				{-195554.276,-3532.855,10.000},
				{-195887.804,-3335.288,10.000},
				{-196201.762,-3139.572,10.000},
				{-196496.322,-2945.608,10.000},
				{-196771.652,-2753.293,10.000},
				{-197027.905,-2562.532,10.000},
				{-197265.227,-2373.224,10.000},
				{-197483.755,-2185.273,10.000},
				{-197683.613,-1998.579,10.000},
				{-197864.917,-1813.044,10.000},
				{-198027.774,-1628.568,10.000},
				{-198172.279,-1445.049,10.000},
				{-198298.822,-1265.430,10.000},
				{-198408.381,-1095.599,10.000},
				{-198502.219,-938.377,10.000},
				{-198581.582,-793.631,10.000},
				{-198647.707,-661.247,10.000},
				{-198701.820,-541.128,10.000},
				{-198745.139,-433.193,10.000},
				{-198778.877,-337.376,10.000},
				{-198804.239,-253.627,10.000},
				{-198822.430,-181.905,10.000},
				{-198834.648,-122.181,10.000},
				{-198842.091,-74.433,10.000},
				{-198845.956,-38.650,10.000},
				{-198847.439,-14.823,10.000},
				{-198847.733,-2.949,10.000},
				{-198847.733,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.598,-11.951,10.000},
				{-2.988,-23.903,10.000},
				{-8.366,-53.784,10.000},
				{-17.928,-95.621,10.000},
				{-32.871,-149.422,10.000},
				{-54.390,-215.198,10.000},
				{-83.687,-292.964,10.000},
				{-121.961,-382.744,10.000},
				{-170.418,-484.569,10.000},
				{-230.266,-598.477,10.000},
				{-302.718,-724.517,10.000},
				{-388.992,-862.748,10.000},
				{-490.316,-1013.240,10.000},
				{-607.924,-1176.075,10.000},
				{-743.059,-1351.350,10.000},
				{-896.375,-1533.160,10.000},
				{-1067.932,-1715.575,10.000},
				{-1257.799,-1898.663,10.000},
				{-1466.048,-2082.492,10.000},
				{-1692.761,-2267.130,10.000},
				{-1938.025,-2452.641,10.000},
				{-2201.934,-2639.092,10.000},
				{-2484.589,-2826.549,10.000},
				{-2786.097,-3015.077,10.000},
				{-3106.571,-3204.742,10.000},
				{-3446.132,-3395.609,10.000},
				{-3804.907,-3587.747,10.000},
				{-4183.029,-3781.225,10.000},
				{-4580.640,-3976.111,10.000},
				{-4997.888,-4172.480,10.000},
				{-5434.929,-4370.407,10.000},
				{-5891.926,-4569.971,10.000},
				{-6369.052,-4771.257,10.000},
				{-6866.487,-4974.352,10.000},
				{-7384.422,-5179.354,10.000},
				{-7923.058,-5386.363,10.000},
				{-8482.608,-5595.491,10.000},
				{-9063.293,-5806.857,10.000},
				{-9665.353,-6020.593,10.000},
				{-10289.037,-6236.842,10.000},
				{-10934.613,-6455.762,10.000},
				{-11602.366,-6677.526,10.000},
				{-12292.598,-6902.327,10.000},
				{-13005.636,-7130.377,10.000},
				{-13741.827,-7361.913,10.000},
				{-14501.547,-7597.198,10.000},
				{-15285.200,-7836.525,10.000},
				{-16093.222,-8080.222,10.000},
				{-16926.087,-8328.655,10.000},
				{-17784.311,-8582.234,10.000},
				{-18668.453,-8841.420,10.000},
				{-19579.126,-9106.732,10.000},
				{-20517.001,-9378.751,10.000},
				{-21482.815,-9658.135,10.000},
				{-22477.377,-9945.624,10.000},
				{-23501.583,-10242.056,10.000},
				{-24556.420,-10548.378,10.000},
				{-25642.987,-10865.662,10.000},
				{-26762.499,-11195.119,10.000},
				{-27916.311,-11538.126,10.000},
				{-29105.935,-11896.238,10.000},
				{-30333.056,-12271.215,10.000},
				{-31598.795,-12657.384,10.000},
				{-32903.670,-13048.751,10.000},
				{-34248.346,-13446.762,10.000},
				{-35633.638,-13852.918,10.000},
				{-37060.510,-14268.726,10.000},
				{-38530.075,-14695.646,10.000},
				{-40043.575,-15134.995,10.000},
				{-41602.357,-15587.826,10.000},
				{-43207.833,-16054.754,10.000},
				{-44861.406,-16535.732,10.000},
				{-46564.382,-17029.765,10.000},
				{-48317.839,-17534.568,10.000},
				{-50122.456,-18046.167,10.000},
				{-51978.305,-18558.491,10.000},
				{-53884.604,-19062.993,10.000},
				{-55840.510,-19559.059,10.000},
				{-57844.974,-20044.637,10.000},
				{-59895.495,-20505.211,10.000},
				{-61987.911,-20924.163,10.000},
				{-64116.289,-21283.779,10.000},
				{-66272.963,-21566.740,10.000},
				{-68448.759,-21757.955,10.000},
				{-70633.401,-21846.427,10.000},
				{-72816.078,-21826.764,10.000},
				{-74986.074,-21699.965,10.000},
				{-77133.402,-21473.278,10.000},
				{-79249.318,-21159.162,10.000},
				{-81326.680,-20773.621,10.000},
				{-83360.111,-20334.313,10.000},
				{-85345.990,-19858.790,10.000},
				{-87282.305,-19363.145,10.000},
				{-89168.420,-18861.154,10.000},
				{-91004.811,-18363.909,10.000},
				{-92792.792,-17879.807,10.000},
				{-94534.271,-17414.795,10.000},
				{-96231.546,-16972.741,10.000},
				{-97887.129,-16555.837,10.000},
				{-99503.629,-16164.994,10.000},
				{-101083.647,-15800.182,10.000},
				{-102629.718,-15460.711,10.000},
				{-104144.264,-15145.461,10.000},
				{-105629.568,-14853.040,10.000},
				{-107087.760,-14581.922,10.000},
				{-108520.813,-14330.525,10.000},
				{-109930.540,-14097.278,10.000},
				{-111318.606,-13880.659,10.000},
				{-112686.529,-13679.222,10.000},
				{-114035.689,-13491.607,10.000},
				{-115367.344,-13316.551,10.000},
				{-116682.633,-13152.885,10.000},
				{-117982.586,-12999.536,10.000},
				{-119268.138,-12855.519,10.000},
				{-120540.132,-12719.932,10.000},
				{-121799.327,-12591.951,10.000},
				{-123046.409,-12470.822,10.000},
				{-124281.994,-12355.856,10.000},
				{-125506.636,-12246.419,10.000},
				{-126720.830,-12141.932,10.000},
				{-127925.016,-12041.861,10.000},
				{-129119.587,-11945.711,10.000},
				{-130304.889,-11853.026,10.000},
				{-131481.227,-11763.380,10.000},
				{-132648.865,-11676.374,10.000},
				{-133808.028,-11591.635,10.000},
				{-134958.909,-11508.807,10.000},
				{-136101.664,-11427.554,10.000},
				{-137236.419,-11347.552,10.000},
				{-138363.268,-11268.489,10.000},
				{-139482.274,-11190.061,10.000},
				{-140593.471,-11111.971,10.000},
				{-141696.864,-11033.922,10.000},
				{-142792.426,-10955.622,10.000},
				{-143880.103,-10876.775,10.000},
				{-144959.811,-10797.079,10.000},
				{-146031.434,-10716.229,10.000},
				{-147094.825,-10633.907,10.000},
				{-148149.803,-10549.785,10.000},
				{-149196.155,-10463.520,10.000},
				{-150233.631,-10374.751,10.000},
				{-151261.940,-10283.094,10.000},
				{-152280.754,-10188.142,10.000},
				{-153289.700,-10089.460,10.000},
				{-154288.358,-9986.581,10.000},
				{-155276.258,-9878.999,10.000},
				{-156252.875,-9766.170,10.000},
				{-157217.625,-9647.503,10.000},
				{-158169.861,-9522.356,10.000},
				{-159108.864,-9390.032,10.000},
				{-160033.841,-9249.772,10.000},
				{-160943.916,-9100.751,10.000},
				{-161838.124,-8942.074,10.000},
				{-162715.401,-8772.769,10.000},
				{-163574.580,-8591.789,10.000},
				{-164414.380,-8398.006,10.000},
				{-165233.402,-8190.221,10.000},
				{-166030.119,-7967.165,10.000},
				{-166802.871,-7727.521,10.000},
				{-167549.865,-7469.941,10.000},
				{-168269.174,-7193.091,10.000},
				{-168958.745,-6895.704,10.000},
				{-169616.410,-6576.656,10.000},
				{-170239.918,-6235.081,10.000},
				{-170826.969,-5870.509,10.000},
				{-171375.275,-5483.058,10.000},
				{-171882.641,-5073.660,10.000},
				{-172347.075,-4644.343,10.000},
				{-172766.929,-4198.540,10.000},
				{-173141.070,-3741.411,10.000},
				{-173469.083,-3280.130,10.000},
				{-173751.491,-2824.081,10.000},
				{-173989.977,-2384.861,10.000},
				{-174187.579,-1976.016,10.000},
				{-174348.820,-1612.410,10.000},
				{-174479.742,-1309.216,10.000},
				{-174587.799,-1080.577,10.000},
				{-174681.610,-938.104,10.000},
				{-174770.558,-889.481,10.000},
				{-174864.304,-937.461,10.000},
				{-174972.221,-1079.171,10.000},
				{-175102.824,-1306.035,10.000},
				{-175263.315,-1604.906,10.000},
				{-175459.288,-1959.731,10.000},
				{-175694.603,-2353.149,10.000},
				{-175971.416,-2768.131,10.000},
				{-176290.338,-3189.216,10.000},
				{-176650.664,-3603.263,10.000},
				{-177050.639,-3999.748,10.000},
				{-177487.712,-4370.734,10.000},
				{-177958.774,-4710.616,10.000},
				{-178460.349,-5015.751,10.000},
				{-178988.757,-5284.076,10.000},
				{-179540.229,-5514.727,10.000},
				{-180111.001,-5707.722,10.000},
				{-180697.558,-5865.562,10.000},
				{-181296.899,-5993.412,10.000},
				{-181906.426,-6095.275,10.000},
				{-182523.768,-6173.421,10.000},
				{-183146.768,-6229.995,10.000},
				{-183773.467,-6266.993,10.000},
				{-184402.092,-6286.249,10.000},
				{-185031.035,-6289.432,10.000},
				{-185658.841,-6278.053,10.000},
				{-186284.188,-6253.471,10.000},
				{-186905.879,-6216.908,10.000},
				{-187522.824,-6169.456,10.000},
				{-188134.034,-6112.093,10.000},
				{-188738.603,-6045.691,10.000},
				{-189335.706,-5971.031,10.000},
				{-189924.587,-5888.808,10.000},
				{-190504.551,-5799.644,10.000},
				{-191074.960,-5704.094,10.000},
				{-191635.226,-5602.654,10.000},
				{-192184.803,-5495.770,10.000},
				{-192723.187,-5383.838,10.000},
				{-193249.908,-5267.216,10.000},
				{-193764.531,-5146.225,10.000},
				{-194266.646,-5021.153,10.000},
				{-194755.872,-4892.261,10.000},
				{-195231.851,-4759.785,10.000},
				{-195694.245,-4623.939,10.000},
				{-196142.736,-4484.917,10.000},
				{-196577.026,-4342.897,10.000},
				{-196996.830,-4198.043,10.000},
				{-197401.881,-4050.504,10.000},
				{-197791.923,-3900.422,10.000},
				{-198166.716,-3747.927,10.000},
				{-198526.030,-3593.142,10.000},
				{-198869.648,-3436.183,10.000},
				{-199197.364,-3277.161,10.000},
				{-199508.983,-3116.184,10.000},
				{-199804.318,-2953.355,10.000},
				{-200083.196,-2788.776,10.000},
				{-200345.450,-2622.546,10.000},
				{-200590.927,-2454.763,10.000},
				{-200819.479,-2285.526,10.000},
				{-201030.973,-2114.933,10.000},
				{-201225.281,-1943.083,10.000},
				{-201402.288,-1770.074,10.000},
				{-201561.889,-1596.006,10.000},
				{-201703.987,-1420.981,10.000},
				{-201828.798,-1248.108,10.000},
				{-201937.143,-1083.453,10.000},
				{-202030.152,-930.092,10.000},
				{-202108.968,-788.157,10.000},
				{-202174.744,-657.763,10.000},
				{-202228.645,-539.008,10.000},
				{-202271.842,-431.972,10.000},
				{-202305.514,-336.720,10.000},
				{-202330.845,-253.303,10.000},
				{-202349.021,-181.763,10.000},
				{-202361.233,-122.127,10.000},
				{-202368.675,-74.418,10.000},
				{-202372.540,-38.647,10.000},
				{-202374.022,-14.823,10.000},
				{-202374.317,-2.949,10.000},
				{-202374.317,-0.000,10.000}
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