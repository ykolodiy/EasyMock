package firstprogram;
import java.util.List;
import java.util.ArrayList;

public class Portfolio {
   private StockService stockService;
   private List stocks;

   public StockService getStockService() {
      return stockService;
   }
   
   public void setStockService(StockService stockService) {
      this.stockService = stockService;
   }

   public List getStocks() {
      return stocks;
   }

   public void setStocks(List stocks) {
      this.stocks = stocks;
   }

   public double getMarketValue(){
      double marketValue = 0.0;
      
      for(Stock stock:stocks){
         marketValue += stockService.getPrice(stock) * stock.getQuantity();
      }
      return marketValue;
   }
}
