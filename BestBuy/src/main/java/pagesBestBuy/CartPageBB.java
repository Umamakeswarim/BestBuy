package pagesBestBuy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseBestBuy.BaseClassBB;

public class CartPageBB extends BaseClassBB {
	
	@FindBy(xpath="//a[contains(text(),'Razer - BlackShark V2 X Wired Gaming Headset for PC, PS5, PS4, Switch, Xbox X|S, and Xbox One - Black')]")
	WebElement logitechMouseAddedInCart;
	
	@FindBy(xpath="//a[contains(text(),'Sony - 75\" Class BRAVIA XR X90K 4K HDR Full Array LED Google TV')]")
	WebElement sony75InchTvAddedInCart;
	
	@FindBy(xpath="//a[contains(text(),'Lenovo - ThinkPad E15')]")
	WebElement lenovoThinkPadAddedInCart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkOutInCart;
	
	public CartPageBB() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLogitechMouseInCart() {
		return extractText(razarheadsetAddedInCart);
	}
	
	public String validateSonyTvInCart() {
		return extractText(sony75InchTvAddedInCart);
	}
	
	public String validateLenovoThinkPadInCart() {
		return extractText(lenovoThinkPadAddedInCart);
	}
	
	public void goToCheckOutPage() {
		clickOn(checkOutInCart);
	}
	
}
