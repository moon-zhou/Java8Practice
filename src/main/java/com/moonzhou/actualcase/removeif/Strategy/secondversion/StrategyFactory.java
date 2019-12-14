package com.moonzhou.actualcase.removeif.Strategy.secondversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrategyFactory {

    private Map<String, DiscountStrategy> strategyMap;

    public StrategyFactory() {

        List<DiscountStrategy> strategies = new ArrayList<>();

        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());

        // 看这里 看这里 看这里！
        strategyMap = strategies.stream().collect(Collectors.toMap(DiscountStrategy::getUserTypeCode, strategy -> strategy));
        
        /* 等同上面
        strategyMap = new HashMap<>();
        for (Strategy strategy : strategies) {
            strategyMap.put(strategy.getType(), strategy);
        }*/
    }

    public static class Holder {
        public static StrategyFactory instance = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    public DiscountStrategy get(String userType) {
        return strategyMap.get(userType);
    }
}