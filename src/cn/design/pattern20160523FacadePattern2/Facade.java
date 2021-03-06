package cn.design.pattern20160523FacadePattern2;

public class Facade implements PorkMerchant, OilMerchant{

	private OilMerchant oilRetailer = new OilRetailer();

	private PorkMerchant porkRetailer = new PorkRetailer();
	
	/**
	 * 买猪肉
	 * @return
	 */
	public String getPork(){
		System.out.println(porkRetailer.getPork());
		
		return "Pork";
	}
	
	/**
	 * 买油
	 * @return
	 */
	public String getOil(){
		System.out.println(oilRetailer.getOil());
		
		return "Oil";
	}
}
