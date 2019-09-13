package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class LeftSwitchCenter4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.50,0.00,0.00)
	
	public LeftSwitchCenter4() {
		this(false);
	}
			
    public LeftSwitchCenter4(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.599,-11.976,10.000},
				{-2.994,-23.952,10.000},
				{-8.383,-53.892,10.000},
				{-17.964,-95.808,10.000},
				{-32.934,-149.700,10.000},
				{-54.491,-215.568,10.000},
				{-83.832,-293.412,10.000},
				{-122.155,-383.232,10.000},
				{-170.658,-485.027,10.000},
				{-230.538,-598.799,10.000},
				{-302.992,-724.547,10.000},
				{-389.220,-862.271,10.000},
				{-490.417,-1011.971,10.000},
				{-607.781,-1173.647,10.000},
				{-742.511,-1347.299,10.000},
				{-895.205,-1526.938,10.000},
				{-1065.863,-1706.578,10.000},
				{-1254.485,-1886.218,10.000},
				{-1461.070,-2065.858,10.000},
				{-1685.620,-2245.498,10.000},
				{-1928.134,-2425.137,10.000},
				{-2188.612,-2604.777,10.000},
				{-2467.053,-2784.417,10.000},
				{-2763.459,-2964.057,10.000},
				{-3077.829,-3143.697,10.000},
				{-3410.162,-3323.336,10.000},
				{-3760.460,-3502.976,10.000},
				{-4128.722,-3682.616,10.000},
				{-4514.947,-3862.256,10.000},
				{-4919.137,-4041.896,10.000},
				{-5341.290,-4221.536,10.000},
				{-5781.408,-4401.175,10.000},
				{-6239.489,-4580.815,10.000},
				{-6715.535,-4760.455,10.000},
				{-7209.544,-4940.095,10.000},
				{-7721.518,-5119.735,10.000},
				{-8251.455,-5299.374,10.000},
				{-8799.357,-5479.014,10.000},
				{-9365.222,-5658.654,10.000},
				{-9949.052,-5838.294,10.000},
				{-10550.845,-6017.934,10.000},
				{-11170.602,-6197.573,10.000},
				{-11808.324,-6377.213,10.000},
				{-12464.009,-6556.853,10.000},
				{-13137.658,-6736.493,10.000},
				{-13829.271,-6916.133,10.000},
				{-14538.849,-7095.773,10.000},
				{-15266.390,-7275.412,10.000},
				{-16011.895,-7455.052,10.000},
				{-16775.364,-7634.692,10.000},
				{-17556.798,-7814.332,10.000},
				{-18356.195,-7993.972,10.000},
				{-19173.556,-8173.611,10.000},
				{-20008.881,-8353.251,10.000},
				{-20862.170,-8532.891,10.000},
				{-21733.423,-8712.531,10.000},
				{-22622.041,-8886.183,10.000},
				{-23526.827,-9047.858,10.000},
				{-24446.583,-9197.558,10.000},
				{-25380.111,-9335.282,10.000},
				{-26326.214,-9461.030,10.000},
				{-27283.694,-9574.802,10.000},
				{-28251.354,-9676.598,10.000},
				{-29227.996,-9766.418,10.000},
				{-30212.422,-9844.262,10.000},
				{-31203.435,-9910.130,10.000},
				{-32199.837,-9964.022,10.000},
				{-33200.431,-10005.937,10.000},
				{-34204.019,-10035.877,10.000},
				{-35209.403,-10053.841,10.000},
				{-36214.973,-10055.700,10.000},
				{-37219.118,-10041.452,10.000},
				{-38220.641,-10015.229,10.000},
				{-39218.344,-9977.030,10.000},
				{-40211.029,-9926.854,10.000},
				{-41197.500,-9864.703,10.000},
				{-42176.557,-9790.576,10.000},
				{-43147.005,-9704.473,10.000},
				{-44107.644,-9606.393,10.000},
				{-45057.278,-9496.338,10.000},
				{-45994.708,-9374.307,10.000},
				{-46918.738,-9240.300,10.000},
				{-47828.170,-9094.316,10.000},
				{-48721.806,-8936.357,10.000},
				{-49598.448,-8766.422,10.000},
				{-50457.312,-8588.641,10.000},
				{-51298.212,-8409.001,10.000},
				{-52121.148,-8229.361,10.000},
				{-52926.120,-8049.721,10.000},
				{-53713.128,-7870.081,10.000},
				{-54482.173,-7690.441,10.000},
				{-55233.253,-7510.802,10.000},
				{-55966.369,-7331.162,10.000},
				{-56681.521,-7151.522,10.000},
				{-57378.709,-6971.882,10.000},
				{-58057.934,-6792.242,10.000},
				{-58719.194,-6612.603,10.000},
				{-59362.490,-6432.963,10.000},
				{-59987.822,-6253.323,10.000},
				{-60595.191,-6073.683,10.000},
				{-61184.595,-5894.043,10.000},
				{-61756.035,-5714.404,10.000},
				{-62309.512,-5534.764,10.000},
				{-62845.024,-5355.124,10.000},
				{-63362.573,-5175.484,10.000},
				{-63862.157,-4995.844,10.000},
				{-64343.778,-4816.205,10.000},
				{-64807.434,-4636.565,10.000},
				{-65253.126,-4456.925,10.000},
				{-65680.855,-4277.285,10.000},
				{-66090.620,-4097.645,10.000},
				{-66482.420,-3918.005,10.000},
				{-66856.257,-3738.366,10.000},
				{-67212.129,-3558.726,10.000},
				{-67550.038,-3379.086,10.000},
				{-67869.982,-3199.446,10.000},
				{-68171.963,-3019.806,10.000},
				{-68455.980,-2840.167,10.000},
				{-68722.032,-2660.527,10.000},
				{-68970.121,-2480.887,10.000},
				{-69200.246,-2301.247,10.000},
				{-69412.407,-2121.607,10.000},
				{-69606.603,-1941.968,10.000},
				{-69782.836,-1762.328,10.000},
				{-69941.105,-1582.688,10.000},
				{-70081.410,-1403.048,10.000},
				{-70204.163,-1227.538,10.000},
				{-70310.378,-1062.146,10.000},
				{-70401.251,-908.729,10.000},
				{-70477.980,-767.289,10.000},
				{-70541.762,-637.824,10.000},
				{-70593.796,-520.336,10.000},
				{-70635.278,-414.823,10.000},
				{-70667.407,-321.286,10.000},
				{-70691.379,-239.726,10.000},
				{-70708.393,-170.141,10.000},
				{-70719.647,-112.533,10.000},
				{-70726.337,-66.900,10.000},
				{-70729.661,-33.244,10.000},
				{-70730.817,-11.563,10.000},
				{-70731.003,-1.858,10.000},
				{-70731.003,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.599,-11.976,10.000},
				{-2.994,-23.952,10.000},
				{-8.383,-53.892,10.000},
				{-17.964,-95.808,10.000},
				{-32.934,-149.700,10.000},
				{-54.491,-215.568,10.000},
				{-83.832,-293.412,10.000},
				{-122.155,-383.232,10.000},
				{-170.658,-485.027,10.000},
				{-230.538,-598.799,10.000},
				{-302.992,-724.547,10.000},
				{-389.220,-862.271,10.000},
				{-490.417,-1011.971,10.000},
				{-607.781,-1173.647,10.000},
				{-742.511,-1347.299,10.000},
				{-895.205,-1526.938,10.000},
				{-1065.863,-1706.578,10.000},
				{-1254.485,-1886.218,10.000},
				{-1461.070,-2065.858,10.000},
				{-1685.620,-2245.498,10.000},
				{-1928.134,-2425.137,10.000},
				{-2188.612,-2604.777,10.000},
				{-2467.053,-2784.417,10.000},
				{-2763.459,-2964.057,10.000},
				{-3077.829,-3143.697,10.000},
				{-3410.162,-3323.336,10.000},
				{-3760.460,-3502.976,10.000},
				{-4128.722,-3682.616,10.000},
				{-4514.947,-3862.256,10.000},
				{-4919.137,-4041.896,10.000},
				{-5341.290,-4221.536,10.000},
				{-5781.408,-4401.175,10.000},
				{-6239.489,-4580.815,10.000},
				{-6715.535,-4760.455,10.000},
				{-7209.544,-4940.095,10.000},
				{-7721.518,-5119.735,10.000},
				{-8251.455,-5299.374,10.000},
				{-8799.357,-5479.014,10.000},
				{-9365.222,-5658.654,10.000},
				{-9949.052,-5838.294,10.000},
				{-10550.845,-6017.934,10.000},
				{-11170.602,-6197.573,10.000},
				{-11808.324,-6377.213,10.000},
				{-12464.009,-6556.853,10.000},
				{-13137.658,-6736.493,10.000},
				{-13829.271,-6916.133,10.000},
				{-14538.849,-7095.773,10.000},
				{-15266.390,-7275.412,10.000},
				{-16011.895,-7455.052,10.000},
				{-16775.364,-7634.692,10.000},
				{-17556.798,-7814.332,10.000},
				{-18356.195,-7993.972,10.000},
				{-19173.556,-8173.611,10.000},
				{-20008.881,-8353.251,10.000},
				{-20862.170,-8532.891,10.000},
				{-21733.423,-8712.531,10.000},
				{-22622.041,-8886.183,10.000},
				{-23526.827,-9047.858,10.000},
				{-24446.583,-9197.558,10.000},
				{-25380.111,-9335.282,10.000},
				{-26326.214,-9461.030,10.000},
				{-27283.694,-9574.802,10.000},
				{-28251.354,-9676.598,10.000},
				{-29227.996,-9766.418,10.000},
				{-30212.422,-9844.262,10.000},
				{-31203.435,-9910.130,10.000},
				{-32199.837,-9964.022,10.000},
				{-33200.431,-10005.937,10.000},
				{-34204.019,-10035.877,10.000},
				{-35209.403,-10053.841,10.000},
				{-36214.973,-10055.700,10.000},
				{-37219.118,-10041.452,10.000},
				{-38220.641,-10015.229,10.000},
				{-39218.344,-9977.030,10.000},
				{-40211.029,-9926.854,10.000},
				{-41197.500,-9864.703,10.000},
				{-42176.557,-9790.576,10.000},
				{-43147.005,-9704.473,10.000},
				{-44107.644,-9606.393,10.000},
				{-45057.278,-9496.338,10.000},
				{-45994.708,-9374.307,10.000},
				{-46918.738,-9240.300,10.000},
				{-47828.170,-9094.316,10.000},
				{-48721.806,-8936.357,10.000},
				{-49598.448,-8766.422,10.000},
				{-50457.312,-8588.641,10.000},
				{-51298.212,-8409.001,10.000},
				{-52121.148,-8229.361,10.000},
				{-52926.120,-8049.721,10.000},
				{-53713.128,-7870.081,10.000},
				{-54482.173,-7690.441,10.000},
				{-55233.253,-7510.802,10.000},
				{-55966.369,-7331.162,10.000},
				{-56681.521,-7151.522,10.000},
				{-57378.709,-6971.882,10.000},
				{-58057.934,-6792.242,10.000},
				{-58719.194,-6612.603,10.000},
				{-59362.490,-6432.963,10.000},
				{-59987.822,-6253.323,10.000},
				{-60595.191,-6073.683,10.000},
				{-61184.595,-5894.043,10.000},
				{-61756.035,-5714.404,10.000},
				{-62309.512,-5534.764,10.000},
				{-62845.024,-5355.124,10.000},
				{-63362.573,-5175.484,10.000},
				{-63862.157,-4995.844,10.000},
				{-64343.778,-4816.205,10.000},
				{-64807.434,-4636.565,10.000},
				{-65253.126,-4456.925,10.000},
				{-65680.855,-4277.285,10.000},
				{-66090.620,-4097.645,10.000},
				{-66482.420,-3918.005,10.000},
				{-66856.257,-3738.366,10.000},
				{-67212.129,-3558.726,10.000},
				{-67550.038,-3379.086,10.000},
				{-67869.982,-3199.446,10.000},
				{-68171.963,-3019.806,10.000},
				{-68455.980,-2840.167,10.000},
				{-68722.032,-2660.527,10.000},
				{-68970.121,-2480.887,10.000},
				{-69200.246,-2301.247,10.000},
				{-69412.407,-2121.607,10.000},
				{-69606.603,-1941.968,10.000},
				{-69782.836,-1762.328,10.000},
				{-69941.105,-1582.688,10.000},
				{-70081.410,-1403.048,10.000},
				{-70204.163,-1227.538,10.000},
				{-70310.378,-1062.146,10.000},
				{-70401.251,-908.729,10.000},
				{-70477.980,-767.289,10.000},
				{-70541.762,-637.824,10.000},
				{-70593.796,-520.336,10.000},
				{-70635.278,-414.823,10.000},
				{-70667.407,-321.286,10.000},
				{-70691.379,-239.726,10.000},
				{-70708.393,-170.141,10.000},
				{-70719.647,-112.533,10.000},
				{-70726.337,-66.900,10.000},
				{-70729.661,-33.244,10.000},
				{-70730.817,-11.563,10.000},
				{-70731.003,-1.858,10.000},
				{-70731.003,-0.000,10.000}
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