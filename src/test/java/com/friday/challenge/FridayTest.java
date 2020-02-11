package com.friday.challenge;

import com.friday.challenge.model.Vehicle;
import com.friday.challenge.pages.SelectPreconditionPage;
import core.base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FridayTest extends BaseTest {

    @Test (dataProvider = "testVehicleSelectionDataProvider")
    public void testVehicleSelection(Vehicle vehicle) {
        String expectedWizardTitle = "Wann wurdest du geboren?";
        String firstRegistrationData = "02.2004";
        String ownerRegistrationData = "04.2011";
        String actualWizardTitle = openNewPage(SelectPreconditionPage.class)
                .validateIsRightPage()
                .clickNextButton()
                .validateIsRightPage()
                .clickNextButton()
                .validateIsRightPage()
                .selectBrand(vehicle.getBrand())
                .validateIsRightPage()
                .selectModel(vehicle.getModel())
                .validateIsRightPage()
                .selectBodyType(vehicle.getBodyType())
                .validateIsRightPage()
                .selectFuelType(vehicle.getFuelType())
                .validateIsRightPage()
                .selectEnginePower(vehicle.getEnginePower())
                .validateIsRightPage()
                .selectEngine(vehicle.getEngine())
                .validateIsRightPage()
                .enterFirstRegistrationData(firstRegistrationData)
                .clickNextButton()
                .getWizardTitle();
        Assert.assertEquals(actualWizardTitle, expectedWizardTitle, "Mismatch wizard title");
    }

    @DataProvider
    public static Object[][] testVehicleSelectionDataProvider() {
        return new Object[][] {
                {new Vehicle("VW", "Caddy", "Kasten", "Benzin", "75 kW / 102 PS", "CADDY 1.0")},
                {new Vehicle("VW", "Polo", "Limousine", "Diesel", "59 kW / 80 PS", "POLO IV 1.4 TDI")},
                {new Vehicle("VW", "The Beetle", "Cabrio", "Benzin", "162 kW / 220 PS", "BEETLE CABRIO 2.0 TSI")},

                {new Vehicle("AUDI", "A3", "Kombi", "Diesel", "110 kW / 150 PS", "A3 2.0 TDI")},
                {new Vehicle("AUDI", "A5", "Coupe", "Benzin", "130 kW / 177 PS", "A5 SPORTBACK 1.8 TFSI")},
                {new Vehicle("AUDI", "Audi TT", "Roadster", "Benzin", "147 kW / 200 PS", "AUDI TT 2.0 TFSI QUATTRO ROADSTER")},

                {new Vehicle("PEUGEOT", "206", "Limousine", "Diesel", "66 kW / 90 PS", "206 HDI")},
                {new Vehicle("PEUGEOT", "Boxer", "Hochr.Kasten", "Diesel", "116 kW / 158 PS", "BOXER 3.0 HDI")},
                {new Vehicle("PEUGEOT", "J 5", "Kombi", "Benzin", "55 kW / 75 PS", "J5 KOMBI,SUPER, LUXE, KOMBI-KLEINBUS")},
        };
    }

}
