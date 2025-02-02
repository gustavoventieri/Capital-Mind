package gustavo.ventieri.capitalmind.infrastructure.clients.coinGecko;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(
    name = "CoinGeckoClient",
    url = "https://api.coingecko.com"
)
public interface CoindGeckoApi {
    
    @GetMapping(value = "/api/v3/simple/price")
    Object getPrice(@RequestParam("ids") String id, @RequestParam("vs_currencies") String currency);


}
