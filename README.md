# Stock Trading Platform

This project implements a **modular stock trading platform** in Java, designed with clean object-oriented principles. The system supports order types (Market, Limit, Stop-Loss), account management, stock watchlists, and execution tracking via a stock exchange simulation.

**Design Reference:**  
Based on a UML design that captures core functionality of retail trading systems.

---

## Key Components and Interacting Objects

| Class / Interface         | Responsibility                                                                 |
|---------------------------|---------------------------------------------------------------------------------|
| `Stock`, `StockPosition`  | Represents market-traded stocks and user-owned holdings                        |
| `Account`, `AccountStatus`, `Location` | Models users and their watchlists, contact info, and account state          |
| `WatchList`               | Tracks a personalized list of stocks for each account                          |
| `Order` (abstract)        | Base for all order types. Includes fields like symbol, quantity, and status    |
| `MarketOrder`, `LimitOrder`, `StopLossOrder` | Concrete order types with different execution logic                |
| `OrderPart`               | Represents a partial fill or chunked execution of a large order                |
| `StockExchange`           | Simulates real-time stock prices and executes orders                           |
| `AccountStatement`        | Maintains records of trades and updated positions for reporting                |

---

## Class Hierarchy and Structure

```
Order (abstract)
   ├── MarketOrder
   ├── LimitOrder
   └── StopLossOrder

Account
   ├── List<WatchList>
   ├── List<StockPosition>
   └── AccountStatement

StockExchange
   ├── getPrice(String symbol)
   ├── placeOrder(String symbol, quantity, price)

AccountStatement
   ├── List<Order>
   ├── List<StockPosition>
   └── addOrder(), updatePosition()
```

---

## Supported Functionalities

1. **Create User Accounts**  
   Users can register with name, contact details, and maintain watchlists.

2. **Track Stocks and Prices**  
   Each user can follow stock tickers and access current prices through `StockExchange`.

3. **Place Orders**  
   Users can place:
   - Market Orders (immediate execution at market price)
   - Limit Orders (only if price is within limit)
   - Stop-Loss Orders (triggers if price drops below threshold)

4. **Execute Trades and Track Positions**  
   Orders are routed to the `StockExchange`. Executed trades update account statements and stock positions.

5. **Partial Orders**  
   The system can represent orders filled in parts using the `OrderPart` class.

6. **View Account Statement**  
   Users can view order history and current stock holdings.

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/stock-trading-platform.git
   ```

2. Navigate into the project directory:
   ```bash
   cd stock-trading-platform
   ```

3. Open the project in your Java IDE (e.g., IntelliJ IDEA, Eclipse)

4. Compile and run the system.  
   Ensure your environment supports **Java 8+**

---

## Project Structure

| Folder / Package         | Responsibility                                         |
|--------------------------|---------------------------------------------------------|
| `model/account`          | Account, WatchList, AccountStatus, Location             |
| `model/market`           | Stock, StockPosition, StockExchange                     |
| `model/order`            | Order base class and its subclasses                     |
| `model/statement`        | AccountStatement, OrderPart                             |

---

## File Implementation Order

OrderStatus → Stock → StockPosition → WatchList → Account → AccountStatus → Location → Order → MarketOrder → StockExchange → LimitOrder → StopLossOrder → OrderPart → AccountStatement


