package frc.paths;

import frc.lib.drivers.SrxMotionProfile;
import frc.lib.drivers.SrxTrajectory;

public class RightSwitchCenter8 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (6.00,0.00,0.00)
	
	public RightSwitchCenter8() {
		this(false);
	}
			
    public RightSwitchCenter8(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.602,-12.043,10.000},
				{-3.011,-24.087,10.000},
				{-8.430,-54.195,10.000},
				{-18.065,-96.347,10.000},
				{-33.119,-150.543,10.000},
				{-54.798,-216.781,10.000},
				{-84.304,-295.064,10.000},
				{-122.843,-385.389,10.000},
				{-171.619,-487.758,10.000},
				{-231.836,-602.171,10.000},
				{-304.698,-728.626,10.000},
				{-391.411,-867.126,10.000},
				{-493.178,-1017.668,10.000},
				{-611.203,-1180.254,10.000},
				{-746.692,-1354.884,10.000},
				{-900.245,-1535.535,10.000},
				{-1071.864,-1716.186,10.000},
				{-1261.547,-1896.837,10.000},
				{-1469.296,-2077.488,10.000},
				{-1695.110,-2258.140,10.000},
				{-1938.989,-2438.791,10.000},
				{-2200.933,-2619.442,10.000},
				{-2480.943,-2800.093,10.000},
				{-2779.017,-2980.744,10.000},
				{-3095.157,-3161.395,10.000},
				{-3429.361,-3342.047,10.000},
				{-3781.631,-3522.698,10.000},
				{-4151.966,-3703.349,10.000},
				{-4540.366,-3884.000,10.000},
				{-4946.831,-4064.651,10.000},
				{-5371.361,-4245.303,10.000},
				{-5813.957,-4425.954,10.000},
				{-6274.617,-4606.605,10.000},
				{-6753.343,-4787.256,10.000},
				{-7250.134,-4967.907,10.000},
				{-7764.990,-5148.558,10.000},
				{-8297.910,-5329.210,10.000},
				{-8848.897,-5509.861,10.000},
				{-9417.948,-5690.512,10.000},
				{-10005.064,-5871.163,10.000},
				{-10610.245,-6051.814,10.000},
				{-11233.492,-6232.465,10.000},
				{-11874.804,-6413.117,10.000},
				{-12534.180,-6593.768,10.000},
				{-13211.622,-6774.419,10.000},
				{-13907.129,-6955.070,10.000},
				{-14620.701,-7135.721,10.000},
				{-15352.339,-7316.372,10.000},
				{-16102.041,-7497.024,10.000},
				{-16869.809,-7677.675,10.000},
				{-17655.641,-7858.326,10.000},
				{-18459.539,-8038.977,10.000},
				{-19281.502,-8219.628,10.000},
				{-20121.530,-8400.279,10.000},
				{-20979.623,-8580.931,10.000},
				{-21855.781,-8761.582,10.000},
				{-22750.004,-8942.233,10.000},
				{-23662.293,-9122.884,10.000},
				{-24592.646,-9303.535,10.000},
				{-25541.065,-9484.186,10.000},
				{-26507.549,-9664.838,10.000},
				{-27492.097,-9845.489,10.000},
				{-28494.711,-10026.140,10.000},
				{-29515.391,-10206.791,10.000},
				{-30554.135,-10387.442,10.000},
				{-31610.944,-10568.094,10.000},
				{-32685.819,-10748.745,10.000},
				{-33778.758,-10929.396,10.000},
				{-34889.763,-11110.047,10.000},
				{-36018.833,-11290.698,10.000},
				{-37165.968,-11471.349,10.000},
				{-38331.168,-11652.001,10.000},
				{-39514.433,-11832.652,10.000},
				{-40715.763,-12013.303,10.000},
				{-41935.159,-12193.954,10.000},
				{-43172.017,-12368.584,10.000},
				{-44425.134,-12531.170,10.000},
				{-45693.305,-12681.712,10.000},
				{-46975.326,-12820.211,10.000},
				{-48269.993,-12946.667,10.000},
				{-49576.101,-13061.080,10.000},
				{-50892.446,-13163.449,10.000},
				{-52217.823,-13253.774,10.000},
				{-53551.029,-13332.056,10.000},
				{-54890.858,-13398.295,10.000},
				{-56236.107,-13452.491,10.000},
				{-57585.572,-13494.642,10.000},
				{-58938.047,-13524.751,10.000},
				{-60292.328,-13542.816,10.000},
				{-61646.907,-13545.787,10.000},
				{-63000.274,-13533.664,10.000},
				{-64351.223,-13509.498,10.000},
				{-65698.552,-13473.288,10.000},
				{-67041.056,-13425.035,10.000},
				{-68377.529,-13364.738,10.000},
				{-69706.769,-13292.398,10.000},
				{-71027.571,-13208.015,10.000},
				{-72338.730,-13111.588,10.000},
				{-73639.041,-13003.118,10.000},
				{-74927.302,-12882.604,10.000},
				{-76202.306,-12750.047,10.000},
				{-77462.851,-12605.446,10.000},
				{-78707.731,-12448.803,10.000},
				{-79935.743,-12280.115,10.000},
				{-81145.986,-12102.435,10.000},
				{-82338.165,-11921.784,10.000},
				{-83512.278,-11741.133,10.000},
				{-84668.326,-11560.482,10.000},
				{-85806.309,-11379.830,10.000},
				{-86926.227,-11199.179,10.000},
				{-88028.080,-11018.528,10.000},
				{-89111.868,-10837.877,10.000},
				{-90177.590,-10657.226,10.000},
				{-91225.248,-10476.575,10.000},
				{-92254.840,-10295.923,10.000},
				{-93266.367,-10115.272,10.000},
				{-94259.829,-9934.621,10.000},
				{-95235.226,-9753.970,10.000},
				{-96192.558,-9573.319,10.000},
				{-97131.825,-9392.668,10.000},
				{-98053.027,-9212.016,10.000},
				{-98956.163,-9031.365,10.000},
				{-99841.234,-8850.714,10.000},
				{-100708.241,-8670.063,10.000},
				{-101557.182,-8489.412,10.000},
				{-102388.058,-8308.760,10.000},
				{-103200.869,-8128.109,10.000},
				{-103995.615,-7947.458,10.000},
				{-104772.295,-7766.807,10.000},
				{-105530.911,-7586.156,10.000},
				{-106271.461,-7405.505,10.000},
				{-106993.947,-7224.853,10.000},
				{-107698.367,-7044.202,10.000},
				{-108384.722,-6863.551,10.000},
				{-109053.012,-6682.900,10.000},
				{-109703.237,-6502.249,10.000},
				{-110335.397,-6321.598,10.000},
				{-110949.491,-6140.946,10.000},
				{-111545.521,-5960.295,10.000},
				{-112123.485,-5779.644,10.000},
				{-112683.385,-5598.993,10.000},
				{-113225.219,-5418.342,10.000},
				{-113748.988,-5237.691,10.000},
				{-114254.692,-5057.039,10.000},
				{-114742.331,-4876.388,10.000},
				{-115211.904,-4695.737,10.000},
				{-115663.413,-4515.086,10.000},
				{-116096.856,-4334.435,10.000},
				{-116512.235,-4153.784,10.000},
				{-116909.548,-3973.132,10.000},
				{-117288.796,-3792.481,10.000},
				{-117649.979,-3611.830,10.000},
				{-117993.097,-3431.179,10.000},
				{-118318.150,-3250.528,10.000},
				{-118625.137,-3069.877,10.000},
				{-118914.060,-2889.225,10.000},
				{-119184.917,-2708.574,10.000},
				{-119437.710,-2527.923,10.000},
				{-119672.437,-2347.272,10.000},
				{-119889.099,-2166.621,10.000},
				{-120087.696,-1985.970,10.000},
				{-120268.228,-1805.318,10.000},
				{-120430.694,-1624.667,10.000},
				{-120575.096,-1444.016,10.000},
				{-120701.738,-1266.415,10.000},
				{-120811.526,-1097.887,10.000},
				{-120905.667,-941.402,10.000},
				{-120985.363,-796.961,10.000},
				{-121051.819,-664.563,10.000},
				{-121106.240,-544.209,10.000},
				{-121149.830,-435.897,10.000},
				{-121183.793,-339.630,10.000},
				{-121209.333,-255.405,10.000},
				{-121227.656,-183.224,10.000},
				{-121239.964,-123.087,10.000},
				{-121247.464,-74.993,10.000},
				{-121251.358,-38.942,10.000},
				{-121252.851,-14.935,10.000},
				{-121253.148,-2.971,10.000},
				{-121253.148,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.602,-12.043,10.000},
				{-3.011,-24.087,10.000},
				{-8.430,-54.195,10.000},
				{-18.065,-96.347,10.000},
				{-33.119,-150.543,10.000},
				{-54.798,-216.781,10.000},
				{-84.304,-295.064,10.000},
				{-122.843,-385.389,10.000},
				{-171.619,-487.758,10.000},
				{-231.836,-602.171,10.000},
				{-304.698,-728.626,10.000},
				{-391.411,-867.126,10.000},
				{-493.178,-1017.668,10.000},
				{-611.203,-1180.254,10.000},
				{-746.692,-1354.884,10.000},
				{-900.245,-1535.535,10.000},
				{-1071.864,-1716.186,10.000},
				{-1261.547,-1896.837,10.000},
				{-1469.296,-2077.488,10.000},
				{-1695.110,-2258.140,10.000},
				{-1938.989,-2438.791,10.000},
				{-2200.933,-2619.442,10.000},
				{-2480.943,-2800.093,10.000},
				{-2779.017,-2980.744,10.000},
				{-3095.157,-3161.395,10.000},
				{-3429.361,-3342.047,10.000},
				{-3781.631,-3522.698,10.000},
				{-4151.966,-3703.349,10.000},
				{-4540.366,-3884.000,10.000},
				{-4946.831,-4064.651,10.000},
				{-5371.361,-4245.303,10.000},
				{-5813.957,-4425.954,10.000},
				{-6274.617,-4606.605,10.000},
				{-6753.343,-4787.256,10.000},
				{-7250.134,-4967.907,10.000},
				{-7764.990,-5148.558,10.000},
				{-8297.910,-5329.210,10.000},
				{-8848.897,-5509.861,10.000},
				{-9417.948,-5690.512,10.000},
				{-10005.064,-5871.163,10.000},
				{-10610.245,-6051.814,10.000},
				{-11233.492,-6232.465,10.000},
				{-11874.804,-6413.117,10.000},
				{-12534.180,-6593.768,10.000},
				{-13211.622,-6774.419,10.000},
				{-13907.129,-6955.070,10.000},
				{-14620.701,-7135.721,10.000},
				{-15352.339,-7316.372,10.000},
				{-16102.041,-7497.024,10.000},
				{-16869.809,-7677.675,10.000},
				{-17655.641,-7858.326,10.000},
				{-18459.539,-8038.977,10.000},
				{-19281.502,-8219.628,10.000},
				{-20121.530,-8400.279,10.000},
				{-20979.623,-8580.931,10.000},
				{-21855.781,-8761.582,10.000},
				{-22750.004,-8942.233,10.000},
				{-23662.293,-9122.884,10.000},
				{-24592.646,-9303.535,10.000},
				{-25541.065,-9484.186,10.000},
				{-26507.549,-9664.838,10.000},
				{-27492.097,-9845.489,10.000},
				{-28494.711,-10026.140,10.000},
				{-29515.391,-10206.791,10.000},
				{-30554.135,-10387.442,10.000},
				{-31610.944,-10568.094,10.000},
				{-32685.819,-10748.745,10.000},
				{-33778.758,-10929.396,10.000},
				{-34889.763,-11110.047,10.000},
				{-36018.833,-11290.698,10.000},
				{-37165.968,-11471.349,10.000},
				{-38331.168,-11652.001,10.000},
				{-39514.433,-11832.652,10.000},
				{-40715.763,-12013.303,10.000},
				{-41935.159,-12193.954,10.000},
				{-43172.017,-12368.584,10.000},
				{-44425.134,-12531.170,10.000},
				{-45693.305,-12681.712,10.000},
				{-46975.326,-12820.211,10.000},
				{-48269.993,-12946.667,10.000},
				{-49576.101,-13061.080,10.000},
				{-50892.446,-13163.449,10.000},
				{-52217.823,-13253.774,10.000},
				{-53551.029,-13332.056,10.000},
				{-54890.858,-13398.295,10.000},
				{-56236.107,-13452.491,10.000},
				{-57585.572,-13494.642,10.000},
				{-58938.047,-13524.751,10.000},
				{-60292.328,-13542.816,10.000},
				{-61646.907,-13545.787,10.000},
				{-63000.274,-13533.664,10.000},
				{-64351.223,-13509.498,10.000},
				{-65698.552,-13473.288,10.000},
				{-67041.056,-13425.035,10.000},
				{-68377.529,-13364.738,10.000},
				{-69706.769,-13292.398,10.000},
				{-71027.571,-13208.015,10.000},
				{-72338.730,-13111.588,10.000},
				{-73639.041,-13003.118,10.000},
				{-74927.302,-12882.604,10.000},
				{-76202.306,-12750.047,10.000},
				{-77462.851,-12605.446,10.000},
				{-78707.731,-12448.803,10.000},
				{-79935.743,-12280.115,10.000},
				{-81145.986,-12102.435,10.000},
				{-82338.165,-11921.784,10.000},
				{-83512.278,-11741.133,10.000},
				{-84668.326,-11560.482,10.000},
				{-85806.309,-11379.830,10.000},
				{-86926.227,-11199.179,10.000},
				{-88028.080,-11018.528,10.000},
				{-89111.868,-10837.877,10.000},
				{-90177.590,-10657.226,10.000},
				{-91225.248,-10476.575,10.000},
				{-92254.840,-10295.923,10.000},
				{-93266.367,-10115.272,10.000},
				{-94259.829,-9934.621,10.000},
				{-95235.226,-9753.970,10.000},
				{-96192.558,-9573.319,10.000},
				{-97131.825,-9392.668,10.000},
				{-98053.027,-9212.016,10.000},
				{-98956.163,-9031.365,10.000},
				{-99841.234,-8850.714,10.000},
				{-100708.241,-8670.063,10.000},
				{-101557.182,-8489.412,10.000},
				{-102388.058,-8308.760,10.000},
				{-103200.869,-8128.109,10.000},
				{-103995.615,-7947.458,10.000},
				{-104772.295,-7766.807,10.000},
				{-105530.911,-7586.156,10.000},
				{-106271.461,-7405.505,10.000},
				{-106993.947,-7224.853,10.000},
				{-107698.367,-7044.202,10.000},
				{-108384.722,-6863.551,10.000},
				{-109053.012,-6682.900,10.000},
				{-109703.237,-6502.249,10.000},
				{-110335.397,-6321.598,10.000},
				{-110949.491,-6140.946,10.000},
				{-111545.521,-5960.295,10.000},
				{-112123.485,-5779.644,10.000},
				{-112683.385,-5598.993,10.000},
				{-113225.219,-5418.342,10.000},
				{-113748.988,-5237.691,10.000},
				{-114254.692,-5057.039,10.000},
				{-114742.331,-4876.388,10.000},
				{-115211.904,-4695.737,10.000},
				{-115663.413,-4515.086,10.000},
				{-116096.856,-4334.435,10.000},
				{-116512.235,-4153.784,10.000},
				{-116909.548,-3973.132,10.000},
				{-117288.796,-3792.481,10.000},
				{-117649.979,-3611.830,10.000},
				{-117993.097,-3431.179,10.000},
				{-118318.150,-3250.528,10.000},
				{-118625.137,-3069.877,10.000},
				{-118914.060,-2889.225,10.000},
				{-119184.917,-2708.574,10.000},
				{-119437.710,-2527.923,10.000},
				{-119672.437,-2347.272,10.000},
				{-119889.099,-2166.621,10.000},
				{-120087.696,-1985.970,10.000},
				{-120268.228,-1805.318,10.000},
				{-120430.694,-1624.667,10.000},
				{-120575.096,-1444.016,10.000},
				{-120701.738,-1266.415,10.000},
				{-120811.526,-1097.887,10.000},
				{-120905.667,-941.402,10.000},
				{-120985.363,-796.961,10.000},
				{-121051.819,-664.563,10.000},
				{-121106.240,-544.209,10.000},
				{-121149.830,-435.897,10.000},
				{-121183.793,-339.630,10.000},
				{-121209.333,-255.405,10.000},
				{-121227.656,-183.224,10.000},
				{-121239.964,-123.087,10.000},
				{-121247.464,-74.993,10.000},
				{-121251.358,-38.942,10.000},
				{-121252.851,-14.935,10.000},
				{-121253.148,-2.971,10.000},
				{-121253.148,-0.000,10.000}
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