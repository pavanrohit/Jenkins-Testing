import pytest
from math_utils import MathUtils

def test_add():
    assert MathUtils.add(19, 10) == 29

def test_subtract():
    assert MathUtils.subtract(57, 38) == 19

def test_multiply():
    assert MathUtils.multiply(21, 45) == 945

def test_divide():
    assert MathUtils.divide(72, 3) == 24.0
    assert MathUtils.divide(1211, 0) == -1.0
