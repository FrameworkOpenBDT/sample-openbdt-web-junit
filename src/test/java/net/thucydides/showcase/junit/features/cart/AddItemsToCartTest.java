package net.thucydides.showcase.junit.features.cart;

import org.junit.Test;

import io.openbdt.support.Feature;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.junit.model.ListingItem;
import net.thucydides.showcase.junit.steps.serenity.BuyerSteps;

public class AddItemsToCartTest extends Feature{

    @Steps
    BuyerSteps buyer;

    @Test
    public void add_item_to_cart() {
        // GIVEN
        buyer.opens_home_page();
        buyer.searches_by_keyword("docking station");
        buyer.filters_by_local_region();

        // WHEN
        ListingItem selectedItem = buyer.selects_listing(2);
        buyer.adds_current_listing_to_cart();

        // THEN
        buyer.should_see_item_in_cart(selectedItem);
        buyer.should_see_total_including_shipping_for(selectedItem);
    }
}

