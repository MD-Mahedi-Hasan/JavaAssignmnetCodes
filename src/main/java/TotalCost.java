//20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
// If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
// [Extract the digits from the paragraph and calculate the price]

public class TotalCost {
        public static void main(String[] args) {
            // Prices in tk
            int laptopPrice = 85000;
            int mousePrice = 2500;

            double discountPercentage = 15;

            double totalCost = (laptopPrice + mousePrice) * (1 - discountPercentage/100);

            int totalCostDigits = (int) totalCost;

            System.out.println("Total cost after 15% discount: " + totalCostDigits + " tk");
        }
}
