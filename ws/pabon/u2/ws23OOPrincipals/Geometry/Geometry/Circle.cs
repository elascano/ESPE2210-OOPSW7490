﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry
{
    class Circle : IShape
    {
        public double Radius { get; set; }

        public Circle(double radius)
        {
            Radius = radius;
        }
        public double CalculateArea()
        {
            return Math.PI * Math.Pow(Radius, 2);
        }
        public double CalculatePerimeter()
        {
            return 2 * Math.PI * Radius;
        }

    }
}
