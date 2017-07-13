using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
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
    }
}
