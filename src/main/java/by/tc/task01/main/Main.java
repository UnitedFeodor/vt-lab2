package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

/**
 * Main class of a console program
 */
public class Main {

	/**
	 * Main method
	 * @param args console arguments
	 */
	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 3);

		appliance = service.find(criteriaOven);
		Laptop app = new Laptop();
		app.batteryCapacity = 0.6;

		PrintApplianceInfo.print(app);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaSpeaker = new Criteria(Speakers.class.getSimpleName());
		criteriaSpeaker.add(Speakers.POWER_CONSUMPTION.toString(), 20);

		appliance = service.find(criteriaSpeaker);

		PrintApplianceInfo.print(appliance);


	}

}
