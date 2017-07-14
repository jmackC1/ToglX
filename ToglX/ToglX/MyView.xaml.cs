using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;
using System.Diagnostics;
using C1.Xamarin.Forms;
using C1.Xamarin.Forms.Grid;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;


namespace ToglX
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class MyView : TabbedPage
    {
        
        public MyView()
        {
            InitializeComponent();
        }

        private void Button_Clicked(object sender, EventArgs e)
        {
            
            DisplayAlert("Confirm Entry for ", descEntry.Text + "?", "OK");
        }

        private void btnTime_Clicked(object sender, EventArgs e)
        {
            Stopwatch stopWatch = new Stopwatch();
            if (stopWatch.IsRunning == false)
            {
                stopWatch.Start();
                TimeSpan ts = stopWatch.Elapsed;
                string elapsedTime = string.Format("{0:00}:{1:00}",
                    ts.Hours, ts.Minutes / 10);
                lblTime.Text = elapsedTime;
            }
            else {
                btnTime.Text = "STOP TIMER";
                stopWatch.Stop();
                lblTime.IsVisible = true;
            }
        }
    }
}
