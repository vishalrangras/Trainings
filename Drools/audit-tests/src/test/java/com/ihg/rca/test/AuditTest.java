package com.ihg.rca.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import com.ihg.rca.model.DailyHotelPerf;
import com.ihg.rca.model.HotelData;
import com.ihg.rca.model.MonthlyHotelPerf;
import com.ihg.rca.model.MonthlyHtlRateCtgyPerf;
import com.ihg.rca.model.Thresholds;
import com.ihg.rca.util.KnowledgeSessionHelper;

public class AuditTest {

	static KieContainer kieContainer;
    StatelessKieSession sessionStateless = null;
    KieSession  sessionStatefull = null;
    
    @BeforeClass
    public static void beforeClass(){
        kieContainer=KnowledgeSessionHelper.createRuleBase();
    }
    
    @Before
	public void setUp() {
		//System.out.println("---------------Initiating the test sequence-------------");
	}
	
	@After
	public void tearDown() {
		//System.out.println("---------------Test Sequence Completed------------------");
		
	}
	
	@Test
	public void testADR() {
		sessionStatefull = KnowledgeSessionHelper.getStatefullKnowledgeSession(kieContainer, "ksession");
		MonthlyHotelPerf monthlyHotelPerf1 = new MonthlyHotelPerf(1, 3400);
		MonthlyHotelPerf monthlyHotelPerf2 = new MonthlyHotelPerf(2, 1900);
		MonthlyHotelPerf monthlyHotelPerf3 = new MonthlyHotelPerf(3, 1000);
		DailyHotelPerf dailyHotelPerf1 = new DailyHotelPerf(1, 2, 35, 1800, -30);
		DailyHotelPerf dailyHotelPerf2 = new DailyHotelPerf(2, 1, 135, 3500, 45);
		DailyHotelPerf dailyHotelPerf3 = new DailyHotelPerf(3, 2, -25, 1500, 125);
		DailyHotelPerf dailyHotelPerf4 = new DailyHotelPerf(4, 3, -15, 1200, 85);
		Thresholds thresholds = new Thresholds(-20, 100, -30, 90, 1200, 5000, -25, 95, 0, 100, 20);
		sessionStatefull.insert(thresholds);
		sessionStatefull.insert(monthlyHotelPerf1);
		sessionStatefull.insert(monthlyHotelPerf2);
		sessionStatefull.insert(monthlyHotelPerf3);
		sessionStatefull.insert(dailyHotelPerf1);
		sessionStatefull.insert(dailyHotelPerf2);
		sessionStatefull.insert(dailyHotelPerf3);
		sessionStatefull.insert(dailyHotelPerf4);
		sessionStatefull.fireAllRules();
		sessionStatefull.dispose();
	}
	
	@Test
	public void runAllTests() {
		sessionStatefull = KnowledgeSessionHelper.getStatefullKnowledgeSession(kieContainer, "ksession");
		Thresholds thresholds = new Thresholds(-20, 100, -30, 90, 1200, 5000, -25, 100, 10, 70, 20);
		sessionStatefull.insert(thresholds);
		
		List<HotelData> hotelDataList = populateHotelData();
		for(HotelData hotelData: hotelDataList) {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Runnings Tests for Hotel:"+hotelData.getHolidexCode());
			sessionStatefull.insert(hotelData);
			sessionStatefull.fireAllRules();
			System.out.println("Total Exceptions: "+hotelData.getTotalExceptions());
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	protected List<HotelData> populateHotelData(){
		List<HotelData> hotelDataList = new ArrayList<HotelData>();
		
		MonthlyHotelPerf monthlyHotelPerf1 = new MonthlyHotelPerf(1, 1500, 75, 1800, 2200, 2000, 95, -5);
		MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf1 = new MonthlyHtlRateCtgyPerf(1, 2000, 1800, "ATCLP");
		DailyHotelPerf dailyHotelPerf1 = new DailyHotelPerf(1, 3, 175, 2500, 85);
		HotelData hotelData1 = new HotelData(dailyHotelPerf1, monthlyHotelPerf1, monthlyHtlRateCtgyPerf1, "ATCLP");
		hotelDataList.add(hotelData1);
		
		MonthlyHotelPerf monthlyHotelPerf2 = new MonthlyHotelPerf(1, 1500, 95, 1100, 2200, 2000, 95, 65);
		MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf2 = new MonthlyHtlRateCtgyPerf(1, 2000, 1800, "IVANI");
		DailyHotelPerf dailyHotelPerf2 = new DailyHotelPerf(1, 3, -10, 2500, 15);
		HotelData hotelData2 = new HotelData(dailyHotelPerf2, monthlyHotelPerf2, monthlyHtlRateCtgyPerf2, "ABEDP");
		hotelDataList.add(hotelData2);
		
		MonthlyHotelPerf monthlyHotelPerf3 = new MonthlyHotelPerf(1, 1500, 75, 1800, 2200, 2000, 110, 65);
		MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf3 = new MonthlyHtlRateCtgyPerf(1, 2000, 1800, "IVCFN");
		DailyHotelPerf dailyHotelPerf3 = new DailyHotelPerf(1, 3, 175, 2500, 85);
		HotelData hotelData3 = new HotelData(dailyHotelPerf3, monthlyHotelPerf3, monthlyHtlRateCtgyPerf3, "PBIEX");
		hotelDataList.add(hotelData3);
		
		MonthlyHotelPerf monthlyHotelPerf4 = new MonthlyHotelPerf(1, 1500, -75, 1100, 2200, 2000, 195, 125);
		MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf4 = new MonthlyHtlRateCtgyPerf(1, 2000, 1800, "PCOFL");
		DailyHotelPerf dailyHotelPerf4 = new DailyHotelPerf(1, 3, -45, 2500, 15);
		HotelData hotelData4 = new HotelData(dailyHotelPerf4, monthlyHotelPerf4, monthlyHtlRateCtgyPerf4, "PCOFL");
		hotelDataList.add(hotelData4);
		
		MonthlyHotelPerf monthlyHotelPerf5 = new MonthlyHotelPerf(1, 1500, 75, 1800, 2200, 2000, 95, 65);
		MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf5 = new MonthlyHtlRateCtgyPerf(1, 2000, 1800, "TOCCV");
		DailyHotelPerf dailyHotelPerf5 = new DailyHotelPerf(1, 3, 20, 2500, 15);
		HotelData hotelData5 = new HotelData(dailyHotelPerf5, monthlyHotelPerf5, monthlyHtlRateCtgyPerf5, "TOCCV");
		hotelDataList.add(hotelData5);
		
		MonthlyHotelPerf monthlyHotelPerf6 = new MonthlyHotelPerf(1, 1500, 75, 1800, 2200, 2000, 115, 65);
		MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf6 = new MonthlyHtlRateCtgyPerf(1, 2000, 1800, "IVANI");
		DailyHotelPerf dailyHotelPerf6 = new DailyHotelPerf(1, 3, 175, 2500, 85);
		HotelData hotelData6 = new HotelData(dailyHotelPerf6, monthlyHotelPerf6, monthlyHtlRateCtgyPerf6, "ZZWFF");
		hotelDataList.add(hotelData6);
		
		return hotelDataList;
	}

}
