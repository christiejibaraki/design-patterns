from decorator.starbuzz.decorator_pattern import *

concrete_beverage = Espresso();
print(concrete_beverage.get_description());
concrete_mocha_decorator = Mocha(beverage=concrete_beverage)
concrete_mocha_decorator = Whip(concrete_mocha_decorator)
print(concrete_mocha_decorator.get_description() + ' $' + str(concrete_mocha_decorator.cost()))

concrete_beverage_house = HouseBlend()
house_with_whip = Whip(concrete_beverage_house)
print(house_with_whip.get_description() + ' $' + str(house_with_whip.cost()))