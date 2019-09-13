package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class LeftSwitchCenter8 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (4.00,0.00,0.00)
	
	public LeftSwitchCenter8() {
		this(false);
	}
			
    public LeftSwitchCenter8(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.602,-12.042,10.000},
				{-3.010,-24.084,10.000},
				{-8.429,-54.189,10.000},
				{-18.063,-96.335,10.000},
				{-33.115,-150.524,10.000},
				{-54.791,-216.754,10.000},
				{-84.293,-295.026,10.000},
				{-122.827,-385.341,10.000},
				{-171.597,-487.697,10.000},
				{-231.806,-602.095,10.000},
				{-304.660,-728.535,10.000},
				{-391.362,-867.016,10.000},
				{-493.116,-1017.540,10.000},
				{-611.126,-1180.106,10.000},
				{-746.598,-1354.713,10.000},
				{-900.132,-1535.342,10.000},
				{-1071.729,-1715.970,10.000},
				{-1261.389,-1896.599,10.000},
				{-1469.111,-2077.227,10.000},
				{-1694.897,-2257.855,10.000},
				{-1938.745,-2438.484,10.000},
				{-2200.656,-2619.112,10.000},
				{-2480.631,-2799.741,10.000},
				{-2778.667,-2980.369,10.000},
				{-3094.767,-3160.998,10.000},
				{-3428.930,-3341.626,10.000},
				{-3781.155,-3522.255,10.000},
				{-4151.444,-3702.883,10.000},
				{-4539.795,-3883.511,10.000},
				{-4946.209,-4064.140,10.000},
				{-5370.685,-4244.768,10.000},
				{-5813.225,-4425.397,10.000},
				{-6273.828,-4606.025,10.000},
				{-6752.493,-4786.654,10.000},
				{-7249.221,-4967.282,10.000},
				{-7764.012,-5147.910,10.000},
				{-8296.866,-5328.539,10.000},
				{-8847.783,-5509.167,10.000},
				{-9416.762,-5689.796,10.000},
				{-10003.805,-5870.424,10.000},
				{-10608.910,-6051.053,10.000},
				{-11232.078,-6231.681,10.000},
				{-11873.309,-6412.309,10.000},
				{-12532.603,-6592.938,10.000},
				{-13209.960,-6773.566,10.000},
				{-13905.379,-6954.195,10.000},
				{-14618.861,-7134.823,10.000},
				{-15350.407,-7315.452,10.000},
				{-16100.015,-7496.080,10.000},
				{-16867.685,-7676.709,10.000},
				{-17653.419,-7857.337,10.000},
				{-18457.216,-8037.965,10.000},
				{-19279.075,-8218.594,10.000},
				{-20118.997,-8399.222,10.000},
				{-20976.982,-8579.851,10.000},
				{-21853.030,-8760.479,10.000},
				{-22747.141,-8941.108,10.000},
				{-23659.315,-9121.736,10.000},
				{-24589.551,-9302.364,10.000},
				{-25537.850,-9482.993,10.000},
				{-26503.610,-9657.600,10.000},
				{-27485.627,-9820.166,10.000},
				{-28482.696,-9970.690,10.000},
				{-29493.613,-10109.171,10.000},
				{-30517.174,-10235.611,10.000},
				{-31552.175,-10350.009,10.000},
				{-32597.412,-10452.366,10.000},
				{-33651.680,-10542.680,10.000},
				{-34713.775,-10620.952,10.000},
				{-35782.493,-10687.182,10.000},
				{-36856.630,-10741.371,10.000},
				{-37934.982,-10783.518,10.000},
				{-39016.344,-10813.622,10.000},
				{-40099.513,-10831.685,10.000},
				{-41183.035,-10835.221,10.000},
				{-42265.458,-10824.229,10.000},
				{-43345.577,-10801.196,10.000},
				{-44422.189,-10766.120,10.000},
				{-45494.090,-10719.003,10.000},
				{-46560.074,-10659.844,10.000},
				{-47618.938,-10588.642,10.000},
				{-48669.478,-10505.399,10.000},
				{-49710.490,-10410.114,10.000},
				{-50740.768,-10302.788,10.000},
				{-51759.110,-10183.419,10.000},
				{-52764.311,-10052.008,10.000},
				{-53755.167,-9908.556,10.000},
				{-54730.473,-9753.061,10.000},
				{-55689.025,-9585.525,10.000},
				{-56629.869,-9408.432,10.000},
				{-57552.649,-9227.804,10.000},
				{-58457.366,-9047.175,10.000},
				{-59344.021,-8866.547,10.000},
				{-60212.613,-8685.918,10.000},
				{-61063.142,-8505.290,10.000},
				{-61895.608,-8324.662,10.000},
				{-62710.012,-8144.033,10.000},
				{-63506.352,-7963.405,10.000},
				{-64284.630,-7782.776,10.000},
				{-65044.844,-7602.148,10.000},
				{-65786.996,-7421.519,10.000},
				{-66511.085,-7240.891,10.000},
				{-67217.112,-7060.263,10.000},
				{-67905.075,-6879.634,10.000},
				{-68574.976,-6699.006,10.000},
				{-69226.813,-6518.377,10.000},
				{-69860.588,-6337.749,10.000},
				{-70476.300,-6157.120,10.000},
				{-71073.950,-5976.492,10.000},
				{-71653.536,-5795.864,10.000},
				{-72215.059,-5615.235,10.000},
				{-72758.520,-5434.607,10.000},
				{-73283.918,-5253.978,10.000},
				{-73791.253,-5073.350,10.000},
				{-74280.525,-4892.721,10.000},
				{-74751.734,-4712.093,10.000},
				{-75204.881,-4531.464,10.000},
				{-75639.964,-4350.836,10.000},
				{-76056.985,-4170.208,10.000},
				{-76455.943,-3989.579,10.000},
				{-76836.838,-3808.951,10.000},
				{-77199.670,-3628.322,10.000},
				{-77544.440,-3447.694,10.000},
				{-77871.146,-3267.065,10.000},
				{-78179.790,-3086.437,10.000},
				{-78470.371,-2905.809,10.000},
				{-78742.889,-2725.180,10.000},
				{-78997.344,-2544.552,10.000},
				{-79233.736,-2363.923,10.000},
				{-79452.066,-2183.295,10.000},
				{-79652.332,-2002.666,10.000},
				{-79834.536,-1822.038,10.000},
				{-79998.677,-1641.409,10.000},
				{-80144.755,-1460.781,10.000},
				{-80273.019,-1282.638,10.000},
				{-80384.319,-1113.001,10.000},
				{-80479.860,-955.406,10.000},
				{-80560.845,-809.853,10.000},
				{-80628.479,-676.342,10.000},
				{-80683.967,-554.873,10.000},
				{-80728.511,-445.446,10.000},
				{-80763.317,-348.060,10.000},
				{-80789.589,-262.717,10.000},
				{-80808.530,-189.415,10.000},
				{-80821.346,-128.155,10.000},
				{-80829.240,-78.938,10.000},
				{-80833.416,-41.762,10.000},
				{-80835.079,-16.628,10.000},
				{-80835.432,-3.536,10.000},
				{-80835.432,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.602,-12.042,10.000},
				{-3.010,-24.084,10.000},
				{-8.429,-54.189,10.000},
				{-18.063,-96.335,10.000},
				{-33.115,-150.524,10.000},
				{-54.791,-216.754,10.000},
				{-84.293,-295.026,10.000},
				{-122.827,-385.341,10.000},
				{-171.597,-487.697,10.000},
				{-231.806,-602.095,10.000},
				{-304.660,-728.535,10.000},
				{-391.362,-867.016,10.000},
				{-493.116,-1017.540,10.000},
				{-611.126,-1180.106,10.000},
				{-746.598,-1354.713,10.000},
				{-900.132,-1535.342,10.000},
				{-1071.729,-1715.970,10.000},
				{-1261.389,-1896.599,10.000},
				{-1469.111,-2077.227,10.000},
				{-1694.897,-2257.855,10.000},
				{-1938.745,-2438.484,10.000},
				{-2200.656,-2619.112,10.000},
				{-2480.631,-2799.741,10.000},
				{-2778.667,-2980.369,10.000},
				{-3094.767,-3160.998,10.000},
				{-3428.930,-3341.626,10.000},
				{-3781.155,-3522.255,10.000},
				{-4151.444,-3702.883,10.000},
				{-4539.795,-3883.511,10.000},
				{-4946.209,-4064.140,10.000},
				{-5370.685,-4244.768,10.000},
				{-5813.225,-4425.397,10.000},
				{-6273.828,-4606.025,10.000},
				{-6752.493,-4786.654,10.000},
				{-7249.221,-4967.282,10.000},
				{-7764.012,-5147.910,10.000},
				{-8296.866,-5328.539,10.000},
				{-8847.783,-5509.167,10.000},
				{-9416.762,-5689.796,10.000},
				{-10003.805,-5870.424,10.000},
				{-10608.910,-6051.053,10.000},
				{-11232.078,-6231.681,10.000},
				{-11873.309,-6412.309,10.000},
				{-12532.603,-6592.938,10.000},
				{-13209.960,-6773.566,10.000},
				{-13905.379,-6954.195,10.000},
				{-14618.861,-7134.823,10.000},
				{-15350.407,-7315.452,10.000},
				{-16100.015,-7496.080,10.000},
				{-16867.685,-7676.709,10.000},
				{-17653.419,-7857.337,10.000},
				{-18457.216,-8037.965,10.000},
				{-19279.075,-8218.594,10.000},
				{-20118.997,-8399.222,10.000},
				{-20976.982,-8579.851,10.000},
				{-21853.030,-8760.479,10.000},
				{-22747.141,-8941.108,10.000},
				{-23659.315,-9121.736,10.000},
				{-24589.551,-9302.364,10.000},
				{-25537.850,-9482.993,10.000},
				{-26503.610,-9657.600,10.000},
				{-27485.627,-9820.166,10.000},
				{-28482.696,-9970.690,10.000},
				{-29493.613,-10109.171,10.000},
				{-30517.174,-10235.611,10.000},
				{-31552.175,-10350.009,10.000},
				{-32597.412,-10452.366,10.000},
				{-33651.680,-10542.680,10.000},
				{-34713.775,-10620.952,10.000},
				{-35782.493,-10687.182,10.000},
				{-36856.630,-10741.371,10.000},
				{-37934.982,-10783.518,10.000},
				{-39016.344,-10813.622,10.000},
				{-40099.513,-10831.685,10.000},
				{-41183.035,-10835.221,10.000},
				{-42265.458,-10824.229,10.000},
				{-43345.577,-10801.196,10.000},
				{-44422.189,-10766.120,10.000},
				{-45494.090,-10719.003,10.000},
				{-46560.074,-10659.844,10.000},
				{-47618.938,-10588.642,10.000},
				{-48669.478,-10505.399,10.000},
				{-49710.490,-10410.114,10.000},
				{-50740.768,-10302.788,10.000},
				{-51759.110,-10183.419,10.000},
				{-52764.311,-10052.008,10.000},
				{-53755.167,-9908.556,10.000},
				{-54730.473,-9753.061,10.000},
				{-55689.025,-9585.525,10.000},
				{-56629.869,-9408.432,10.000},
				{-57552.649,-9227.804,10.000},
				{-58457.366,-9047.175,10.000},
				{-59344.021,-8866.547,10.000},
				{-60212.613,-8685.918,10.000},
				{-61063.142,-8505.290,10.000},
				{-61895.608,-8324.662,10.000},
				{-62710.012,-8144.033,10.000},
				{-63506.352,-7963.405,10.000},
				{-64284.630,-7782.776,10.000},
				{-65044.844,-7602.148,10.000},
				{-65786.996,-7421.519,10.000},
				{-66511.085,-7240.891,10.000},
				{-67217.112,-7060.263,10.000},
				{-67905.075,-6879.634,10.000},
				{-68574.976,-6699.006,10.000},
				{-69226.813,-6518.377,10.000},
				{-69860.588,-6337.749,10.000},
				{-70476.300,-6157.120,10.000},
				{-71073.950,-5976.492,10.000},
				{-71653.536,-5795.864,10.000},
				{-72215.059,-5615.235,10.000},
				{-72758.520,-5434.607,10.000},
				{-73283.918,-5253.978,10.000},
				{-73791.253,-5073.350,10.000},
				{-74280.525,-4892.721,10.000},
				{-74751.734,-4712.093,10.000},
				{-75204.881,-4531.464,10.000},
				{-75639.964,-4350.836,10.000},
				{-76056.985,-4170.208,10.000},
				{-76455.943,-3989.579,10.000},
				{-76836.838,-3808.951,10.000},
				{-77199.670,-3628.322,10.000},
				{-77544.440,-3447.694,10.000},
				{-77871.146,-3267.065,10.000},
				{-78179.790,-3086.437,10.000},
				{-78470.371,-2905.809,10.000},
				{-78742.889,-2725.180,10.000},
				{-78997.344,-2544.552,10.000},
				{-79233.736,-2363.923,10.000},
				{-79452.066,-2183.295,10.000},
				{-79652.332,-2002.666,10.000},
				{-79834.536,-1822.038,10.000},
				{-79998.677,-1641.409,10.000},
				{-80144.755,-1460.781,10.000},
				{-80273.019,-1282.638,10.000},
				{-80384.319,-1113.001,10.000},
				{-80479.860,-955.406,10.000},
				{-80560.845,-809.853,10.000},
				{-80628.479,-676.342,10.000},
				{-80683.967,-554.873,10.000},
				{-80728.511,-445.446,10.000},
				{-80763.317,-348.060,10.000},
				{-80789.589,-262.717,10.000},
				{-80808.530,-189.415,10.000},
				{-80821.346,-128.155,10.000},
				{-80829.240,-78.938,10.000},
				{-80833.416,-41.762,10.000},
				{-80835.079,-16.628,10.000},
				{-80835.432,-3.536,10.000},
				{-80835.432,-0.000,10.000}
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